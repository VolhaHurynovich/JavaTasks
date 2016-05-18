USE HOTEL_NEW;

INSERT INTO UserStatus VALUES (1,'admin');
INSERT INTO UserStatus VALUES (2,'customer');


INSERT INTO Users VALUES (1,'customer1','1111',2);
INSERT INTO Users VALUES (2,'customer2','2222',2);
INSERT INTO Users VALUES (3,'admin1','admin',1);

INSERT INTO UsersInfo VALUES (1,'Ivan','Inanov','MP1345678','Minsk',80297777777);
INSERT INTO UsersInfo VALUES (2,'Petr','Petrov','MP1345679','Moscow',80297777888);
INSERT INTO UsersInfo VALUES (3,'Sidor','Sidorov','MP1345688','Pinsk',80297777999);

INSERT INTO Rooms VALUES (505,'Suite',4,0,250.00,'Occupied');
INSERT INTO Rooms VALUES (605,'Standart',2,0,150.00,'Occupied');
INSERT INTO Rooms VALUES (705,'Family room',2,2,200.00,'Occupied');
INSERT INTO Rooms VALUES (805,'Family room',2,2,200.00,'Available');

INSERT INTO Reservation VALUES (1001,1,505,'2016-06-01','2016-06-07','paid');
INSERT INTO Reservation VALUES (1002,2,705,'2016-07-01','2016-07-07','unpaid');
INSERT INTO Reservation VALUES (1003,2,705,'2016-08-01','2016-08-07','unpaid');

