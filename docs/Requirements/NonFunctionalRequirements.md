### Performance
- NFR-001: Common API requests should respond within a reasonable time under normal usage.
- NFR-002: Database queries should be designed to avoid unnecessary data retrieval.
### Security
- NFR-003: Sensitive information must not be stored in plain text.
- NFR-004: Database credentials and other secrets must not be committed to Git.
- NFR-005: User access must be restricted according to applicable permissions.
### Reliability & Data Integrity
- NFR-006: Financial and meal calculations must produce consistent results from stored data.
- NFR-007: Invalid data should be rejected through validation.
- NFR-008: Important database operations should maintain transactional consistency.
### Maintainability
- NFR-009: The application should follow a clear layered architecture.
- NFR-010: Code should follow consistent naming and formatting conventions.
- NFR-011: Business logic should be separated from controllers and database access.
### Testability
- NFR-012: Core business logic should be covered by automated tests.
- NFR-013: APIs should be testable independently using tools such as Postman.
### Documentation
- NFR-014: Setup, architecture, API usage, database design, and testing information should be documented sufficiently for another developer to understand and run the project.