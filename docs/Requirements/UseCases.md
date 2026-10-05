### UC-001 — Manage Member

**Actor** : Admin

**Goal** : Add and maintain meal group members.

- Main Flow:
   - Admin provides member information.
   - System validates the information. 
   - System creates/updates the member. 
   - System confirms the operation.

- Acceptance Criteria:
   - Valid member information is accepted. 
   - Invalid required information is rejected. 
   - Member belongs to the correct meal group. 
   - Member status can be changed.
    
### UC-002 — Manage Meal

**Actor** : Admin / Member

**Goal** : Record and maintain meal information.

- Main Flow:
    - User selects the member/date. 
    - User enters meal information. 
    - System validates the entry. 
    - System saves the meal record.

- Acceptance Criteria:

   - Meal is associated with the correct member and date. 
   - Invalid data is rejected. 
   - Permitted users can update their records. 
   - Meal totals reflect saved records.
  
### UC-003 — Manage Deposit/Expense

**Actor** : Admin / Member

**Goal** : Record member financial transactions.

- Main Flow:

    - User enters transaction information. 
    - System validates the amount and details. 
    - System saves the transaction. 
    - System updates applicable calculations.

- Acceptance Criteria:

    - Valid transactions are saved. 
    - Invalid amounts are rejected. 
    - Transaction belongs to the correct member. 
    - Total Asset reflects applicable transactions.

### UC-004 — Manage Bazar

**Actor** : Admin / Member

**Goal** : Record actual bazar spending.

- Main Flow:

    - User enters bazar information. 
    - System validates the information. 
    - System saves the bazar record. 
    - Total Bazar is recalculated.

- Acceptance Criteria:

    - Valid bazar records are saved. 
    - Amount and date are valid. 
    - Record identifies the person who entered it. 
    - Total Bazar reflects saved records.

### UC-005 — Monthly Calculation

**Actor** : Admin / System

**Goal** : Generate monthly meal and financial results.

- Main Flow:

    - Admin selects a month. 
    - System retrieves applicable records. 
    - System calculates meals, Total Asset, Total Bazar, meal rate, and member balances. 
    - System presents the monthly result.

- Acceptance Criteria:

    - Calculations use stored records. 
    - Total meals are accurate. 
    - Total Asset and Total Bazar remain separate. 
    - Member-wise results are generated. 
    - Same input data produces consistent results.

### UC-006 — View Monthly Report

**Actor** : Admin / Member

**Goal** : View permitted monthly information.

- Acceptance Criteria:

    - Admin can view the complete permitted report. 
    - Members can view their permitted information. 
    - Report values match the underlying records.