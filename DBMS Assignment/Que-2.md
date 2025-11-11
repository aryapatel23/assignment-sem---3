<!--  write SQL for the flowing orations queries on the hotels table 
insert two hotels
update the number of available rooms 
dalete a hotel_id
calculate the total number of rooms available (SUM)
calculate the average rooms available (AVG) -->



# 🏨 SQL Operations on `hotel` Table

in existing `Homtel` table 

---

## Insert Two Hotels

```sql
INSERT INTO hotel (hotelid, hotel_name, city, rooms_available)
VALUES 
(1, 'Grand Palace', 'Ahmedabad', 25),
(2, 'Blue Orchid', 'Mumbai', 40);
```

## Update the Number of Available Rooms
```sql
UPDATE hotel
SET rooms_available = 30
WHERE hotelid = 1;
```

## Delete a Hotel by ID

```sql
DELETE FROM hotel
WHERE hotelid = 2;
```

## Calculate Total Number of Rooms Available (SUM)
```sql
SELECT SUM(rooms_available) AS total_rooms_available
FROM hotel;
```

## Calculate Average Rooms Available (AVG)
``` sql
SELECT AVG(rooms_available) AS avg_rooms_available
FROM hotel;
```