API: 
<br>GET 
<br>/depots - zwraca liste wszystkich magazynow 
<br>/depots/{id} zwraca magazyn pod danym id       
<br>/supplies              lista lokalizacyji magazynow 
<br>/supplies/{id}          to samo tylko pod danym id 
<br>POST 
<br>/depots - dodaje nowy magazyn   
<br>/supplies - dodaje nowa lokalizacje magazynu 
<br>PUT <br>
<br>/depots/{id} - nadpisuje magazn o podanym ID  
<br>/supplies/{id} - nadpisuje lokalizacje magazynu od id 
<br>DELETE  
<br>/depots/{id} - usuwa magazyn o podanym ID 
<br>/supplies/{id} - usuwa lokalizacje magazynu	







<br>przykładowy obiekt magazyn:
<br>{
 <br> "id": 1,
 <br> "name": "Storage #1",
 <br> "location": "Jemiołowa 100/10 50-100 Wrocław Poland",
 <br> "capacity": 10000
<br>}