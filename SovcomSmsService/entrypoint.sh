#!/usr/bin/env bash
while true
do
  sleep 5
  if [ $(curl -o -L -s -w "%{http_code}" http://sovcom-cloud-gateway:8080) -ne 200 ]; 
  then break;fi
done
exec "java" "-jar" "SovcomSmsService-0.0.1-SNAPSHOT.jar" "$@"
