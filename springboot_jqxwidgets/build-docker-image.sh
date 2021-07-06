#!/bin/sh

if [ -z "$1" ]
then
      echo "Please provide version"
else
    docker build -t nomanaliabbasy/springboot-jqxwidgets:latest .

    #tag repo with username/reponame
    docker tag nomanaliabbasy/springboot-jqxwidgets:latest nomanaliabbasy/springboot-jqxwidgets:$1

    docker push nomanaliabbasy/springboot-jqxwidgets:$1
fi


