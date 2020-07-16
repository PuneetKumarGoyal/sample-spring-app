FROM openjdk:8-jdk-alpine
WORKDIR /u01/apps
COPY */target/*.jar /u01/apps/
ENTRYPOINT ["java", "-jar", "sample-spring-app-0.0.1.jar"]
