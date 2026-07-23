# Requirements

This document defines the functional and non-functional requirements of the Meal Management System.

---

# Functional Requirements

## Authentication & Group

### FR-001
The system shall allow a user to register using an Email Address or Mobile Number.

### FR-002
The system shall allow a registered user to log in using valid credentials.

### FR-003
The system shall allow a new user to create a Meal Group during registration.

### FR-004
The system shall automatically assign the creator as the first Group Admin.

### FR-005
The system shall generate a unique Invitation Link for each Meal Group.

### FR-006
The system shall generate a Secret Code for each Invitation Link.

### FR-007
The system shall allow a user to join a Meal Group using a valid Invitation Link and Secret Code.

### FR-008
The system shall allow a Group Admin to create a Member account directly.

### FR-009
The system shall allow a Member to change their password.

### FR-010
The system shall prevent duplicate Email Address or Mobile Number registration.

### FR-011
The system shall encrypt all user passwords.

### FR-012
The system shall allow only authenticated users to access business data.

### FR-013
The system shall maintain one active Meal Group per Member.

### FR-014
The system shall maintain user profile information.

### FR-015
The system shall allow a user to update their own profile.

### FR-016
The system shall use a unified account creation process for all registration methods.

---

## Member Management

### FR-101
The system shall display the complete Member list of a Meal Group.

### FR-102
The system shall allow a Group Admin to update Member information.

### FR-103
The system shall allow a Group Admin to remove a Member.

### FR-104
The system shall allow a Group Admin to promote a Member to Group Admin.

### FR-105
The system shall allow a Group Admin to demote another Group Admin.

### FR-106
The system shall allow a Group Admin to assign the Viewer role.

### FR-107
The system shall display each Member's current role.

### FR-108
The system shall maintain Member registration history.

### FR-109
The system shall allow Members to update their own profile.

### FR-110
The system shall record all role changes in the Audit Log.

### FR-111
The system shall prevent removal of the last remaining Group Admin.

### FR-112
The system shall preserve historical records after a Member is removed.

### FR-113
The system shall maintain profile modification history.

### FR-114
The system shall display Member status and basic information.

### FR-115
The system shall maintain Member activity history.

## Meal

### FR-201
The system shall allow Members to create Personal Meal Entries.

### FR-202
The system shall allow Group Admins to create Personal Meal Entries.

### FR-203
The system shall provide a Daily Meal Sheet for entering Meals of multiple Members.

### FR-204
The system shall allow both Group Admins and Members to use the Daily Meal Sheet.

### FR-205
The system shall display all Members in the Daily Meal Sheet based on the selected date.

### FR-206
The system shall allow updating Meal Entries directly from the Daily Meal Sheet.

### FR-207
The system shall allow Members to update another Member's Meal Entry.

### FR-208
The system shall allow Group Admins to update any Meal Entry.

### FR-209
The system shall prevent Viewers from creating or modifying Meal Entries.

### FR-210
The system shall record Meal Entries by date.

### FR-211
The system shall support Meal Requests before the configured deadline.

### FR-212
The system shall automatically create Meal Entries from valid Meal Requests.

### FR-213
The system shall reject automatic Meal Requests submitted after the deadline.

### FR-214
The system shall allow manual Meal Entry after the deadline.

### FR-215
The system shall support fractional Meal values.

### FR-216
The system shall include Guest Meals in the responsible Member's Meal count.

### FR-217
The system shall preserve Meal history after Monthly Closing.

### FR-218
The system shall maintain complete Meal Entry history.

### FR-219
The system shall record every Meal modification in the Audit Log.

### FR-220
The system shall prevent unauthorized Meal modification.

---

## Bazar

### FR-301
The system shall allow Group Admins to create Bazar Entries.

### FR-302
The system shall allow Members to create Bazar Entries.

### FR-303
The system shall prevent Viewers from creating Bazar Entries.

### FR-304
The system shall allow multiple Bazar Items within a single Bazar Entry.

### FR-305
The system shall calculate the total Bazar amount automatically.

### FR-306
The system shall allow editing Bazar Entries.

### FR-307
The system shall allow only Group Admins to delete Bazar Entries.

### FR-308
The system shall maintain Bazar history.

### FR-309
The system shall record the creator of every Bazar Entry.

### FR-310
The system shall record the last modifier of every Bazar Entry.

### FR-311
The system shall record every Bazar modification in the Audit Log.

### FR-312
The system shall preserve Bazar records after Monthly Closing.

### FR-313
The system shall prevent unauthorized modification of closed Bazar records.

### FR-314
The system shall maintain Bazar records by date.

### FR-315
The system shall calculate the total amount from all Bazar Items.

