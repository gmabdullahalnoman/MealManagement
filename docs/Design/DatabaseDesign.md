### Core Entities
   - Meal Group — represents a meal-management group.
   - Member — people participating in the group.
   - Meal Record — member's meal information by date.
   - Financial Transaction — member deposits/expenses.
   - Bazar Record — actual bazar spending.
   - Monthly Summary — monthly calculated/result information.
### Initial Relationships
```
   Meal Group
   │
   └──< Member
   │
   ├──< Meal Record
   │
   └──< Financial Transaction

Meal Group
└──< Bazar Record

Meal Group
└──< Monthly Summary
```
### Important Design Decisions
   - Every member belongs to one meal group.
   - Meal records belong to a member.
   - Financial transactions belong to a member.
   - Bazar records belong to a meal group.
   - Monthly summaries belong to a meal group and month.
   - Total Asset is calculated from applicable financial transactions.
   - Total Bazar is calculated independently from bazar records.
   - Calculated values should not be duplicated unnecessarily in transactional tables.
### Database Principles
   - Use primary keys for every entity.
   - Use foreign keys to enforce relationships.
   - Use appropriate data types and constraints.
   - Store dates/timestamps where required.
   - Avoid unnecessary duplication.
   - Financial amounts should use a suitable exact numeric type rather than floating-point types.

***Next: we'll turn this conceptual model into the actual table/column design and ERD.***