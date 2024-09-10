FROM openjdk:22

WORKDIR /app

# Copy the Maven build artifact (JAR file) into the container
COPY ./mvnw app.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "app.jar"]