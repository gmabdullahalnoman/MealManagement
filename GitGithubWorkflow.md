## Git & GitHub Strategy
### Repository setup
   - Repository name: MealManagement
   - Branch strategy:
```
main 
└── feature branches 
```
   - main — stable, working version.
   - feature/* — individual feature development.
   - fix/* — bug fixes.
   - docs/* — documentation-only changes.

We'll avoid unnecessary branching for this small project, but practise the workflow.

### Commit message convention
   - Format : 
> type : short description

| Type      | Purpose                  |
|-----------|--------------------------|
| docs      | 	Documentation           |
| feat      | New functionality        |
| fix       | 	Bug fixes               |
| test      | Adding/updating tests    |
| refactor	 | Code improvement         |
| build	    | Maven/dependency changes |
| chore	    | Maintenance              |
| style	    | Formatting only          |

### Examples:
- docs: define project requirements
- docs: finalize business rules
- feat: implement member management
- fix: correct monthly meal calculation
- test: add meal service unit tests
- refactor: improve expense calculation logic
- build: configure PostgreSQL dependencies

### Day-wise Git execution plan

#### Day 1 — Requirements & Analysis
- docs: initialize project documentation
- docs: define project requirements
- docs: document actors and use cases
- docs: finalize business rules
- Git milestone: v0.1.0-requirements

#### Day 2 — Design
- docs: define system workflow
- docs: document application architecture
- docs: add database design
- docs: add entity relationship diagram
- docs: define REST API specifications
- Git milestone: v0.2.0-design

#### Day 3 — Foundation & Development
- build: initialize Spring Boot project
- build: configure PostgreSQL connection
- feat: implement initial entity models
- feat: implement repository layer
- feat: implement first REST endpoints
- test: add initial integration tests
- Git milestone: v0.3.0-foundation

#### Day 4 — Business Logic & Testing (if needed)
- feat: implement meal calculation
- feat: implement bazar management
- feat: implement member financial records
- fix: resolve calculation issues
- test: add business logic unit tests
- Git milestone: v0.4.0-business-logic

#### Day 5 — Finalization (if needed)
- test: complete API integration tests
- refactor: improve application structure
- docs: complete project README
- docs: add Postman collection
- chore: prepare project release
- Git milestone: v1.0.0
- 
> Milestones are targets, not automatic release guarantees. We tag only when the corresponding work is complete and stable.

### Daily Git workflow
- Every working session will follow this cycle:
   - Pull latest changes - git pull origin main
   - Work on assigned task - Code / Documentation / Testing
   - Review changes - git status / git diff
   - Commit changes - git add / git commit
   - Push to GitHub - git push

We'll use IntelliJ's terminal (PowerShell), as usual.
### Documentation and tracking
*Our repository should preserve the project's development history.*
```
MealManagement/
│
├── docs/
│   ├── requirements/
│   ├── design/
│   ├── testing/
│   └── development-log/
│
├── backend/
├── database/
├── postman/
├── README.md
├── CHANGELOG.md
└── .gitignore
```
#### We'll maintain:
- README.md — project introduction and setup.
- CHANGELOG.md — meaningful changes between versions.
- Development log — daily work completed and pending.
- Test documentation — test cases, results and defects.
### Testing and Git relationship
*We'll follow STLC alongside development, not leave all testing until the end.*

| Testing activity       | Git practice              |
|------------------------|---------------------------|
| Test case preparation  | Commit test documentation |
| Unit testing	          | Commit test code          |
| Integration testing	   | Commit integration tests  |
| Defect identification	 | Record issue              |
| Bug fixing             | 	fix: commit              |
| Regression testing     | 	Commit updated tests     |
| Final verification     | 	Release tag              |

### Git rules
These are non-negotiable:
   - Never commit passwords, database credentials, API keys or secrets.
   - Keep .gitignore updated.
   - Never push knowingly broken code to main.
   - Don't combine unrelated changes in one commit.
   - Don't rewrite or delete useful development history.
   - Every completed milestone should have a Git tag.
   - Keep commits small enough to understand.

### Branch naming examples
```
   feature/member-management
   feature/meal-management
   feature/bazar-management
   feature/monthly-calculation
   
   fix/meal-rate-calculation
   docs/database-design
```
For completed feature branches, we'll review, merge into main, and remove the temporary branch.

### Final workflow decision - Proposed strategy
Area		Decision

| Hosting	            | 	GitHub                      |
|---------------------|------------------------------|
| Main branch         | 	main                        |
| Feature development | 	Short-lived branches        |
| Commit convention   | 	Conventional-style prefixes |
| Versioning	         | Semantic Versioning          |
|Release milestones	|Day/phase-wise|
|Testing	|	Alongside development|
|Documentation	|Maintained throughout|
|IDE/Terminal	|IntelliJ Terminal / PowerShell|
