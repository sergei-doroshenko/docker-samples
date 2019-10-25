#!/bin/sh
echo "Start working"
mkdir /opt/docker
ls -la /opt
cp /project/out /opt/docker/
ls -la /opt/docker
chmod +x /opt/docker/out
sh -c /opt/docker/out