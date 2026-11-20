
FROM eclipse-temurin:17-jre

WORKDIR /app

# Download a fixed version of the OpenTelemetry Java Agent
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v2.34.0/opentelemetry-javaagent.jar /app/opentelemetry-javaagent.jar

# Copy the Spring Boot application
COPY target/auth-service-1.0.0.jar app.jar

EXPOSE 8081

# Start the application with OpenTelemetry instrumentation enabled
ENTRYPOINT ["java", "-javaagent:/app/opentelemetry-javaagent.jar", "-jar", "app.jar"]

