### Overall System Workflow
```
   User
   ↓
   Login / Access
   ↓
   Select Meal Group / Month
   ↓
   Perform permitted activities
   ├── Member Management
   ├── Meal Management
   ├── Deposit / Expense
   └── Bazar
   ↓
   System calculates
   ├── Total Meals
   ├── Total Asset
   ├── Total Bazar
   ├── Meal Rate
   └── Member Balance
   ↓
   Monthly Summary / Reports
```
### Member Workflow
```
   Admin
   ↓
   Add / Update / Activate / Deactivate Member
   ↓
   Member becomes available for meal-cycle activities
```
### Meal Workflow
```
   Member/Admin
   ↓
   Select Date
   ↓
   Enter / Update Meal
   ↓
   Validation
   ↓
   Save
   ↓
   Meal Total Updated
```
### Deposit / Expense Workflow
```
   Member/Admin
   ↓
   Enter Transaction
   ↓
   Validation
   ↓
   Save Transaction
   ↓
   Total Asset Updated
```
### Bazar Workflow
```
   Member/Admin
   ↓
   Enter Bazar Record
   ↓
   Validation
   ↓
   Save
   ↓
   Total Bazar Updated
```
### Monthly Calculation Workflow
```
   Select Month
   ↓
   Collect Monthly Records
   ↓
   Calculate
   ├── Total Meals
   ├── Total Asset
   ├── Total Bazar
   ├── Meal Rate
   └── Member Balance
   ↓
   Generate Monthly Result
```
### Monthly Closing Workflow
```
   Review Monthly Data
   ↓
   Verify Meals
   ↓
   Verify Financial Records
   ↓
   Verify Bazar
   ↓
   Run Final Calculation
   ↓
   Monthly Summary
   ↓
   Close Month
```   
