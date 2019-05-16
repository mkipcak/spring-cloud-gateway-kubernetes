FROM openjdk:8-jdk-alpine
ADD build/libs/test-service-0.0.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
