### Member APIs
```
   POST   /api/members
   GET    /api/members
   GET    /api/members/{id}
   PUT    /api/members/{id}
   PATCH  /api/members/{id}/status
```
### Meal APIs
```
   POST   /api/meals
   GET    /api/meals
   GET    /api/meals/{id}
   PUT    /api/meals/{id}
   DELETE /api/meals/{id}
```
### Financial Transaction APIs
```
   POST   /api/transactions
   GET    /api/transactions
   GET    /api/transactions/{id}
   PUT    /api/transactions/{id}
   DELETE /api/transactions/{id}
```
### Bazar APIs
```
   POST   /api/bazar
   GET    /api/bazar
   GET    /api/bazar/{id}
   PUT    /api/bazar/{id}
   DELETE /api/bazar/{id}
```   
### Monthly Calculation APIs
```
   GET /api/monthly/{year}/{month}
   GET /api/monthly/{year}/{month}/members
   GET /api/monthly/{year}/{month}/summary
```
### API Principles
   - Use proper HTTP methods and status codes.
   - Request/response data will use DTOs.
   - Validate incoming requests.
   - Return consistent error responses.
   - Do not expose JPA entities directly.
   - Business calculations remain in the Service layer.
   - API endpoints should remain resource-oriented.
#### Example
   >POST /api/meals

#### Request
```
{
"memberId": 1,
"mealDate": "2026-10-04",
"mealCount": 2
}
```
#### Response:

>201 Created

***We'll define the complete request/response schemas later while implementing each API, rather than making this document unnecessarily large now.***