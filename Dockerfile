# syntax=docker/dockerfile:1

# Use an OpenJDK image as the base
FROM openjdk:21-slim-bookworm

# Copy the Spring Boot application JAR file into the container
COPY target/characters-0.0.1-SNAPSHOT.jar /characters.jar

# Specify the command to run your Spring Boot application
CMD ["java", "-jar", "/characters.jar"]

# Expose the port that your Spring Boot application listens on
EXPOSE 6559