#!/usr/bin/env bash
cp jersey-selenium-1.0-SNAPSHOT.war /usr/local/tomcat/webapps
/usr/local/tomcat/bin/startup.sh && curl http://localhost:8080/jersey-selenium-1.0-SNAPSHOT/selenium/ctofservice/105
