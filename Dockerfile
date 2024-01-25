
# Use a Java 17 base image to run the app
FROM eclipse-temurin:17-jre

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file to the container
COPY ./target/quickstart-java-app.jar .

# Set the command to run the application
CMD ["java", "-jar", "quickstart-java-app.jar"]