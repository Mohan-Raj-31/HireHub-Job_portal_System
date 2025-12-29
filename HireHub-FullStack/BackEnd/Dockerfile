# Use Eclipse Temurin JDK 21
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy backend project
COPY . .

# Build Spring Boot app using Maven
RUN apt-get update && apt-get install -y maven
RUN mvn clean package -DskipTests

# Expose backend port
EXPOSE 8080

# Run application
ENTRYPOINT ["java", "-jar", "target/*.jar"]
