USE TestDB
GO

CREATE TABLE Airlines
(
	flightNumber int NOT NULL FOREIGN KEY REFERENCES Flights(flightNumber),
	airline varchar(30) NOT NULL,
	additionalSpaceService varchar(3) NOT NULL,
	webRegistration varchar(3) NOT NULL,
	isMealIncluded varchar(3) NOT NULL
)
GO