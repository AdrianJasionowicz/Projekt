API:
GET //depots - zwraca liste wszystkich magazynow w aplikacji
	/depot/{id} zwraca magazyn pod danym id 
POST /depots - dodaje nowy magazyn
PUT /depot/{id} - nadpisuje magazn o podanym ID
DELETE /depot/{id} - usuwa magazyn o podanym ID

przykładowy obiekt magazyn:
{
  "id": 1,
  "name": "Storage #1",
  "location": "Jemiołowa 100/10 50-100 Wrocław Poland",
  "capacity": 10000
}