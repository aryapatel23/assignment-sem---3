<!-- Write sql queries to create a table hotel with 
Hotelid int pk 
Hotel name 
City 
Rooms available not null 

Add constraints Pk on hotel id Unique key on hotel name Rooms available can not be null In Sql queries -->

for creat a table in sql we use `CREATE TABLE` then table name

```sql
CREATE TABLE hotel (
    hotelid INT PRIMARY KEY,                 
    hotel_name VARCHAR(60) UNIQUE,         
    city VARCHAR(40),
    rooms_available INT NOT NULL           
);
