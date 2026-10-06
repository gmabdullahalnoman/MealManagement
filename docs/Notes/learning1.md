## Spring Boot Project Setup Learning
### Introduction
```
Before learning Spring Boot, it is important to understand how the Spring Framework and a Spring Boot project are created, configured, structured, and run.
 As a beginner, the goal is not only to make the project run, but also to understand why each part exists,
  what each file does, and where to look when an error occurs.
By the end of this lecture, we should have a clear understanding of the structure of a basic Spring Boot project,
 the difference between Spring Framework and Spring Boot, Maven, pom.xml, application.properties, dependencies, database configuration, 
  and the application startup process.
```
### What Is Spring Framework
```
Spring Framework is a large framework for building Java applications.
 It mainly makes it easier to create, manage, and connect different objects and components within an application.
In a large Java application, if we create every object ourselves using the new keyword and manually manage their dependencies,
 the application can become complicated very quickly.
  Spring takes responsibility for managing many of these objects.
One of the most important concepts in Spring Framework is Dependency Injection.
 This means that instead of a class creating the objects it needs by itself,
  those objects are provided to the class by Spring.
For example, if a MealService needs a MealRepository, the MealService does not necessarily need to create it using new MealRepository().
 Spring can provide the required repository.
  This makes the code more loosely coupled, maintainable, and testable.
```
### What Is Spring Boot
```
Spring Boot is a framework and development approach built on top of the Spring Framework that makes creating and configuring Spring applications much easier.
In traditional Spring applications, developers often had to write a lot of configuration manually.
 Spring Boot reduces much of that work through sensible defaults, auto-configuration, embedded servers, and starter dependencies.
In simple terms, Spring Framework provides the foundation,
 while Spring Boot provides a convenient way to build applications quickly on top of that foundation.
```
### Relationship Between Spring Framework and Spring Boot
```
Spring Framework and Spring Boot are different,
 but they are not replacements for each other.
  Spring Boot mainly makes it easier to use the Spring Framework.
When you create a Spring Boot application,
 you are still using many features from the Spring ecosystem,
  such as Dependency Injection, Spring MVC, Spring Data, and configuration management.
A useful mental model is that Spring Framework is the core technology ecosystem,
 while Spring Boot is the easier development approach for building applications using that ecosystem.
```
### What a Spring Boot Application Does
```
When a Spring Boot application starts,
 it creates a Spring Application Context.
  Spring looks at the application's classes and configuration and creates the required objects,
   commonly known as beans.
Then the required configuration is applied.
 If the application uses a database, Spring attempts to create a database connection.
  If the application has web dependencies, an embedded server such as Tomcat can be started.
If everything is configured correctly,
 the application starts successfully and becomes ready to receive HTTP requests.
For Meal Management application,
 the overall process is roughly this: the Java application starts,
  Spring Boot creates the application context, JPA and PostgreSQL configuration are loaded,
   a database connection is created, and then the web server starts, usually on port 8080.
```
### Creating a Spring Boot Project
```
A Spring Boot project is commonly created using Spring Initializr.
 There we choose the programming language, build tool, Java version, and required dependencies.
For Meal Management project, we selected Spring Web, Spring Data JPA, PostgreSQL Driver, and Validation.
After generating the project from Spring Initializr,
 we receive a ZIP file, we extract it and open or import the project into IntelliJ IDEA as a Maven project.
One important point is that the folder containing pom.xml is the actual Maven project folder.
 If IntelliJ does not properly detect that folder as a Maven project,
  you may experience problems with dependency resolution or application run configurations.
```
### Spring Boot Project Structure
```
A typical Spring Boot project contains src, pom.xml, and several other configuration files.
src/main/java contains the main Java source code of the application.
 Usually, this is where the main application class, controllers, services, repositories, entities,
  and other Java classes are placed.
src/main/resources contains resources and configuration files rather than Java source code.
 application.properties or application.yml is usually located here.
src/test contains test code.
 Tests are used to verify that the application's behaviour is correct.
pom.xml is located at the root of the Maven project and contains dependency and build configuration.
```
```
Meal Management project structure is conceptually like this:

MealManagement is the overall workspace or larger project structure.
Inside it, there is a backend folder. 
 Inside backend, meal is the actual Spring Boot Maven project.
Inside backend/meal/src/main/java you will have the Java code,
 while backend/meal/src/main/resources contains configuration.
  backend/meal/pom.xml is the Maven configuration file for this Spring Boot application.
```
### Main Application Class
```
A Spring Boot application has a main class containing the main() method and usually uses the @SpringBootApplication annotation.
In this project, the class is MealApplication, and it contains SpringApplication.
 run(MealApplication.class, args).
This line is the entry point for starting the application. The Java program starts here,
 and Spring Boot uses this call to start the Spring application.
@SpringBootApplication is an important annotation.
 It combines the required behaviour for Spring Boot configuration, component scanning, and auto-configuration.
```
### What Is a Dependency
```
A dependency is an external library or framework component that an application needs.
For example, if we want to create REST APIs, we may need Spring Web.
 If we want to work with a database, we may need Spring Data JPA and a PostgreSQL Driver.
  If we want to validate user input, we may need the Validation dependency.
As a beginner,
 think of a dependency as functionality that our application does not need to implement itself because it can use an existing library instead.
```
### What Is Maven
```
Maven is a build and dependency management tool for Java projects.
Maven downloads project dependencies, builds the project, helps run tests,
 and automates various build-related tasks.
In a project, Maven reads pom.xml to understand the project's name, Java version, Spring Boot version, required dependencies,
 and build configuration.
```
### What Is pom.xml
```
pom.xml is one of the most important configuration files in a Maven project.
 POM stands for Project Object Model.
In simple terms, pom.xml tells Maven what the project is, which technologies it uses,
 which libraries it needs, and how the project should be built.
In a project, pom.xml contains dependencies such as Spring Web, Spring Data JPA, PostgreSQL Driver,
 and Validation.
```
### How to Read pom.xml
```
Do not initially think of XML as a programming language like Java.
 Think of it as a structured configuration format.
  XML has outer elements containing different inner elements.
<project> is the main container for the Maven configuration.
 Inside it, we can have project metadata, parent configuration, properties, dependencies,
  and build configuration.
<parent> usually defines the Spring Boot parent configuration.
 Through this, Maven receives common configuration and dependency version management.
<groupId> generally identifies the project or organization.
 artifactId identifies the project or artifact. version identifies the project version.
```
### Dependency Declaration
```
A dependency is usually written inside a <dependency> element.
 Inside it, <groupId> identifies the group or organization that provides the library,
  while <artifactId> identifies the specific library.
For example, the PostgreSQL dependency belongs to the org.postgresql group and uses the postgresql artifact.
Spring Boot starter dependencies are especially important.
 spring-boot-starter-web provides the required set of dependencies for building web applications and REST APIs.
  spring-boot-starter-data-jpa provides JPA and database-related functionality. spring-boot-starter-validation provides validation functionality.
The PostgreSQL dependency is separate.
 It provides the JDBC driver required for communication between the Java application and PostgreSQL.
An important distinction is that having the PostgreSQL Driver dependency does not mean the PostgreSQL database connection is fully configured.
 The driver is the communication mechanism; the database location and credentials must be configured separately.
```
### What Is application.properties
```
application.properties is the configuration file for a Spring Boot application.
 It is normally located inside src/main/resources.
While pom.xml defines project dependencies and build-related configuration,
 application.properties defines how the application should behave at runtime.
If this project file currently contains spring.application.name=meal,
 it means the name of the Spring application is meal.
A properties file generally uses the key=value format.
```
### PostgreSQL Configuration
```
Since our application uses Spring Data JPA and the PostgreSQL Driver,
 the application needs to know the information required to connect to PostgreSQL.
Typically, the database URL, username, and password are configured in application.properties.
For example, spring.datasource.url contains the PostgreSQL database connection URL.
 In jdbc:postgresql://localhost:5432/meal_management, jdbc refers to Java Database Connectivity,
  postgresql identifies the database technology, localhost identifies where the database server is running,
   5432 is PostgreSQL's commonly used port, and meal_management is the database name.
Then spring.datasource.username and spring.datasource.password provide the database authentication information.
```
### JPA Configuration
```
When using Spring Data JPA, Hibernate helps map Java entities to database tables.
In a development environment,
 setting spring.jpa.hibernate.ddl-auto=update allows Hibernate to attempt to update the database schema according to the entities.
Setting spring.jpa.show-sql=true allows you to see many of the SQL queries generated by Hibernate in the console.
 This is particularly useful while learning database operations because you can understand what SQL is being executed behind your Java code.
In production environments, instead of relying only on ddl-auto=update,
 it is generally better to use a database migration approach such as Flyway or Liquibase for managing database schema changes.
```
### The Main Difference Between pom.xml and application.properties
```
Never think of these two files as doing the same thing.
pom.xml mainly defines what dependencies and build configuration the project needs.
application.properties mainly defines how those technologies should be configured and behave at runtime.
For example, for PostgreSQL, pom.xml says that the PostgreSQL Driver is required.
 application.properties says where the PostgreSQL database is located, which port it uses, which database should be accessed,
  and which credentials should be used.
Understanding this distinction will help you diagnose many database configuration errors yourself.
```
### The Complete Picture of Meal Management Project
```
In this project, the Spring Boot application entry point is MealApplication.
 Spring Web provides the infrastructure required for creating web APIs.
  Spring Data JPA helps manage database data through Java objects.
   The PostgreSQL Driver provides communication between the Java application and PostgreSQL.
    Validation helps verify whether user input is valid.
pom.xml brings these dependencies into the project.
 application.properties contains PostgreSQL and other Spring runtime configuration.
  Then Java code implements the actual Meal Management functionality through entities,
   repositories, services, controllers, and other components.
```
### The Complete Application Startup Flow
```
When we run MealApplication, Java first executes the main() method.
 SpringApplication.run() starts the Spring Boot application.
  Through @SpringBootApplication, Spring begins configuration and component scanning.
Spring searches for the application's components and creates the required beans.
 If JPA is present, Spring scans the Spring Data JPA repositories.
  If database configuration exists, it attempts to create a datasource.
   If the web dependency is present, an embedded web server can be started.
If everything is configured correctly, the application starts successfully and is usually ready to receive requests at localhost:8080.
If something is missing, the application can fail during startup.
 For example, if the PostgreSQL Driver exists but the datasource URL is missing,
  Spring will not know how to create the database connection and the application may fail to start.
```
### Error Understanding Mental Model
```
When you see an error in a Spring Boot application, do not try to understand the entire log immediately.
 First, look for the main Error, Description, and Reason sections.
If you see Failed to determine a suitable driver class, look at the database driver and datasource configuration.
If you see Connection refused,
 check whether the database server is running and whether the host and port are correct.
If you see password authentication failed, check the database username and password.
If you see Port 8080 already in use, check whether another application is already using port 8080.
Learning to treat error messages as categories of problems is a very important part of learning Spring Boot.
```
### Final Mental Model
```
Think of the entire Spring Boot project as a chain.
Spring Framework provides the core infrastructure and programming model.
 Spring Boot makes it easier to build and configure applications using the Spring ecosystem.
  Maven manages project dependencies and builds. pom.xml tells Maven what the project needs.
   application.properties tells Spring Boot how the application should behave at runtime.
    Java code defines what the application actually does.
For Meal Management project, the simplest mental model is:
pom.xml tells you what you need.
application.properties tells you how those things should run.
Java code tells you what the application actually does.
Once you understand these three concepts clearly, the structure, dependencies,
 and configuration of a Spring Boot project become much easier to understand
```