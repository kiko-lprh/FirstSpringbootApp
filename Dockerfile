# syntax=docker/dockerfile:1

FROM openjdk:21-slim-bookworm

ADD target/characters-0.0.1-SNAPSHOT.jar characters.jar

ENTRYPOINT ["java", "-jar", "target/characters-0.0.1-SNAPSHOT.jar"]
