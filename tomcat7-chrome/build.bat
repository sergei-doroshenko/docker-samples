cd ..\jersey-selenium
mvn clean install
xcopy /F target\jersey-selenium-1.0-SNAPSHOT.war ..\tomcat7-chrome\project /Y
cd tomcat7-chrome