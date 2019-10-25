# On Windows work in cmd under Admin, possible via bash
# docker build -t sdoroshenko/alpine-async-profiler .
# docker run -it --rm -v c:/Users/Sergei_Doroshenko/IdeaProjects/docker-samples/graalvm/project:/project sdoroshenko/alpine
# docker run -it --rm sdoroshenko/alpine-async-profiler
#
# ^M is a carriage return character. Linux uses the line feed character to mark the end of a line
#
FROM alpine:3.9.4
RUN apk add --no-cache bash
VOLUME /project
#WORKDIR /project

COPY async-profiler-1.6-linux-x64.tar.gz /opt/
COPY start.sh /opt/

# ------------------------------------------------------------- Grant execution permissions
#RUN apt-get update && apt-get install unzip openjdk-8-dbg -y && chmod +x /opt/*.sh

#CMD ["sh", "/opt/start.sh"]
#CMD bash