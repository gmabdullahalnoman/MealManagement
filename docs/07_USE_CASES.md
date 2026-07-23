# Use Cases

---

# UC-001 - User Registration & Group Creation

Actors:
- User

Preconditions:
- User is not registered.

Main Flow:

1. User opens registration page.
2. User enters Name.
3. User enters Email or Mobile Number.
4. User enters Password.
5. User enters Meal Group Name.
6. User submits the form.
7. System validates the information.
8. System creates User account.
9. System creates Meal Group.
10. System assigns User as Group Admin.
11. System redirects User to Dashboard.

Alternative Flow:

A1. Email or Mobile already exists.
- System displays validation message.

Postconditions:

- User account created.
- Meal Group created.
- User becomes Group Admin.

---

# UC-002 - User Login

Actors:
- User

Preconditions:
- User account exists.

Main Flow:

1. User opens login page.
2. User enters Email or Mobile Number.
3. User enters Password.
4. User submits login request.
5. System validates credentials.
6. System creates user session.
7. User enters Dashboard.

Alternative Flow:

A1. Invalid credentials.
- System displays error message.

Postconditions:

- User authenticated.

---

# UC-003 - Generate Invitation Link

Actors:
- Group Admin

Preconditions:
- User is Group Admin.

Main Flow:

1. Group Admin opens Member Management.
2. Group Admin clicks Generate Invitation Link.
3. System generates Invitation Link.
4. System generates Secret Code.
5. System displays Link and Secret Code.
6. Admin shares the information.

Postconditions:

- Invitation Link available.
- Secret Code available.

---

# UC-004 - Join Meal Group Using Invitation Link

Actors:
- New User

Preconditions:
- Valid Invitation Link exists.

Main Flow:

1. User opens Invitation Link.
2. System displays registration form.
3. User enters Name.
4. User enters Email or Mobile Number.
5. User enters Password.
6. User enters Secret Code.
7. User submits registration.
8. System validates information.
9. System creates account.
10. System assigns Member role.
11. System adds user to Meal Group.

Alternative Flow:

A1. Invalid Secret Code.
- Registration rejected.

A2. Existing Email or Mobile Number.
- Registration rejected.

Postconditions:

- Member account created.
- Member added to Meal Group.

---

# UC-005 - Create Member Directly

Actors:
- Group Admin

Preconditions:
- User is Group Admin.

Main Flow:

1. Group Admin opens Member Management.
2. Group Admin clicks Create Member.
3. Admin enters Member information.
4. Admin assigns initial password.
5. Admin saves the form.
6. System creates Member account.
7. System adds Member to Meal Group.

Postconditions:

- Member created successfully.

---

# UC-006 - Change Password

Actors:
- Member
- Group Admin

Preconditions:
- User logged in.

Main Flow:

1. User opens Profile.
2. User selects Change Password.
3. User enters current password.
4. User enters new password.
5. User confirms new password.
6. User submits.
7. System validates information.
8. System updates password.

Postconditions:

- Password updated successfully.

---

# Member Management

---

# UC-101 - View Member List

Actors:
- Group Admin
- Member
- Viewer

Preconditions:
- User is logged in.
- User belongs to a Meal Group.

Main Flow:

1. User opens Member Management.
2. System displays the Member list.
3. System displays each Member's role and basic information.

Postconditions:

- Member list displayed successfully.

---

# UC-102 - Update Own Profile

Actors:
- Group Admin
- Member
- Viewer

Preconditions:
- User is logged in.

Main Flow:

1. User opens Profile.
2. User edits personal information.
3. User saves changes.
4. System validates the information.
5. System updates the profile.
6. System records the activity in the Audit Log.

Postconditions:

- Profile updated successfully.

---

# UC-103 - Update Member Information

Actors:
- Group Admin

Preconditions:
- User is Group Admin.

Main Flow:

1. Group Admin opens Member Management.
2. Admin selects a Member.
3. Admin edits Member information.
4. Admin saves changes.
5. System validates the data.
6. System updates the Member information.
7. System records the activity in the Audit Log.

Postconditions:

- Member information updated.

---

# UC-104 - Change Member Role

Actors:
- Group Admin

Preconditions:
- User is Group Admin.

Main Flow:

1. Group Admin opens Member Management.
2. Admin selects a Member.
3. Admin selects a new Role.
4. Admin saves the changes.
5. System validates the request.
6. System updates the Member role.
7. System records the role change in the Audit Log.

Alternative Flow:

A1. Selected Member is the last remaining Group Admin.
- System rejects the request.

Postconditions:

- Member role updated successfully.

---

# UC-105 - Remove Member

Actors:
- Group Admin

Preconditions:
- User is Group Admin.

Main Flow:

1. Group Admin opens Member Management.
2. Admin selects a Member.
3. Admin clicks Remove.
4. System asks for confirmation.
5. Admin confirms.
6. System removes the Member from the Meal Group.
7. System preserves all historical business records.
8. System records the activity in the Audit Log.

Alternative Flow:

A1. Selected Member is the last remaining Group Admin.
- Removal is rejected.

