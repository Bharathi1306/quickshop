FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/order-service-1.0.0.jar order-service.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","order-service.jar"]

