# Business Rules

This document defines the official business rules of the Meal Management System.

---

# Authentication & Group

## BR-001
A user must register to create a new Meal Group.

## BR-002
The user who creates a Meal Group automatically becomes the first Group Admin.

## BR-003
Every Meal Group must have at least one Group Admin.

## BR-004
A Meal Group shall have a unique Invitation Link.

## BR-005
A Secret Code shall be generated for every Invitation Link.

## BR-006
A user may join a Meal Group using a valid Invitation Link and Secret Code.

## BR-007
A Group Admin may create a Member directly.

## BR-008
A Group Admin shall assign an initial password when creating a Member.

## BR-009
A Member may change their password after login.

## BR-010
A Member can belong to only one Meal Group at a time.

## BR-011
Only the System Administrator can access platform-level administration.

## BR-012
Every Member account must have a unique Email or Mobile Number.

## BR-013
Invitation Links may be shared through any communication channel.

## BR-014
Only a Group Admin may generate Invitation Links.

## BR-015
The system shall associate every newly joined Member with the corresponding Meal Group.

---

# Member Management

## BR-101
Every Member shall have exactly one role.

## BR-102
Available roles are Group Admin, Member and Viewer.

## BR-103
A Group Admin may promote a Member to Group Admin.

## BR-104
A Group Admin may demote another Group Admin to Member.

## BR-105
A Group Admin may assign the Viewer role.

## BR-106
A Group Admin may change a Viewer's role.

## BR-107
A Group Admin may remove a Member from the Meal Group.

## BR-108
The last remaining Group Admin cannot be removed or demoted.

## BR-109
A Member may update their own profile.

## BR-110
A Group Admin may update any Member's profile when necessary.

## BR-111
Every Member shall have a registration date.

## BR-112
Removed Members shall no longer participate in future business operations.

## BR-113
Historical records of removed Members shall remain unchanged.

## BR-114
A Member's role change shall not modify previous business records.

## BR-115
Every role change shall be recorded in the Audit Log.

## BR-016

All user accounts shall be created through a single Account Creation process,
regardless of the registration method.

---

# Meal

## BR-201
Meals shall be recorded by date.

## BR-202
Every Meal Entry belongs to one Member.

## BR-203
Every Meal Entry belongs to one Meal Group.

## BR-204
Members may use Personal Meal Entry.

## BR-205
Group Admins may use Personal Meal Entry.

## BR-206
Members may use the Daily Meal Sheet.

## BR-207
Group Admins may use the Daily Meal Sheet.

## BR-208
Viewers cannot create or modify Meal Entries.

## BR-209
A Member may update another Member's Meal Entry.

## BR-210
A Group Admin may update any Meal Entry.

## BR-211
Every Meal modification shall be recorded in the Audit Log.

## BR-212
The system shall support Bulk Meal Entry through the Daily Meal Sheet.

## BR-213
Meal Requests submitted before the configured deadline shall automatically create Meal Entries.

## BR-214
Meal Requests submitted after the deadline shall not be processed automatically.

## BR-215
Late Meals may be entered manually.

## BR-216
Guest Meals shall be added to the responsible Member's Meal count.

## BR-217
Guest Meals shall not create separate Member accounts.

## BR-218
Meal quantity may contain fractional values if required.

## BR-219
Meal history shall remain available after Monthly Closing.

## BR-220
Meal records used in Monthly Closing shall not be deleted.

# Bazar

## BR-301
Every Bazar Entry shall belong to one Meal Group.

## BR-302
Every Bazar Entry shall have a Bazar Date.

## BR-303
Every Bazar Entry shall contain the total expense amount.

## BR-304
A Bazar Entry may contain one or more items.

## BR-305
Each Bazar Item shall have a name, quantity, unit, rate and amount.

## BR-306
The total Bazar amount shall be the sum of all Bazar Items.

## BR-307
Both Group Admin and Member may create Bazar Entries.

## BR-308
Viewers cannot create or modify Bazar Entries.

## BR-309
Both Group Admin and Member may update existing Bazar Entries.

## BR-310
Only Group Admin may delete a Bazar Entry.

## BR-311
Every Bazar modification shall be recorded in the Audit Log.

## BR-312
Every Bazar Entry shall record the creator.

## BR-313
Every Bazar Entry shall record the last modifier.

## BR-314
Historical Bazar records shall remain available after Monthly Closing.

## BR-315
Bazar Entries included in Monthly Closing shall not be deleted.

