#!/bin/sh

for i in `seq 1 20`
do
  curl -X POST -H "Content-Type: application/json" \
      -d '{"variables": {}}' \
      http://localhost:8080/engine-rest/process-definition/key/http-request-process/start 
done