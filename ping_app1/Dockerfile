FROM openjdk:17.0.1-jdk-slim

ARG JAR_FILE=build/libs/*SNAPSHOT.jar

WORKDIR /opt/app

COPY ${JAR_FILE} ping_app1.jar

ENTRYPOINT ["java","-jar","ping_app1.jar"]