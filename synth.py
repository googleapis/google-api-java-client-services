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
from typing import List

logging.basicConfig(level=logging.DEBUG)

TEMPLATE_VERSIONS = [
    "1.28.0",
    "1.29.2",
    "1.30.1",
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

def write_metadata_file(name: str, version: str, metadata: dict):
    metadata_file = f'clients/{name}/{version}.metadata.json'
    print(f"Writing json metadata to {metadata_file}")
    metadata = {
        "maven": metadata
    }
    with open(metadata_file, "w") as outfile:
        json.dump(metadata, outfile, indent=2)

def write_readme_file(name: str, version: str, metadata: dict):
    readme_file = f'clients/{name}/{version}/README.md'
    print(f"Writing README to {readme_file}")
    with open(readme_file, "w") as outfile:
        outfile.write("FIXME")

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

    m = re.search(r"(.*)\.(.+)\.json$", disco)
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

        s.copy(output_dir, f"clients/{library_name}/{version}/{template}")

        resource_dir = repository / "clients" / library_name / version / template / "resources"
        shell.run(f"mkdir -p {resource_dir}".split())
        shutil.copy(input_file, resource_dir / path.basename(disco))

    # write the metadata file
    latest_version = TEMPLATE_VERSIONS[-1]
    metadata = maven_metadata(str(repository / "clients" / library_name / version / latest_version / "pom.xml"))
    write_metadata_file(library_name, version, metadata)

    # copy the latest README to the main service location
    shutil.copy(
        repository / "clients" / library_name / version / latest_version / "README.md",
        repository / "clients" / library_name / version / "README.md"
    )

def all_discoveries():
    discos = []
    for file in glob.glob(str(discovery / 'discoveries/*.*.json')):
        discos.append(path.basename(file))

    return discos

class Service:
    id: str = None
    title: str = None
    version: str = None

    def __init__(self, discovery_path: str):
        match = re.match(r'^([^\.]*)\.(.*)\.json$', path.basename(discovery_path))
        if match is not None:
          self.id = match[1]
          self.version = match[2]

          with open(discovery_path, "r") as f:
              data = json.load(f)
              self.title = data["title"]
        else:
            print(path.basename(discovery_path))

def all_services():
    services = []
    for file in glob.glob(str(discovery / 'discoveries/*.*.json')):
        match = re.match(r'^([^\.]*)\.(.*)\.json$', path.basename(file))
        service = Service(file)
        services.append(service)

    return services

def service_row(services: List[Service]) -> str:
  services = sorted(services, key=lambda service: service.version)
  links = [f"[{service.version}](clients/google-api-services-{service.id}/{service.version})" for service in services]
  link = ", ".join(links)
  name = services[0].title
  return f"| {name} | {link} |\n"

def replace_content_in_readme(content_rows: List[str]) -> None:
    START_MARKER = "[//]: # (API_TABLE_START)"
    END_MARKER = "[//]: # (API_TABLE_END)"
    newlines = []
    repl_open = False
    with open("README.md", "r") as f:
        for line in f:
            if not repl_open:
                newlines.append(line)

            if line.startswith(START_MARKER):
                repl_open = True
                newlines = newlines + content_rows
            elif line.startswith(END_MARKER):
                newlines.append("\n")
                newlines.append(line)
                repl_open = False

    with open("README.md", "w") as f:
        for line in newlines:
            f.write(line)

def generate_service_list():
    services = all_services()
    services_by_name = {}
    for service in services:
        if service.title is None:
            print(service.id)

        if service.title not in services_by_name:
            services_by_name[service.title] = []

        services_by_name[service.title].append(service)

    content_rows = [
        "\n",
        "| API | Versions |\n",
        "| --- | -------- |\n",
    ]

    # print(services_by_name.keys())
    content_rows += [service_row(services_by_name[name])
        for name in sorted(services_by_name.keys())]

    replace_content_in_readme(content_rows)

def generate_services(services):
    for service in services:
        generate_service(service)

if extra_args():
    api_name = extra_args()[0]
    if api_name == "README":
        generate_service_list()
    else:
        discoveries = all_discoveries()
        discoveries = [discovery for discovery in discoveries if discovery.startswith(api_name)]
        generate_services(discoveries)
else:
    discoveries = all_discoveries()
    generate_services(discoveries)