Postconditions:

- Member removed from the Meal Group.

---

# UC-106 - Promote Member to Group Admin

Actors:
- Group Admin

Preconditions:
- User is Group Admin.

Main Flow:

1. Group Admin opens Member Management.
2. Admin selects a Member.
3. Admin chooses "Promote to Group Admin".
4. System updates the Member role.
5. System records the activity in the Audit Log.

Postconditions:

- Member becomes Group Admin.

---

# UC-107 - Demote Group Admin to Member

Actors:
- Group Admin

Preconditions:
- More than one Group Admin exists.

Main Flow:

1. Group Admin opens Member Management.
2. Admin selects another Group Admin.
3. Admin chooses "Change to Member".
4. System validates the request.
5. System updates the role.
6. System records the activity.

Alternative Flow:

A1. Selected user is the last remaining Group Admin.
- Request rejected.

Postconditions:

- Role updated successfully.

---

# UC-108 - Assign Viewer Role

Actors:
- Group Admin

Preconditions:
- User is Group Admin.

Main Flow:

1. Group Admin opens Member Management.
2. Admin selects a Member.
3. Admin assigns Viewer role.
4. System updates the role.
5. System records the activity.

Postconditions:

- User becomes Viewer.

---

# UC-109 - View Member Details

Actors:
- Group Admin
- Member

Preconditions:
- User is logged in.

Main Flow:

1. User selects a Member.
2. System displays Member details.
3. System displays profile information.
4. System displays summary information.

Postconditions:

- Member details displayed successfully.

---

# UC-110 - View Personal Profile

Actors:
- Group Admin
- Member
- Viewer

Preconditions:
- User is logged in.

Main Flow:

1. User opens Profile.
2. System displays personal information.
3. System displays account information.
4. System displays current role.

Postconditions:

- Personal profile displayed successfully.

---

# Meal

---

# UC-201 - Submit Personal Meal Request

Actors:
- Group Admin
- Member

Preconditions:
- User is logged in.
- User belongs to a Meal Group.
- Meal Request time has not expired.

Main Flow:

1. User opens Meal Request.
2. User selects the Meal Date.
3. User selects Lunch and/or Dinner.
4. User submits the request.
5. System validates the request time.
6. System creates the Meal Entry.
7. System records the activity in the Audit Log.

Alternative Flow:

A1. Meal Request time has expired.
- System rejects the request.
- User may contact a Group Admin or use manual Meal Entry later.

Postconditions:

- Meal Entry created successfully.

---

# UC-202 - Submit Daily Meal Sheet

Actors:
- Group Admin
- Member

Preconditions:
- User is logged in.

Main Flow:

1. User opens Daily Meal Sheet.
2. User selects a Date.
3. System displays all Members.
4. User enters Meal values.
5. User clicks Update.
6. System validates all values.
7. System updates all Meal Entries.
8. System records all changes in the Audit Log.

Postconditions:

- Meal Entries updated successfully.

---

# UC-203 - Update Meal Entry

Actors:
- Group Admin
- Member

Preconditions:
- Meal Entry exists.

Main Flow:

1. User selects a Meal Entry.
2. User updates the Meal value.
3. User saves the changes.
4. System validates the data.
5. System updates the Meal Entry.
6. System records the modification in the Audit Log.

Postconditions:

- Meal Entry updated successfully.

---

# UC-204 - View Meal History

Actors:
- Group Admin
- Member
- Viewer

Preconditions:
- User is logged in.

Main Flow:

1. User opens Meal History.
2. User selects a Month.
3. System displays Meal history.
4. User reviews the information.

Postconditions:

- Meal history displayed.

---

# Bazar

---

# UC-301 - Create Bazar Entry

Actors:
- Group Admin
- Member

Preconditions:
- User is logged in.

Main Flow:

1. User opens Bazar Entry.
2. User selects the Bazar Date.
3. User adds one or more Bazar Items.
4. System calculates the total amount.
5. User saves the Bazar Entry.
6. System stores the information.
7. System records the activity in the Audit Log.

Postconditions:

- Bazar Entry created successfully.

---

# UC-302 - Update Bazar Entry

Actors:
- Group Admin
- Member

Preconditions:
- Bazar Entry exists.

Main Flow:

1. User opens a Bazar Entry.
2. User edits one or more Bazar Items.
3. System recalculates the total amount.
4. User saves the changes.
5. System updates the Bazar Entry.
6. System records the activity in the Audit Log.

Postconditions:

- Bazar Entry updated successfully.

---

# UC-303 - Delete Bazar Entry

Actors:
- Group Admin

Preconditions:
- Bazar Entry exists.

Main Flow:

1. Group Admin selects a Bazar Entry.
2. Admin clicks Delete.
3. System requests confirmation.
4. Admin confirms.
5. System deletes the Bazar Entry.
6. System records the activity in the Audit Log.

Postconditions:

- Record marked as deleted.

---

# UC-304 - View Bazar History

Actors:
- Group Admin
- Member
- Viewer

Preconditions:
- User is logged in.

