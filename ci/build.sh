#!/bin/sh

set -e -x

cd source-code
  ./mvnw clean package
cd ..

cp source-code/target/*.jar  build-output/