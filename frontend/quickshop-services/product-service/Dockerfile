# product-service/Dockerfile

# Use OpenJDK 17 slim base image
FROM openjdk:17-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR into the container
COPY target/product-service-1.0.0.jar product-service.jar

# Expose the service port
EXPOSE 8083

# Set the entrypoint to run the JAR
ENTRYPOINT ["java","-jar","product-service.jar"]

