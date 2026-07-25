# 08_SYSTEM_WORKFLOW

## Overview

This document describes how the Meal Management System operates from the user's perspective. 
It explains the sequence of actions performed by users and the corresponding responses from the system.
The purpose of this document is to provide a clear understanding of the application's business workflow
before database design and software development begin.

This document is intended for:
- Product Owner
- Business Analyst
- Software Architect
- UI/UX Designer
- Backend Developer
- Frontend Developer
- QA Engineer

---

# Authentication & Group Workflow

## WF-001 - User Registration & Group Creation

### Purpose

Allow a new user to create an account and start a new Meal Group. The first registered user automatically becomes the Group Admin.

### Actors

- New User

### Trigger

The user clicks **Register** from the Login page.

### Preconditions

- The user is not registered.
- The Email or Mobile Number is not already in use.

### Workflow

1. The system displays the Registration page.
2. The user enters:
    - Full Name
    - Email or Mobile Number
    - Password
    - Meal Group Name
3. The user submits the registration form.
4. The system validates all information.
5. The system verifies that the Email or Mobile Number is unique.
6. The system creates the User Account.
7. The system creates a new Meal Group.
8. The system assigns the user as the Group Admin of the newly created Meal Group.
9. The system initializes the Meal Group with default settings.
10. The system records the registration activity in the Audit Log.
11. The system signs in the user automatically.
12. The system redirects the user to the Dashboard.

### Alternative Flow

**A1. Duplicate Email or Mobile Number**

- The system displays an appropriate validation message.
- Registration is cancelled.

**A2. Invalid Information**

- The system displays validation errors.
- The user corrects the information and submits again.

### Result

- User Account created.
- Meal Group created.
- Group Admin assigned.
- User logged in successfully.

### Business Rules

- BR-001
- BR-002
- BR-003

### Related Use Cases

- UC-001

## WF-002 - User Login

### Purpose

Allow a registered user to securely access the Meal Management System.

### Actors

- Group Admin
- Member
- Viewer

### Trigger

The user submits the Login form.

### Preconditions

- The user account exists.

### Workflow

1. The system displays the Login page.
2. The user enters Email or Mobile Number.
3. The user enters Password.
4. The user submits the Login form.
5. The system validates the credentials.
6. The system creates a user session.
7. The system identifies the user's Meal Group.
8. The system loads the user's role and permissions.
9. The system redirects the user to the Dashboard.

### Alternative Flow

**A1. Invalid Credentials**

- Login is rejected.
- The system displays an error message.

### Result

- User authenticated.
- Dashboard displayed.

### Business Rules

- BR-004

### Related Use Cases

- UC-002

## WF-003 - Invite a New Member

### Purpose

Allow a Group Admin to invite new Members into the Meal Group.

### Actors

- Group Admin

### Trigger

The Group Admin selects **Generate Invitation Link**.

### Preconditions

- User is logged in.
- User is a Group Admin.

### Workflow

1. The Group Admin opens Member Management.
2. The Group Admin selects **Generate Invitation Link**.
3. The system generates:
    - Invitation Link
    - Secret Code
4. The system displays both values.
5. The Group Admin shares the Invitation Link and Secret Code with the new user.

### Result

- Invitation created successfully.

### Business Rules

- BR-005

### Related Use Cases

- UC-003

## WF-004 - Join Meal Group Using Invitation

### Purpose

Allow a new user to join an existing Meal Group using an Invitation Link.

### Actors

- New User

### Trigger

The user opens the Invitation Link.

### Preconditions

- Invitation Link is valid.
- Secret Code is valid.

### Workflow

1. The system opens the Member Registration page.
2. The user enters:
    - Full Name
    - Email or Mobile Number
    - Password
    - Secret Code
3. The user submits the registration form.
4. The system validates the information.
5. The system verifies the Secret Code.
6. The system creates the User Account.
7. The system assigns the Member role.
8. The system adds the user to the corresponding Meal Group.
9. The system records the activity in the Audit Log.
10. The system signs in the user automatically.
11. The system redirects the user to the Dashboard.

### Alternative Flow

**A1. Invalid Secret Code**

- Registration is rejected.

