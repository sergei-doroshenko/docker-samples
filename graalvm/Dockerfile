# docker image rm -f sdoroshenko/graal-native-image:19.0.0
# docker build -t sdoroshenko/graal-native-image:19.0.0 .
#
# in case if bash installed and enabled:
# docker run -it --rm -v c:/Users/Sergei_Doroshenko/IdeaProjects/docker-samples/graalvm/project:/project sdoroshenko/graal-native-image:19.0.0
# native-image --static --verbose -cp . HelloWorld hello_app
# 
# in case if entry point native-image:
# docker run -it --rm -v c:/Users/Sergei_Doroshenko/IdeaProjects/docker-samples/graalvm/project:/project sdoroshenko/graal-native-image:19.0.0 "--static" "-H:Name=out" "HelloWorld"
#
FROM oracle/graalvm-ce:19.0.0
RUN gu install native-image
#RUN yum install -y bash

VOLUME /project
WORKDIR /project

ENTRYPOINT ["native-image"]
#CMD bash