### FR-316
The system shall preserve deleted Bazar records for auditing.

---

## Asset

### FR-401
The system shall allow Group Admins to create Asset Entries.

### FR-402
The system shall allow Members to create Asset Entries.

### FR-403
The system shall prevent Viewers from creating Asset Entries.

### FR-404
The system shall associate every Asset Entry with a Member.

### FR-405
The system shall record Asset Entry dates.

### FR-406
The system shall allow updating Asset Entries.

### FR-407
The system shall allow only Group Admins to delete Asset Entries.

### FR-408
The system shall maintain Asset history.

### FR-409
The system shall record Asset modifications in the Audit Log.

### FR-410
The system shall preserve Asset records after Monthly Closing.

### FR-411
The system shall allow multiple Asset Entries for the same Member.

### FR-412
The system shall calculate the total Asset amount for each Member automatically.

### FR-413
The system shall prevent unauthorized modification of Asset records.

### FR-414
The system shall maintain complete Asset transaction history.

### FR-415
The system shall display Member-wise Asset Summary.

### FR-316
The system shall preserve deleted Bazar records for auditing.

## Accounting

### FR-501
The system shall calculate the Total Meal for the selected month.

### FR-502
The system shall calculate the Total Bazar for the selected month.

### FR-503
The system shall calculate the Meal Rate automatically.

### FR-504
The system shall calculate each Member's Meal Cost automatically.

### FR-505
The system shall calculate each Member's Balance automatically.

### FR-506
The system shall carry forward Member Balances to the next month.

### FR-507
The system shall allow only Group Admins to perform Monthly Closing.

### FR-508
The system shall prevent duplicate Monthly Closing for the same month.

### FR-509
The system shall preserve Monthly Closing history.

### FR-510
The system shall make closed months read-only.

### FR-511
The system shall allow Group Admins to reopen a closed month.

### FR-512
The system shall recalculate accounting information after reopening a month.

### FR-513
The system shall generate a Monthly Summary after Monthly Closing.

### FR-514
The system shall preserve previous Monthly Summaries.

### FR-515
The system shall prevent unauthorized accounting operations.

### FR-516
The system shall allow Group Admin to control month editing from Group Settings.

---

## Reports

### FR-601
The system shall generate Member Reports.

### FR-602
The system shall generate Meal Reports.

### FR-603
The system shall generate Bazar Reports.

### FR-604
The system shall generate Asset Reports.

### FR-605
The system shall generate Monthly Summary Reports.

### FR-606
The system shall support report filtering by month.

### FR-607
The system shall support report filtering by Member.

### FR-608
The system shall display Total Meal.

### FR-609
The system shall display Total Bazar.

### FR-610
The system shall display Total Asset.

### FR-611
The system shall display Meal Rate.

### FR-612
The system shall display Member Balance.

### FR-613
The system shall display Carry Forward Balance.

### FR-614
The system shall allow exporting reports for printing.

### FR-615
The system shall display only authorized information based on the user's role.

---

## Audit & Security

### FR-701
The system shall maintain an Audit Log for all business transactions.

### FR-702
The system shall record the User who performed an action.

### FR-703
The system shall record the Action performed.

### FR-704
The system shall record the Date and Time of every action.

### FR-705
The system shall record affected business records.

### FR-706
The system shall record previous and updated values whenever applicable.

### FR-707
The system shall encrypt user passwords.

### FR-708
The system shall authorize users based on their assigned role.

### FR-709
The system shall prevent unauthorized business operations.

### FR-710
The system shall maintain complete business history.

### FR-711
The system shall preserve historical accounting records.

### FR-712
The system shall log Monthly Closing activities.

### FR-713
The system shall log Member role changes.

### FR-714
The system shall log system errors affecting business operations.

### FR-715
The system shall maintain data integrity.

---

# Non-Functional Requirements

## Performance

### NFR-001
The system should respond to normal user requests within 2 seconds.

### NFR-002
The system should support multiple users working simultaneously.

---

## Security

### NFR-101
Passwords must be stored using secure encryption.

### NFR-102
Role-based access control shall be enforced.

### NFR-103
Unauthorized access shall be denied.

---

## Reliability

### NFR-201
The system shall preserve business data without loss.

### NFR-202
The system shall maintain accurate accounting calculations.

---

## Usability

### NFR-301
The system shall provide a simple and user-friendly interface.

### NFR-302
The system shall minimize the number of steps required to perform daily operations.

---

## Maintainability

### NFR-401
The system shall follow a modular architecture.

### NFR-402
The system shall support future feature enhancements without major redesign.

---

## Scalability

### NFR-501
The system shall support future expansion for multiple Meal Groups.

### NFR-502
The system architecture shall support future mobile application integration.

