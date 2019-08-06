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
import re
from typing import List

logging.basicConfig(level=logging.DEBUG)

discovery_url = "https://github.com/googleapis/discovery-artifact-manager.git"

log.debug(f"Cloning {discovery_url}.")
discovery = git.clone(discovery_url, depth=1)

class Service:
    id: str = None
    title: str = None
    version: str = None

    def __init__(self, discovery_path: str):
        match = re.match(r'^([^\.]*)\.(v.*)\.json$', path.basename(discovery_path))
        if match is not None:
          self.id = match[1]
          self.version = match[2]

          with open(discovery_path, "r") as f:
              data = json.load(f)
              self.title = data["title"]

def all_services():
    services = []
    for file in glob.glob(str(discovery / 'discoveries/*.v*.json')):
        match = re.match(r'^([^\.]*)\.(v.*)\.json$', path.basename(file))
        service = Service(file)
        services.append(service)

    return services

def service_row(services: List[Service]) -> str:
  services = sorted(services, key=lambda service: service.id)
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
                newlines.append(line)
                repl_open = False

    with open("README.md", "w") as f:
        for line in newlines:
            f.write(line)


def main():
    services = all_services()
    services_by_name = {}
    for service in services:
        if service.title not in services_by_name:
            services_by_name[service.title] = []

        services_by_name[service.title].append(service)

    content_rows = [
      "| API | Versions |\n",
      "| --- | -------- |\n",
    ]

    content_rows += [service_row(services_by_name[name])
        for name in sorted(services_by_name.keys())]

    replace_content_in_readme(content_rows)

main()