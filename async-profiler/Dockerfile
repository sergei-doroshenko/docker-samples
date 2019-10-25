# On Windows work in cmd under Admin, possible via bash
# docker build -t sdoroshenko/alpine .
# docker run -it --rm -v c:/Users/Sergei_Doroshenko/IdeaProjects/docker-samples/graalvm/project:/project sdoroshenko/alpine
# 
# ^M is a carriage return character. Linux uses the line feed character to mark the end of a line
#
FROM alpine:3.9.4
RUN apk add --no-cache bash
VOLUME /project
#WORKDIR /project

COPY start.sh /opt/

# Grant execution permissions
RUN chmod +x /opt/start.sh
CMD ["sh", "/opt/start.sh"]
#CMD bash