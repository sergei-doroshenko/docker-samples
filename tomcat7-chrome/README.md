### Build and Deploy Selenium web-driver with Chrome
jersey-selenium directory contains a sample REST projects powered by Jersey

1. Build Docker image:  
docker build -t sdoroshenko/tomcat7-chrome .

2. Run build.bat or build.sh from tomcat7-chrome directory

3. Run Docker image with project directory mounted:  
docker run -it --rm -p 8080:8080 -v c:/Users/Sergei_Doroshenko/IdeaProjects/docker-samples/tomcat7-chrome/project:/project sdoroshenko/tomcat7-chrome

Tomcat directory
/usr/local/tomcat/webapps

Copy web project to tomcat:
cp jersey-selenium-1.0-SNAPSHOT.war /usr/local/tomcat/webapps
/usr/local/tomcat/bin/startup.sh

To launch endpoint:  
curl http://localhost:8080/jersey-selenium-1.0-SNAPSHOT/selenium/ctofservice/105
curl http://localhost:8080/jersey-selenium-1.0-SNAPSHOT/selenium/ctofservice/selenium

