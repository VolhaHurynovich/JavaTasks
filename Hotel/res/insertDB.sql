USE HOTEL_NEW;

INSERT INTO Users VALUES (1,'customer1','1111','customer');
INSERT INTO Users VALUES (2,'customer2','2222','customer');
INSERT INTO Users VALUES (3,'adminName','adminPass','admin');
INSERT INTO Users VALUES (43,'adminName4','adminPass4','admin');
INSERT INTO Users VALUES (44,'adminName5','adminPass45','admin');

INSERT INTO UsersInfo VALUES (1,'Ivan','Inanov','MP1345678','Minsk','hhh@jjj.yyy',80297777777);
INSERT INTO UsersInfo VALUES (2,'Petr','Petrov','MP1345679','Moscow','hhffh@jjj.yyy',80297777888);
INSERT INTO UsersInfo VALUES (3,'Sidor','Sidorov','MP1345688','Pinsk','hhyyh@jjj.yyy',80297777999);
INSERT INTO UsersInfo VALUES (43,'Sidor','Sidorov','MP1345688','Pinsk','hhyyyh@jjj.yyy','80297777999');
INSERT INTO UsersInfo VALUES (44,'Sidor','Sidorov','MP1345688','Pinsk','hhgggh@jjj.yyy',80297777999);


INSERT INTO Rooms VALUES (505,55,'Suite',4,0,250.00,'Occupied');
INSERT INTO Rooms VALUES (605,56,'Standart',2,0,150.00,'Occupied');
INSERT INTO Rooms VALUES (705,57,'Family room',2,2,200.00,'Occupied');
INSERT INTO Rooms VALUES (805,58,'Family room',2,2,200.00,'Available');

INSERT INTO Reservation VALUES (1001,1,505,'2016-06-01','2016-06-07','paid');
INSERT INTO Reservation VALUES (1002,2,705,'2016-07-01','2016-07-07','unpaid');
INSERT INTO Reservation VALUES (1003,2,705,'2016-08-01','2016-08-07','unpaid');

