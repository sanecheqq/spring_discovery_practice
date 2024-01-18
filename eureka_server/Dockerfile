FROM openjdk:17.0.1-jdk-slim

ARG JAR_FILE=build/libs/*SNAPSHOT.jar

WORKDIR /opt/app

COPY ${JAR_FILE} eureka_server.jar

ENTRYPOINT ["java","-jar","eureka_server.jar"]