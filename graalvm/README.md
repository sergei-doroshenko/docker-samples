docker run -it -rm -v HOST_CLASSPATH_DIRECTORY:/project -v HOST_RESULT_DIRECTORY:/target sdoroshenko/graal-native-image:19.0.0 "--static" "-H:Name=out" "MAIN_CLASS"

-it   Instructs Docker to allocate a pseudo-TTY connected to the container’s stdin; 
      creating an interactive bash shell in the container.
--rm	Automatically remove the container when it exits

docker image ls
docker container ls

docker exec -it graal /bin/bash

Error: Main entry point class 'HelloWorld' not found.
May be a result of Error: A firewall is blocking file Sharing between Windows and the containers.
Try to disconnect from VPN.

####For our test example
Create a java source file, e.g. HelloWorld.java in graalvm/project folder.
Compile to class file, result should be like: HelloWorld.class.  
Remove graalvm Docker image if needed:  
`docker image rm -f sdoroshenko/graal-native-image:19.0.0`  
Build Docker image:  
``docker build -t sdoroshenko/graal-native-image:19.0.0 .``
Run graalvm Docker container:  
`docker run -it --rm -v c:/Users/Sergei_Doroshenko/IdeaProjects/docker-samples/graalvm/project:/project sdoroshenko/graal-native-image:19.0.0 "--static" "-H:Name=out" "HelloWorld"`  
An output should be like:  
Build on Server(pid: 9, port: 44357)*
[out:9]    classlist:   6,195.42 ms
[out:9]        (cap):   2,544.58 ms
[out:9]        setup:   7,396.56 ms
[out:9]   (typeflow):  13,450.63 ms
[out:9]    (objects):   3,433.14 ms
[out:9]   (features):     618.58 ms
[out:9]     analysis:  17,797.19 ms
[out:9]     (clinit):     408.49 ms
[out:9]     universe:   1,163.51 ms
[out:9]      (parse):   4,878.25 ms
[out:9]     (inline):   4,717.70 ms
[out:9]    (compile):  31,168.70 ms
[out:9]      compile:  41,518.49 ms
[out:9]        image:   1,004.30 ms
[out:9]        write:     732.68 ms
[out:9]      [total]:  76,414.54 ms

An `out` executable file should appear.  
To run it execute:  
`docker run -it --rm -v c:/Users/Sergei_Doroshenko/IdeaProjects/docker-samples/graalvm/project:/project sdoroshenko/alpine`  
An output should be:  
Start working
total 16
drwxr-xr-x    1 root     root          4096 Oct 25 15:30 .
drwxr-xr-x    1 root     root          4096 Oct 25 15:30 ..
drwxr-xr-x    2 root     root          4096 Oct 25 15:30 docker
-rwxr-xr-x    1 root     root           155 Aug 21 12:55 start.sh
total 3432
drwxr-xr-x    2 root     root          4096 Oct 25 15:30 .
drwxr-xr-x    1 root     root          4096 Oct 25 15:30 ..
-rwxr-xr-x    1 root     root       3502600 Oct 25 15:30 out
This is Java App: Hello World
