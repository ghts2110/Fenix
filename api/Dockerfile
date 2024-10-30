FROM openjdk:22

WORKDIR /app

# Copy the Maven build artifact (JAR file) into the container
COPY ./target/api-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

RUN ls -l /app

ENTRYPOINT [ "java", "-jar", "/app/app.jar"]