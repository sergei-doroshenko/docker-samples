### Build and Deploy Selenium web-driver with Chrome
jersey-selenium directory contains a sample REST projects powered by Jersey

1. Build Docker image:  
docker build -t sdoroshenko/tomcat7-chrome .

2. Run build.bat or build.sh from tomcat7-chrome directory

3. Run Docker image with project directory mounted:  
docker run -it --rm -v c:/Users/Sergei_Doroshenko/IdeaProjects/docker-samples/tomcat7-chrome/project:/project sdoroshenko/tomcat7-chrome