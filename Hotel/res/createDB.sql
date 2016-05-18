CREATE DATABASE IF NOT EXISTS `HOTEL_NEW` ;
USE HOTEL_NEW;


CREATE TABLE IF NOT EXISTS Users (
	userId int (10) AUTO_INCREMENT,
	userName varchar(20) NOT NULL,
	userPassword varchar(15) NOT NULL,
	userStatusName varchar(20) NOT NULL,
    
    CONSTRAINT userStatusName_constrain CHECK (userStatusName IN ('admin', 'customer')),
	
    PRIMARY KEY(userId)
);

CREATE TABLE IF NOT EXISTS UsersInfo (
	userId 			int (10) AUTO_INCREMENT,
	userfirstName	VARCHAR(20) NOT NULL,
    userlastName	VARCHAR(20) NOT NULL,
    userNumPassport	VARCHAR(20) NOT NULL,
    userAdress		VARCHAR(20) NOT NULL,
    userPhone 		VARCHAR(20) NOT NULL, 
	FOREIGN KEY (userID) REFERENCES Users(userID),
	PRIMARY KEY(userId)
);

CREATE TABLE IF NOT EXISTS Rooms (
	roomId			int (10) NOT NULL,
	roomType		VARCHAR(20) DEFAULT 'Standart',
	roomNumOfAdult	int (5) NOT NULL,
    roomNumOfChild  INTEGER, 
	roomPriceDay	DECIMAL(5,2) NOT NULL,
    roomStatus		VARCHAR(20) DEFAULT 'Available',
	
	CONSTRAINT roomStatus_constrain CHECK (roomStatus IN ('Occupied', 'Maintenance', 'Available')),
    CONSTRAINT roomType_constrain CHECK (roomType IN ('Suite', 'Standart', 'Duplex', 'Family room', 'Studio')),
	CONSTRAINT roomPriceDay_constrain CHECK (roomPriceDay IN (50.00,100.00,150.00,200.00,250.00)),
	
	PRIMARY KEY(roomId)
);

CREATE TABLE IF NOT EXISTS Reservation (
	resId			int (10) AUTO_INCREMENT,
	userId			int (10) NOT NULL,
    roomId			int (10) NOT NULL,
	dateIn			DATE NOT NULL,
    dateOut  		DATE NOT NULL,
    resStatus		VARCHAR(20) DEFAULT 'unpaid',
	
	CONSTRAINT resStatus_constrain CHECK (resStatus IN ('paid', 'unpaid')),
	CONSTRAINT dateInOut_constrain CHECK (dateOut > dateIn),
	
	FOREIGN KEY (userId) REFERENCES Users(userId),
	FOREIGN KEY (roomId) REFERENCES Rooms(roomId),
	PRIMARY KEY(resId,roomId,userId)
);