Main Flow:

1. User opens Bazar History.
2. User selects a Month.
3. System displays all Bazar Entries.
4. User reviews the information.

Postconditions:

- Bazar history displayed.

---

# Asset

---

# UC-401 - Create Asset Entry

Actors:
- Group Admin
- Member

Preconditions:
- User is logged in.

Main Flow:

1. User opens Asset Entry.
2. User selects a Member.
3. User enters the Amount.
4. User selects the Entry Date.
5. User saves the Asset Entry.
6. System stores the information.
7. System records the activity in the Audit Log.

Postconditions:

- Asset Entry created successfully.

---

# UC-402 - Update Asset Entry

Actors:
- Group Admin
- Member

Preconditions:
- Asset Entry exists.

Main Flow:

1. User opens an Asset Entry.
2. User edits the Amount.
3. User saves the changes.
4. System updates the Asset Entry.
5. System records the activity in the Audit Log.

Postconditions:

- Asset Entry updated successfully.

---

# UC-403 - Delete Asset Entry

Actors:
- Group Admin

Preconditions:
- Asset Entry exists.

Main Flow:

1. Group Admin selects an Asset Entry.
2. Admin clicks Delete.
3. System requests confirmation.
4. Admin confirms.
5. System deletes the Asset Entry.
6. System records the activity in the Audit Log.

Postconditions:

- Asset Entry Marked as deleted successfully.

---

# UC-404 - View Asset History

Actors:
- Group Admin
- Member
- Viewer

Preconditions:
- User is logged in.

Main Flow:

1. User opens Asset History.
2. User selects a Month.
3. System displays all Asset Entries.
4. User reviews the information.

Postconditions:

- Asset history displayed.

--- 

# Accounting

---

# UC-501 - Perform Monthly Closing

Actors:
- Group Admin

Preconditions:
- User is logged in.
- User is a Group Admin.
- All business data for the month has been reviewed.

Main Flow:

1. Group Admin opens Monthly Closing.
2. System displays monthly summary.
3. Admin reviews Total Meal, Total Bazar and Total Asset.
4. Admin confirms Monthly Closing.
5. System calculates Meal Rate.
6. System calculates Meal Cost for every Member.
7. System calculates Member Balance.
8. System calculates Carry Forward.
9. System saves the Monthly Summary.
10. System marks the month as Closed.
11. System records the activity in the Audit Log.

Alternative Flow:

A1. Monthly Closing already exists.
- System rejects the request.

Postconditions:

- Monthly Closing completed successfully.

---

# UC-502 - Reopen Monthly Closing

Actors:
- Group Admin

Preconditions:
- A month has already been closed.

Main Flow:

1. Group Admin opens Monthly Closing History.
2. Admin selects a closed month.
3. Admin clicks Reopen.
4. System requests confirmation.
5. Admin confirms.
6. System changes the month status to Open.
7. System records the activity in the Audit Log.

Postconditions:

- Selected month becomes editable.

---

# UC-503 - View Monthly Summary

Actors:
- Group Admin
- Member
- Viewer

Preconditions:
- Monthly Closing completed.

Main Flow:

1. User opens Monthly Summary.
2. User selects a Month.
3. System displays:
    - Total Meal
    - Total Bazar
    - Meal Rate
    - Member-wise Meal
    - Member-wise Asset
    - Member Balance
    - Carry Forward
4. User reviews the summary.

Postconditions:

- Monthly Summary displayed.

---

# Reports

---

# UC-601 - Generate Reports

Actors:
- Group Admin
- Member
- Viewer

Preconditions:
- User is logged in.

Main Flow:

1. User opens Reports.
2. User selects Report Type.
3. User applies filters.
4. System generates the report.
5. User reviews the report.

Postconditions:

- Report generated successfully.

---

# UC-602 - Export Report

Actors:
- Group Admin
- Member

Preconditions:
- Report generated.

Main Flow:

1. User opens a Report.
2. User clicks Export.
3. User selects the desired format.
4. System generates the export file.
5. User downloads the file.

Postconditions:

- Report exported successfully.

---

# Audit & Security

---

# UC-701 - View Audit Log

Actors:
- Group Admin

Preconditions:
- User is logged in.

Main Flow:

1. Group Admin opens Audit Log.
2. System displays all recorded activities.
3. Admin filters by User, Date or Module.
4. System displays matching records.

Postconditions:

- Audit Log displayed successfully.

---

# UC-702 - Unauthorized Access

Actors:
- Unauthorized User

Preconditions:
- User attempts an operation without permission.

Main Flow:

1. User requests a protected resource.
2. System validates authentication.
3. System validates authorization.
4. System denies the request.
5. System displays an appropriate error message.
6. System records the event if required.

Postconditions:

- Protected resource remains secure.

---

# UC-703 - User Logout

Actors:
- Group Admin
- Member
- Viewer

Preconditions:
- User is logged in.

Main Flow:

1. User clicks Logout.
2. System invalidates the current session.
3. System redirects the user to the Login page.

Postconditions:

- User logged out successfully.
