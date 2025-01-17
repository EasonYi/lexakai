#!/bin/bash

#///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
#
#  © 2011-2021 Telenav, Inc.
#  Licensed under Apache License, Version 2.0
#
#///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

source library-functions.sh
source lexakai-projects.sh

help="[version]"

version=$1

require_variable version "$help"

git_flow_release_finish $LEXAKAI_ANNOTATIONS_HOME $version
git_flow_release_finish $LEXAKAI_HOME $version