**A2. Duplicate Email or Mobile Number**

- Registration is rejected.

### Result

- Member account created.
- User joined the Meal Group successfully.

### Business Rules

- BR-006

### Related Use Cases

- UC-004

# Member Management Workflow

---

## WF-101 - Create Member Directly

### Purpose

Allow a Group Admin to create a new Member account without using an invitation link.

### Actors

- Group Admin

### Trigger

The Group Admin selects **Create Member** from the Member Management page.

### Preconditions

- The user is logged in.
- The user is a Group Admin.

### Workflow

1. The Group Admin opens Member Management.
2. The Group Admin selects **Create Member**.
3. The system displays the Member Creation form.
4. The Group Admin enters:
    - Full Name
    - Email or Mobile Number
5. The system generates a Temporary Password.
6. The system creates the Member account.
7. The system assigns the Member role.
8. The system adds the Member to the current Meal Group.
9. The system displays the Temporary Password.
10. The Group Admin shares the login credentials with the Member.
11. The system records the activity in the Audit Log.

### Alternative Flow

**A1. Duplicate Email or Mobile Number**

- The system rejects the request.
- The Group Admin provides a different Email or Mobile Number.

### Result

- Member account created successfully.
- Member added to the Meal Group.

### Business Rules

- BR-101

### Related Use Cases

- UC-005

---

## WF-102 - First Login with Temporary Password

### Purpose

Ensure that every Member created by a Group Admin replaces the Temporary Password with a personal password.

### Actors

- Member

### Trigger

The Member logs in using the Temporary Password.

### Preconditions

- Member account exists.
- Temporary Password is valid.

### Workflow

1. The Member enters Email or Mobile Number.
2. The Member enters the Temporary Password.
3. The system authenticates the Member.
4. The system detects that the account is using a Temporary Password.
5. The system redirects the Member to the Change Password page.
6. The Member enters a new password.
7. The Member confirms the new password.
8. The system validates the password.
9. The system replaces the Temporary Password.
10. The system records the activity in the Audit Log.
11. The system redirects the Member to the Dashboard.

### Alternative Flow

**A1. Password validation fails**

- The system displays the validation message.
- The Member enters a valid password.

### Result

- Temporary Password replaced.
- Member can access the system normally.

### Related Use Cases

- UC-002

---

## WF-103 - View Member List

### Purpose

Allow users to view the members of their Meal Group according to their permissions.

### Actors

- Group Admin
- Member
- Viewer

### Trigger

The user opens Member Management.

### Preconditions

- User is logged in.

### Workflow

1. The system displays the Member List.
2. The system displays each Member's basic information.
3. The system displays available actions based on the user's role.

### Result

- Member List displayed.

### Related Use Cases

- UC-006

---

## WF-104 - Update Member Role

### Purpose

Allow a Group Admin to change a Member's role.

### Actors

- Group Admin

### Trigger

The Group Admin selects **Change Role**.

### Preconditions

- Member exists.
- Group Admin has permission.

### Workflow

1. The Group Admin selects a Member.
2. The Group Admin selects a new role.
3. The system validates the request.
4. The system updates the Member's role.
5. The system records the activity in the Audit Log.

### Alternative Flow

**A1. Attempt to modify the last Group Admin**

- The system rejects the request.

### Result

- Member role updated successfully.

### Business Rules

- BR-102

### Related Use Cases

- UC-007

---

## WF-105 - Activate or Deactivate Member

### Purpose

Allow a Group Admin to control whether a Member can access the system.

### Actors

- Group Admin

### Trigger

The Group Admin changes a Member's account status.

### Preconditions

- Member exists.

### Workflow

1. The Group Admin selects a Member.
2. The Group Admin chooses Activate or Deactivate.
3. The system updates the Member status.
4. The system records the activity in the Audit Log.

### Result

- Member status updated.

### Business Rules

- BR-103

### Related Use Cases

- UC-008

---

## WF-106 - Reset Member Password

### Purpose

Allow a Group Admin to reset a Member's password when necessary.

### Actors

- Group Admin

### Trigger

The Group Admin selects **Reset Password**.

### Preconditions

- Member exists.

### Workflow

