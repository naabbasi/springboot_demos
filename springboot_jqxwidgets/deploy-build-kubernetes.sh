#!/bin/sh

if [ -z "$1" ]
then
      echo "Please provide version"
else
    microk8s kubectl create deployment kube-noman-springboot-jqxwidgets --image=nomanaliabbasy/springboot-jqxwidgets:$1

    microk8s kubectl get pods

    microk8s kubectl expose deployment kube-noman-springboot-jqxwidgets --type="NodePort" --port 8080
fi