## BR-316
Deleted Bazar records shall remain in the system for historical purposes.

---

# Asset

## BR-401
Every Asset Entry shall belong to one Member.

## BR-402
Every Asset Entry shall belong to one Meal Group.

## BR-403
Every Asset Entry shall contain an amount.

## BR-404
Every Asset Entry shall have an entry date.

## BR-405
Both Group Admin and Member may create Asset Entries.

## BR-406
Viewers cannot create or modify Asset Entries.

## BR-407
Both Group Admin and Member may update Asset Entries.

## BR-408
Only Group Admin may delete Asset Entries.

## BR-409
Every Asset modification shall be recorded in the Audit Log.

## BR-410
Asset history shall remain permanently available.

## BR-411
Asset Entries included in Monthly Closing shall not be deleted.

## BR-412
Additional Asset may be added at any time during a month.

## BR-413
Asset Entries shall increase the Member's balance.

## BR-414
Deleted Asset records shall remain in the system for historical purposes.

---

# Accounting

## BR-501
Monthly Closing shall be performed separately for each Meal Group.

## BR-502
Only a Group Admin may perform Monthly Closing.

## BR-503
Monthly Closing shall calculate the Total Meal.

## BR-504
Monthly Closing shall calculate the Total Bazar.

## BR-505
Monthly Closing shall calculate the Meal Rate.

## BR-506
Meal Rate = Total Bazar ÷ Total Meal.

## BR-507
Each Member's Meal Cost = Meal Rate × Total Meal.

## BR-508
Member Balance = Total Asset − Meal Cost.

## BR-509
Positive balances shall be carried forward to the next month.

## BR-510
Negative balances shall also be carried forward to the next month.

## BR-511
Carry Forward shall automatically become the opening balance of the next month.

## BR-512
Monthly Closing shall preserve historical calculations.

## BR-513
Closed months shall become read-only.

## BR-514
Only Group Admin may reopen a closed month.

## BR-515
Reopening a month shall be recorded in the Audit Log.

## BR-516
Recalculation shall be performed after reopening if business data changes.

## BR-517
Every Monthly Closing shall generate a Monthly Summary.

## BR-518
Meal Rate shall remain unchanged after Monthly Closing unless the month is reopened.

## BR-519
The system shall prevent duplicate Monthly Closing for the same month.

## BR-520
All accounting calculations shall be performed automatically by the system.

## BR-521
Group Admin may enable or disable editing for an open month from Group Settings.

# Reports

## BR-601
The system shall generate Member Reports.

## BR-602
The system shall generate Meal Reports.

## BR-603
The system shall generate Bazar Reports.

## BR-604
The system shall generate Asset Reports.

## BR-605
The system shall generate Monthly Summary Reports.

## BR-606
Reports shall display data based on the selected month.

## BR-607
Reports shall display data based on the selected Member.

## BR-608
Reports shall display Group totals.

## BR-609
Reports shall display Meal Rate.

## BR-610
Reports shall display Total Meal.

## BR-611
Reports shall display Total Bazar.

## BR-612
Reports shall display Total Asset.

## BR-613
Reports shall display Member Balance.

## BR-614
Reports shall display Carry Forward Balance.

## BR-615
Viewers may access reports according to their viewing permission.

## BR-616
Reports shall always be generated from the latest available data.

---

# Audit & Security

## BR-701
Every business transaction shall be recorded in the Audit Log.

## BR-702
The Audit Log shall record the User.

## BR-703
The Audit Log shall record the Action.

## BR-704
The Audit Log shall record the Date and Time.

## BR-705
The Audit Log shall record the affected business record.

## BR-706
The Audit Log shall record the previous value and the new value whenever applicable.

## BR-707
Authentication shall be required before accessing business data.

## BR-708
Passwords shall be stored in encrypted form.

## BR-709
Authorization shall be based on the assigned Role.

## BR-710
Viewers shall have read-only access.

## BR-711
Unauthorized actions shall be rejected by the system.

## BR-712
Deleted business records shall not remove historical accounting records.

## BR-713
Every Monthly Closing activity shall be recorded in the Audit Log.

## BR-714
Every Member role change shall be recorded in the Audit Log.

## BR-715
Every login attempt shall be recorded by the system.

## BR-716
System errors affecting business operations shall be logged.

## BR-717
Business data shall be protected from unauthorized modification.

## BR-718
The system shall maintain business data integrity.

## BR-719
The system shall preserve historical records.

## BR-720
Every business record shall contain creation and last modification information.

