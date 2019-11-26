# docker build -t sdoroshenko/tomcat7-chrome .
# docker image rm -f sdoroshenko/tomcat7-chrome
# docker run -it --rm -v c:/Users/Sergei_Doroshenko/IdeaProjects/docker-samples/tomcat7-chrome/project:/project sdoroshenko/tomcat7-chrome
#
FROM tomcat:7.0.93-jre8

RUN wget https://github.com/yarnpkg/yarn/releases/download/v1.7.0/yarn_1.7.0_all.deb && dpkg -i yarn_1.7.0_all.deb && rm -f yarn_1.7.0_all.deb
RUN wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb && dpkg -i google-chrome-stable_current_amd64.deb; apt-get -fy install

ENV PATH "$PATH:/opt/google/chrome/chrome"
RUN echo $PATH

VOLUME /project
WORKDIR /project

CMD bash