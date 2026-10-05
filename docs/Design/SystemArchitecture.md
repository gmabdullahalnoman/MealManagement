### Architecture Style

The application will use a Layered Architecture.
```
Client
↓
Controller Layer
↓
Service Layer
↓
Repository Layer
↓
JPA / Hibernate
↓
PostgreSQL
```
### Layers
```
- Controller

    - Receives HTTP requests.
    - Validates request input. 
    - Returns HTTP responses. 
    - Should not contain business logic.

- Service

    - Contains business rules and calculations. 
    - Coordinates multiple operations. 
    - Handles transaction boundaries where required.

- Repository

    - Handles database access. 
    - Uses Spring Data JPA. 
    - Should not contain business/business-calculation logic.

- Entity

    - Represents persistent database data. 
    - Maps Java objects to database tables through JPA.

- DTO

    - Defines API request/response structures. 
    - Prevents direct exposure of database entities through APIs.
```
### Supporting Components
```
   Exception Handling
   Validation
   Configuration
   Security (future)
   Logging
   Testing
```
### Technology Stack
```
   Language: Java
   Framework: Spring Framework / Spring Boot
   API: REST
   Persistence: Spring Data JPA / Hibernate
   Database: PostgreSQL
   Build: Maven
   Testing: JUnit / Mockito / Spring Boot Test
   API Testing: Postman
   Version Control: Git / GitHub
```
***Architecture principle: Keep responsibilities separated so the project remains easy to understand, test, maintain, and extend.***