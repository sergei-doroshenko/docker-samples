#!/usr/bin/env bash
cd ../jersey-selenium
mvn clean install
cp ./target/jersey-selenium-1.0-SNAPSHOT.war ../tomcat7-chrome/project
cd tomcat7-chrome
