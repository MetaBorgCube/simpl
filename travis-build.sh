#!/bin/bash
set -ev
cd $TRAVIS_BUILD_DIR/simpl
mvn -Pstandalone install
cd $TRAVIS_BUILD_DIR/simpl.interpreter
mvn test
