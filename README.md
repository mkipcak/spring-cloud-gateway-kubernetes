# Get started

Open shell in the project folder and execute following commands:

```sh
minikube start
./gradlew clean build
eval $(minikube docker-env)
kubectl create -f discovery-cluster-role.yaml
kubectl create rolebinding default:service-discovery-client --clusterrole service-discovery-client --serviceaccount default:default
cd gateway-service
docker build -t nmaoezdemir/gateway-service:0.0.0-SNAPSHOT .
cd ..
cd test-service
docker build -t nmaoezdemir/test-service:0.0.0-SNAPSHOT .
cd ..
kubectl delete -f gateway-service/gateway-service-deployment.yaml
kubectl create -f gateway-service/gateway-service-deployment.yaml
kubectl delete -f test-service/test-service-deployment.yaml
kubectl create -f test-service/test-service-deployment.yaml
minikube service gateway-service
```
