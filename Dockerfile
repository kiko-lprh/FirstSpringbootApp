# syntax=docker/dockerfile:1

FROM node:18-alpine
WORKDIR /app
COPY . .
CMD ["node", "src/main/java/com/kiko/opc/CharactersApplication.java"]
EXPOSE 6559