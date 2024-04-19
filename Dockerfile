# syntax=docker/dockerfile:1

# Use a Java base image with OpenJDK 21
FROM openjdk:21-jdk-alpine AS builder

# Set working directory for building the application
WORKDIR /app

# Copy your project files from the context to the working directory
COPY . .

# Compile your application (assuming a Maven project)
RUN mvn clean compile

# Create a slimmer runtime image based on OpenJDK 21 Alpine
FROM openjdk:21-jre-alpine

# Copy the compiled JAR file from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Set working directory for the application
WORKDIR /app

# Expose the port your application listens on (replace if needed)
EXPOSE 6559

# Entrypoint to run your Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]