1. The Group Admin selects a Member.
2. The Group Admin selects Reset Password.
3. The system generates a new Temporary Password.
4. The system replaces the existing password.
5. The system displays the Temporary Password.
6. The Group Admin shares it with the Member.
7. The system records the activity in the Audit Log.
8. On the next login, the Member must change the Temporary Password.

### Result

- Password reset successfully.

### Business Rules

- BR-104

### Related Use Cases

- UC-009

# Meal Workflow

---

## WF-201 - Submit Meal Request

### Purpose

Allow a Group Member to request meals before the daily deadline.

### Actors

- Group Admin
- Member

### Trigger

The user opens the Meal Request page.

### Preconditions

- User is logged in.
- The selected date belongs to an open month.
- Meal request deadline has not passed.

### Workflow

1. The user opens the Meal Request page.
2. The system displays the current date and available meal options.
3. The user selects Lunch, Dinner, or both.
4. The user submits the request.
5. The system validates the submission time.
6. The system creates the Meal Entry.
7. The system updates the Member's Meal Count.
8. The system records the activity in the Audit Log.

### Alternative Flow

**A1. Meal request deadline has passed**

- The system rejects the request.
- The user may update the meal later through the Daily Meal Sheet if editing is allowed.

### Result

- Meal request submitted successfully.

### Business Rules

- BR-201
- BR-202

### Related Use Cases

- UC-201

---

## WF-202 - Update Daily Meal Sheet

### Purpose

Allow users to update meal entries for multiple members from a single page.

### Actors

- Group Admin
- Member

### Trigger

The user opens the Daily Meal Sheet.

### Preconditions

- User is logged in.
- The selected month is editable.

### Workflow

1. The user selects a date.
2. The system displays all group members.
3. The user enters meal quantities for one or more members.
4. The user submits the changes.
5. The system validates all entries.
6. The system updates each Member's Meal Count.
7. The system records all changes in the Audit Log.

### Alternative Flow

**A1. Month editing is disabled**

- The system rejects the update.

### Result

- Daily Meal Sheet updated successfully.

### Business Rules

- BR-203

### Related Use Cases

- UC-202

---

## WF-203 - View Meal History

### Purpose

Allow users to review meal records for any selected period.

### Actors

- Group Admin
- Member
- Viewer

### Trigger

The user opens Meal History.

### Preconditions

- User is logged in.

### Workflow

1. The user selects a month.
2. The system retrieves all meal records.
3. The system displays:
    - Daily Meal Entries
    - Total Meals
    - Guest Meals (if any)
4. The user reviews the information.

### Result

- Meal history displayed.

### Related Use Cases

- UC-204

---

# Bazar Workflow

---

## WF-301 - Create Bazar Entry

### Purpose

Allow users to record daily Bazar expenses.

### Actors

- Group Admin
- Member

### Trigger

The user opens the Bazar Entry page.

### Preconditions

- User is logged in.
- Selected month is editable.

### Workflow

1. The user opens Bazar Entry.
2. The user selects the Bazar Date.
3. The user enters:
    - Description
    - Amount
    - Remarks (Optional)
4. The user submits the entry.
5. The system validates the information.
6. The system creates the Bazar Entry.
7. The system updates the Group's Total Bazar Amount.
8. The system records the activity in the Audit Log.

### Result

- Bazar Entry created successfully.

### Related Use Cases

- UC-301

---

## WF-302 - Update Bazar Entry

### Purpose

Allow users to correct an existing Bazar entry.

### Actors

- Group Admin
- Member

### Trigger

The user selects Edit.

### Preconditions

- Bazar Entry exists.
- Month editing is enabled.

### Workflow

1. The user opens the Bazar Entry.
2. The user updates the information.
3. The system validates the changes.
4. The system updates the Bazar Entry.
5. The system recalculates the Group Total Bazar.
6. The system records the activity in the Audit Log.

### Result

- Bazar Entry updated successfully.

### Related Use Cases

- UC-302

---

## WF-303 - Delete Bazar Entry

### Purpose

Allow a Group Admin to remove an incorrect Bazar entry without losing audit history.

### Actors

- Group Admin

### Trigger

The user selects Delete.

### Preconditions

