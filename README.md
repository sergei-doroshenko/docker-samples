docker run -it -v HOST_CLASSPATH_DIRECTORY:/project -v HOST_RESULT_DIRECTORY:/target sdoroshenko/graal-native-image:19.0.0 "--static" "-H:Name=out" "MAIN_CLASS"

-it   Instructs Docker to allocate a pseudo-TTY connected to the container’s stdin; 
      creating an interactive bash shell in the container.
--rm	Automatically remove the container when it exits

docker image ls
docker container ls

docker exec -it graal /bin/bash