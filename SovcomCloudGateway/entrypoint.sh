#!/usr/bin/env bash
while true
do
  sleep 2
  if [ $(curl -o -L -s -w "%{http_code}" http://sovcom-eureka-server:8084) -ne 200 ]; 
  then break;fi
done
exec "java" "-jar" "SovcomCloudGateway-0.0.1-SNAPSHOT.jar" "$@"
