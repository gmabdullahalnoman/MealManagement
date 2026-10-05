### Member Rules
- A member must belong to a meal group.
- Only active members participate in the current meal cycle.
- A member can manage their own permitted records.
- Admin can manage group members.
- Future: access will be controlled through roles/permissions.
### Meal Rules
- Meals are recorded against a member and date.
- Only valid/active members can have meal entries.
- The system calculates total meals for a selected period.
-  Meal rate is calculated from the applicable monthly financial data.
### Financial Rules
- Member deposits/expenses contribute to Total Asset.
- Total Asset and Total Bazar are separate values.
- Member-wise financial balance must be calculated from recorded transactions.
- Financial records must retain their transaction date and amount.
### Bazar Rules
- Every bazar record must have an amount and date.
- Bazar spending contributes to Total Bazar.
- Bazar spending does not automatically become a member deposit/expense.
- Bazar records must be traceable to the person who entered them.
### Monthly Calculation Rules
- Calculations are performed for a defined month/period.
- Total meals, Total Asset, and Total Bazar are calculated separately.
- The system generates member-wise monthly results.
- Calculations must use stored records rather than manually entered totals. 
### Data Integrity Rules
- Required fields cannot be empty.
- Amounts must be valid positive values where applicable.
- Duplicate or invalid records should be prevented where business rules require it.
- Records should maintain their creation/update information where applicable.