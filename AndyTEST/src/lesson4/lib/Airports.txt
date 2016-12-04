USE TestDB


CREATE TABLE Airports
(
	airportNumber int NOT NULL PRIMARY KEY, /* I've added this colomn for relation between such tables: Airports & Flights*/
	airport varchar(20) NOT NULL,
	dutyFree varchar(3) NOT NULL,
	priorityBoarding varchar(3) NOT NULL
)


DELETE FROM Airports
