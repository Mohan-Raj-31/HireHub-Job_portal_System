FROM eclipse-temurin:21-jdk

RUN apt-get update && apt-get install -y maven && apt-get clean

WORKDIR /app

# Copy backend folder
COPY HireHub ./HireHub

# Build Project
RUN mvn -f HireHub/pom.xml clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "HireHub/target/HireHub-0.0.1-SNAPSHOT.jar"]
