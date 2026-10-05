### Relationship Model
```
MEAL_GROUP
│
├──────< MEMBER
│          │
│          ├──────< MEAL_RECORD
│          │
│          └──────< FINANCIAL_TRANSACTION
│
├──────< BAZAR_RECORD
│
└──────< MONTHLY_SUMMARY
```
### Initial Key Fields

#### MEAL_GROUP
```
id
name
created_at
updated_at
```
#### MEMBER
```
id
group_id
name
status
created_at
updated_at
```
#### MEAL_RECORD
```
id
member_id
meal_date
meal_count
created_at
updated_at
```
#### FINANCIAL_TRANSACTION
```
id
member_id
transaction_type
amount
transaction_date
description
created_at
updated_at
```
#### BAZAR_RECORD
```
id
group_id
member_id
amount
bazar_date
description
created_at
updated_at
```
#### MONTHLY_SUMMARY
```
id
group_id
year
month
total_meals
total_asset
total_bazar
meal_rate
created_at
updated_at
Important Decision
```
***MONTHLY_SUMMARY is currently a design candidate, not a final decision.***

***Later we'll decide whether monthly results should be:***
- calculated dynamically from transactional data, or
- persisted as a monthly snapshot for closing/history.