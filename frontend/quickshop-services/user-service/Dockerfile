# Base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built JAR into the container
COPY target/user-service-1.0.0.jar user-service.jar

# Expose service port
EXPOSE 8081

# Command to run the JAR
ENTRYPOINT ["java", "-jar", "user-service.jar"]

