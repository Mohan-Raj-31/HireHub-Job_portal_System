# Use Eclipse Temurin JDK 21
FROM eclipse-temurin:21-jdk

# Install Maven
RUN apt-get update && apt-get install -y maven && apt-get clean

# Set working directory
WORKDIR /app

# Copy backend source code only
COPY HireHub-FullStack/BackEnd/HireHub/BackEnd /app

# Build Spring Boot app
RUN mvn clean package -DskipTests

# Expose port used by Spring Boot
EXPOSE 8080

# Run backend JAR
CMD ["java", "-jar", "/app/target/HireHub-0.0.1-SNAPSHOT.jar"]

