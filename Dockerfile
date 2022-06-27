FROM openjdk:8-jdk-alpine
MAINTAINER thientv7
COPY target/springboot-images.jar springboot-images.jar
ENTRYPOINT ["java","-jar","/springboot-images.jar"]
