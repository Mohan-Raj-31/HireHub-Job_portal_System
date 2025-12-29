# Use Java 17 image
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy backend files
COPY . .

# Build project - skip tests
RUN ./mvnw clean package -DskipTests

# Expose backend port
EXPOSE 8080

# Run application
CMD ["java", "-jar", "target/*.jar"]