FROM openjdk:17-jdk-alpine
LABEL authors="changmin.kim"
EXPOSE 443

COPY build/libs/kimchi-cloud-apigateway-0.0.1-SNAPSHOT.jar /app/kimchi-cloud-apigateway.jar
WORKDIR /app

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "kimchi-cloud-apigateway.jar"]
