### We created a Maven-based Spring Boot application.
```
MealManagement
└── backend
└── meal
```

Spring Initializr generated the project structure and dependency configuration for us.

>pom.xml — most important

This is Maven's project configuration file.

- It defines:
   - Project identity
   - Java version 
   - Spring Boot version  
   - Dependencies 
   - Build configuration 
   - Plugins

Think of it as:
```
pom.xml
↓
"What does this application need
and how should Maven build it?"
```
### Spring Boot version

We selected:

Spring Boot 4.0.8

This determines the Spring Boot ecosystem version our project is built around.

### Java version
   >Java 17

This tells Maven which Java language/runtime level the project targets.

So:
```
Java 17
↓
Spring Boot 4.0.8
↓
Our application
```
### Dependencies

We'll add/use:
```
Spring Web
Spring Data JPA
PostgreSQL Driver
Validation
```
Conceptually:
```
Spring Web
→ REST API

Spring Data JPA
→ Java ↔ Database persistence

PostgreSQL Driver
→ Java ↔ PostgreSQL communication

Validation
→ Request/data validation
```
#### The important learning point:
```
We don't manually download JAR files.
Maven reads pom.xml and resolves the required dependencies and their transitive dependencies.
```
### Maven handles:
```
Dependencies
↓
Compilation
↓
Testing
↓
Packaging
↓
Application build
```
We'll learn commands such as:
```
mvn clean
mvn test
mvn package

and eventually understand what Maven is actually doing behind them.
```
### Generated source structure

Currently, we have something similar to:
```
meal/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/management/meal/
│   │   │       └── MealApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── ...
```
>MealApplication.java is the entry point.

#### The important annotation is:

>@SpringBootApplication

We'll break down what that annotation actually means next. InshaAllah.