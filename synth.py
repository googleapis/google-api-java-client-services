# Copyright 2018 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

"""This script is used to synthesize generated parts of this library."""

import synthtool as s
from synthtool.__main__ import extra_args
from synthtool import log, shell
from synthtool.sources import git
import logging
from os import path
from pathlib import Path
import glob
import json
from lxml import etree
import re
import sys
import shutil

logging.basicConfig(level=logging.DEBUG)

TEMPLATE_VERSIONS = [
    "1.26.0",
    "1.27.0",
    "1.28.0",
]
discovery_url = "https://github.com/googleapis/discovery-artifact-manager.git"

repository = Path('.')

log.debug(f"Cloning {discovery_url}.")
discovery = git.clone(discovery_url, depth=1)

log.debug("Cleaning output directory.")
shell.run("rm -rf .cache".split(), cwd=repository)

log.debug("Installing dependencies.")
shell.run(
    "python2 -m pip install -e generator/ --user".split(),
    cwd=repository
)


def dasherize(name: str):
    s1 = re.sub('(.)([A-Z][a-z]+)', r'\1-\2', name)
    return re.sub('([a-z0-9])([A-Z])', r'\1-\2', s1).lower()

def write_metadata_file(name: str, version: str, metadata: dict):
    metadata_file = f'clients/{name}/{version}.metadata.json'
    print(f"Writing json metadata to {metadata_file}")
    metadata = {
        "maven": metadata
    }
    with open(metadata_file, "w") as outfile:
        json.dump(metadata, outfile, indent=2)

def maven_metadata(pom_file: str):
    tree = etree.parse(pom_file)
    root = tree.getroot()
    version = root.find("{http://maven.apache.org/POM/4.0.0}version").text
    group_id = root.find("{http://maven.apache.org/POM/4.0.0}groupId").text
    artifact_id = root.find("{http://maven.apache.org/POM/4.0.0}artifactId").text
    return {
        "groupId": group_id,
        "artifactId": artifact_id,
        "version": version
    }

def generate_service(disco: str):

    m = re.search(r"(.*)\.(v.+)\.json$", disco)
    if m is None:
        log.info(f"Skipping {disco}.")
        return

    name = m.group(1)
    version = m.group(2)

    log.info(f"Generating {name} {version}.")

    library_name = f"google-api-services-{name}"
    output_dir = repository / ".cache" / library_name / version
    input_file = discovery / "discoveries" / disco

    for template in TEMPLATE_VERSIONS:
        log.info(f"\t{template}")

        command = (
            f"python2 -m googleapis.codegen --output_dir={output_dir}" +
            f" --input={input_file} --language=java --language_variant={template}" +
            f" --package_path=api/services"
        )

        shell.run(f"mkdir -p {output_dir}".split(), cwd=repository / "generator")
        shell.run(command.split(), cwd=repository, hide_output=False)

        s.copy(output_dir, f"clients/{library_name}/{template}/{version}")

        resource_dir = repository / "clients" / library_name / template / version / "resources"
        shell.run(f"mkdir -p {resource_dir}".split())
        shutil.copy(input_file, resource_dir / path.basename(disco))

    # write the metadata file
    metadata = maven_metadata(str(repository / "clients" / library_name / TEMPLATE_VERSIONS[-1] / version / "pom.xml"))
    write_metadata_file(library_name, version, metadata)



def all_discoveries():
    discos = []
    for file in glob.glob(str(discovery / 'discoveries/*.v*.json')):
        discos.append(path.basename(file))

    return discos


discoveries = all_discoveries()


if extra_args():
    api_name = extra_args()[0]
    discoveries = [discovery for discovery in discoveries if discovery.startswith(api_name)]

for disco in discoveries:
    generate_service(disco)
