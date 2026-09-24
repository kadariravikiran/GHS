# Backend V1

Every business service follows:
Controller -> Service -> Repository -> PostgreSQL

Authentication follows:
Frontend -> auth-service -> JWT -> protected microservices

All business APIs are protected by JWT. Health endpoints are public.
Tests are unit tests and do not require PostgreSQL.
