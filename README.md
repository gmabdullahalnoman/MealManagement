## Meal Management System

A backend-first Meal Management System built with Java and Spring Boot to replace an Excel-based meal and financial management workflow.

### Current Status — Foundation Complete

#### Technology Stack

* Java: 17
* Spring Boot: 4.0.8
* Build Tool: Maven
* Database: PostgreSQL
* ORM: JPA / Hibernate
* API: REST / Spring WebMVC
* Validation: Spring Boot Validation

### Architecture

```
Client
  ↓
Controller
  ↓
Service
  ↓
Repository
  ↓
JPA / Hibernate
  ↓
PostgreSQL
```

### Current Foundation

* Spring Boot project initialized
* Maven configuration established
* Required dependencies configured
* PostgreSQL database connection configured
* JPA/Hibernate configured
* Application successfully starts on port `8081`
* Development database schema update enabled
* SQL logging enabled for development

### Project Structure

```
meal/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
├── pom.xml
└── README.md
```

### Next
```
Database Model → Entity → Repository → PostgreSQL
```
The first database model will be introduced while keeping the project focused on learning how Spring Boot, JPA/Hibernate, and PostgreSQL work together.
