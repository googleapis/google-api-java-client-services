#  Copyright 2018 Google LLC
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

from datetime import date
from glob import glob
import os
from pathlib import Path
from shutil import copyfile
from xml.etree import ElementTree as ET

import attr
from synthtool import log
from synthtool.sources import templates

TEMPLATE_VERSIONS = ["1.26.0", "1.27.0"]
ROOT_DIR = Path(os.path.abspath(".."))


@attr.s(auto_attribs=True)
class ApiClient:
    artifact_id: str = None
    version: str = None

    @staticmethod
    def load_from_pom(pom: Path):
        tree = ET.parse(str(pom))
        root = tree.getroot()
        artifact_id = root.find("{http://maven.apache.org/POM/4.0.0}artifactId")
        version = root.find("{http://maven.apache.org/POM/4.0.0}version")

        return ApiClient(artifact_id=artifact_id.text, version=version.text)


generator = templates.Templates("./templates")
today = date.today().strftime("%Y%m%d")

for template in TEMPLATE_VERSIONS:
    log.info(f"\t{template}")

    clients = [
        ApiClient.load_from_pom(pom)
        for pom in glob(str(ROOT_DIR / "clients" / template / "*/*/pom.xml"))
    ]
    version = f"rev{today}-{template}"
    output = generator.render("pom.xml", clients=clients, version=version)
    copyfile(output, ROOT_DIR / "bom" / template / "pom.xml")
