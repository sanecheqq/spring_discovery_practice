FROM openjdk:17.0.1-jdk-slim

ARG JAR_FILE=build/libs/*SNAPSHOT.jar

WORKDIR /opt/app

COPY ${JAR_FILE} app1.jar

ENTRYPOINT ["java","-jar","app1.jar"]