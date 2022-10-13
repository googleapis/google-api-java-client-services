#!/bin/bash

source $(dirname "$0")/common.sh
pushd $(dirname "$0")/../

create_settings_xml_file "settings.xml"

pwd

# install docuploader package
python2 -m pip install generator/ --user --require-hashes -r .kokoro/requirements.txt
