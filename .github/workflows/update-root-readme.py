# Copyright 2024 Google LLC
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



from os import path, remove, getcwd
from pathlib import Path
import glob
import re
import sys
from typing import List
from absl import app
import json
from git import Repo
import shutil
from lxml import etree


# global vars
VERSION_REGEX = r"([^\.]*)\.(.+)\.json$"
SCRIPT_DIR = Path(path.dirname(path.realpath(__file__)))
REPO_DIR = Path(str(SCRIPT_DIR / '..' / '..'))
DISCOVERY_REPO_PATH = Path(path.abspath(path.join(getcwd(), './discovery-artifact-manager')))
LATEST_VERSION = '2.0.0'
_discovery_repo = None


def remove_discovery_repo():
    if path.isdir(DISCOVERY_REPO_PATH):
        shutil.rmtree(DISCOVERY_REPO_PATH)

def clone_discovery_repo():
    global _discovery_repo
    # remove previously downloaded repo if exists
    remove_discovery_repo()
    discovery_repo_url = "https://github.com/googleapis/discovery-artifact-manager.git"
    print(f"Cloning {discovery_repo_url}.")
    # we clone with depth 1 because we only need the latest commit contents without history
    _discovery_repo = Repo.clone_from(discovery_repo_url, DISCOVERY_REPO_PATH, depth=1)


class Service:
    id: str = None
    title: str = None
    version: str = None

    def __init__(self, discovery_path: str):
        match = re.match(VERSION_REGEX, path.basename(discovery_path))
        if match is not None:
            self.id = match[1]
            self.version = match[2]

            with open(discovery_path, "r") as f:
                data = json.load(f)
                self.title = data["title"]
        else:
            print(path.basename(discovery_path))


def service_row(services: List[Service]) -> str:
    services = sorted(services, key=lambda service: service.version)
    links = [
        f"[{service.version}](clients/google-api-services-{service.id}/{service.version})"
        for service in services
    ]
    link = ", ".join(links)
    name = services[0].title
    return f"| {name} | {link} |\n"


def replace_content_in_readme(content_rows: List[str]) -> None:
    START_MARKER = "[//]: # (API_TABLE_START)"
    END_MARKER = "[//]: # (API_TABLE_END)"
    newlines = []
    repl_open = False
    readme_path = str(REPO_DIR / 'README.md')
    with open(readme_path, "r") as f:
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

    with open(readme_path, "w") as f:
        for line in newlines:
            f.write(line)


def generate_service_list(services: List[Service]) -> None:
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
    content_rows += [
        service_row(services_by_name[name]) for name in sorted(services_by_name.keys())
    ]

    replace_content_in_readme(content_rows)

def all_services():
    services = []
    for file in glob.glob(str(DISCOVERY_REPO_PATH / "discoveries/*.*.json")):
        match = re.match(VERSION_REGEX, path.basename(file))
        service = Service(file)
        services.append(service)

    return services

def maven_metadata(pom_file: str):
    if not path.isfile(pom_file):
        print(f'skipping {pom_file} because it doesn\'t exist')
        return None
    tree = etree.parse(pom_file)
    root = tree.getroot()
    version = root.find("{http://maven.apache.org/POM/4.0.0}version").text
    group_id = root.find("{http://maven.apache.org/POM/4.0.0}groupId").text
    artifact_id = root.find("{http://maven.apache.org/POM/4.0.0}artifactId").text
    return {"groupId": group_id, "artifactId": artifact_id, "version": version}

def write_metadata_file(name: str, version: str, metadata: dict):
    metadata_file = path.join(REPO_DIR, "clients", name, f'{version}.metadata.json')
    print(f"Writing json metadata to {metadata_file}")
    metadata = {"maven": metadata}
    with open(metadata_file, "w+") as outfile:
        json.dump(metadata, outfile, indent=2)

def generate_metadata_file(service: list[Service]):
    library_name = f'google-api-services-{service.id}'
    metadata = maven_metadata(
        path.join(REPO_DIR, "clients", library_name, service.version, LATEST_VERSION, "pom.xml")
    )
    if metadata is not None:
        write_metadata_file(library_name, service.version, metadata)

def main(argv: List[str]) -> None:
    if len(argv) > 1:
        print('update-root-readme.py takes no arguments')
        exit(1)
    clone_discovery_repo()
    services = all_services()
    generate_service_list(services)
    for service in services:
        generate_metadata_file(service)
    remove_discovery_repo()


if __name__ == "__main__":
  app.run(main)