- Bazar Entry exists.
- Month editing is enabled.

### Workflow

1. The Group Admin selects a Bazar Entry.
2. The system asks for confirmation.
3. The Group Admin confirms.
4. The system marks the entry as deleted.
5. The system recalculates the Group Total Bazar.
6. The system records the activity in the Audit Log.

### Result

- Bazar Entry marked as deleted.

### Business Rules

- BR-316

### Related Use Cases

- UC-303

---

## WF-304 - View Bazar History

### Purpose

Allow users to review all recorded Bazar entries.

### Actors

- Group Admin
- Member
- Viewer

### Trigger

The user opens Bazar History.

### Preconditions

- User is logged in.

### Workflow

1. The user selects a month.
2. The system displays all Bazar entries.
3. The system displays:
    - Date
    - Description
    - Amount
    - Entered By
4. The user reviews the information.

### Result

- Bazar history displayed.

### Related Use Cases

- UC-304

---

# Asset Workflow

---

## WF-401 - Create Asset Entry

### Purpose

Allow users to record money deposited into the Meal Group.

### Actors

- Group Admin
- Member

### Trigger

The user opens Asset Entry.

### Preconditions

- User is logged in.
- Selected month is editable.

### Workflow

1. The user opens Asset Entry.
2. The user selects the Member.
3. The user enters:
    - Amount
    - Date
    - Remarks (Optional)
4. The user submits the entry.
5. The system validates the information.
6. The system creates the Asset Entry.
7. The system updates the Member's Total Asset.
8. The system updates the Group's Total Asset.
9. The system records the activity in the Audit Log.

### Result

- Asset Entry created successfully.

### Related Use Cases

- UC-401

---

## WF-402 - Update Asset Entry

### Purpose

Allow users to correct an Asset entry.

### Actors

- Group Admin
- Member

### Trigger

The user selects Edit.

### Preconditions

- Asset Entry exists.
- Month editing is enabled.

### Workflow

1. The user opens the Asset Entry.
2. The user updates the information.
3. The system validates the changes.
4. The system updates the Asset Entry.
5. The system recalculates the Member Total Asset.
6. The system recalculates the Group Total Asset.
7. The system records the activity in the Audit Log.

### Result

- Asset Entry updated successfully.

### Related Use Cases

- UC-402

---

## WF-403 - Delete Asset Entry

### Purpose

Allow a Group Admin to remove an incorrect Asset entry while preserving history.

### Actors

- Group Admin

### Trigger

The user selects Delete.

### Preconditions

- Asset Entry exists.
- Month editing is enabled.

### Workflow

1. The Group Admin selects an Asset Entry.
2. The system asks for confirmation.
3. The Group Admin confirms.
4. The system marks the Asset Entry as deleted.
5. The system recalculates:
    - Member Total Asset
    - Group Total Asset
6. The system records the activity in the Audit Log.

### Result

- Asset Entry marked as deleted.

### Business Rules

- BR-414

### Related Use Cases

- UC-403

---

## WF-404 - View Asset History

### Purpose

Allow users to review Asset records.

### Actors

- Group Admin
- Member
- Viewer

### Trigger

The user opens Asset History.

### Preconditions

- User is logged in.

### Workflow

1. The user selects a month.
2. The system displays all Asset entries.
3. The user reviews the information.

### Result

- Asset history displayed.

### Related Use Cases

- UC-404

# Accounting Workflow

---

## WF-501 - Perform Monthly Closing

### Purpose

Calculate the monthly meal expense, member balances, and carry forward automatically at the end of the month.

### Actors

- Group Admin

### Trigger

The Group Admin selects **Monthly Closing**.

### Preconditions

- User is logged in.
- User is a Group Admin.
- The selected month is open.

### Workflow

1. The Group Admin opens the Monthly Closing page.
2. The system displays the monthly summary.
3. The Group Admin reviews all information.
4. The Group Admin confirms the Monthly Closing.
5. The system calculates:
    - Total Meals
    - Total Bazar
    - Total Assets
6. The system calculates the Meal Rate.

   Meal Rate = Total Bazar ÷ Total Meals

7. The system calculates each Member's Meal Cost.

   Meal Cost = Member Total Meals × Meal Rate

