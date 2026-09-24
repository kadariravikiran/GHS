# Gnanodaya High School Backend V1

Clean Java 17 / Spring Boot microservices backend.

Services:
- auth-service: 8081
- student-service: 8082
- teacher-service: 8083
- attendance-service: 8084
- fee-service: 8085
- exam-service: 8086
- homework-service: 8087
- announcement-service: 8088
- notification-service: 8089
- gallery-service: 8090

Architecture:
Controller -> Service -> Repository -> PostgreSQL

Authentication:
Frontend -> auth-service -> JWT -> protected microservices

Configuration uses DB_URL, DB_USERNAME, DB_PASSWORD and JWT_SECRET environment variables.
No docker-compose.yml is included. Kubernetes/GKE will be the deployment target.

Tests are unit tests and do not require PostgreSQL, so GitHub Actions can run `mvn clean test`.