8. The system calculates each Member's Closing Balance.

   Closing Balance = Total Asset − Meal Cost

9. The system calculates each Member's Carry Forward Balance.
10. The system stores the monthly summary.
11. The system changes the month status to Closed.
12. The system records the activity in the Audit Log.

### Alternative Flow

**A1. Total Meals is zero**

- Monthly Closing cannot continue.
- The system displays an appropriate message.

### Result

- Monthly Closing completed successfully.
- Member balances calculated.
- Carry Forward prepared.

### Business Rules

- BR-501
- BR-502
- BR-503

### Related Use Cases

- UC-501

---

## WF-502 - Reopen Monthly Closing

### Purpose

Allow the Group Admin to reopen a closed month for correction.

### Actors

- Group Admin

### Trigger

The Group Admin selects **Reopen Month**.

### Preconditions

- Month is already closed.

### Workflow

1. The Group Admin selects a closed month.
2. The system requests confirmation.
3. The Group Admin confirms.
4. The system changes the month status to Open.
5. The system restores editing permissions according to Group Settings.
6. The system records the activity in the Audit Log.

### Result

- Month reopened successfully.

### Related Use Cases

- UC-502

---

## WF-503 - View Monthly Summary

### Purpose

Display the complete financial summary of a selected month.

### Actors

- Group Admin
- Member
- Viewer

### Trigger

The user opens Monthly Summary.

### Preconditions

- Monthly Closing completed.

### Workflow

1. The user selects a month.
2. The system displays:
    - Total Meals
    - Total Bazar
    - Total Assets
    - Meal Rate
    - Member-wise Meal
    - Member-wise Meal Cost
    - Member-wise Asset
    - Closing Balance
    - Carry Forward
3. The user reviews the summary.

### Result

- Monthly Summary displayed.

### Related Use Cases

- UC-503

---

# Report Workflow

---

## WF-601 - View Reports

### Purpose

Allow users to generate and review available reports.

### Actors

- Group Admin
- Member
- Viewer

### Trigger

The user opens the Reports page.

### Preconditions

- User is logged in.

### Workflow

1. The user selects a report.
2. The user applies available filters.
3. The system retrieves the requested data.
4. The system generates the report.
5. The system displays the report.

### Result

- Report displayed successfully.

### Related Use Cases

- UC-601

---

## WF-602 - Export Report

### Purpose

Allow users to export reports for printing or sharing.

### Actors

- Group Admin
- Member

### Trigger

The user selects Export.

### Preconditions

- Report is available.

### Workflow

1. The user opens a report.
2. The user selects Export.
3. The user selects the export format.
4. The system generates the export file.
5. The system downloads the file.

### Result

- Report exported successfully.

### Related Use Cases

- UC-602

---

# Audit Workflow

---

## WF-701 - View Audit Log

### Purpose

Allow the Group Admin to review important system activities.

### Actors

- Group Admin

### Trigger

The Group Admin opens Audit Log.

### Preconditions

- User is logged in.

### Workflow

1. The Group Admin opens Audit Log.
2. The system displays recorded activities.
3. The Group Admin applies filters.
4. The system displays matching records.

### Result

- Audit Log displayed successfully.

### Related Use Cases

- UC-701

---

## WF-702 - Unauthorized Access

### Purpose

Protect the system from unauthorized operations.

### Actors

- Any User

### Trigger

A user attempts to access a restricted feature.

### Preconditions

- User does not have the required permission.

### Workflow

1. The user requests a restricted resource.
2. The system verifies authentication.
3. The system verifies authorization.
4. The system denies access.
5. The system displays an appropriate message.
6. The system records the security event when applicable.

### Result

- Unauthorized operation prevented.

### Related Use Cases

- UC-702

---

## WF-703 - User Logout

### Purpose

Terminate the current user session securely.

### Actors

- Group Admin
- Member
- Viewer

### Trigger

The user selects Logout.

### Preconditions

- User is logged in.

### Workflow

1. The user selects Logout.
2. The system invalidates the active session.
3. The system redirects the user to the Login page.

### Result

- User logged out successfully.

### Related Use Cases

- UC-703

