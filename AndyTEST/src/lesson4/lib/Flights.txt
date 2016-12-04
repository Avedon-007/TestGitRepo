USE TestDB
GO

CREATE TABLE Flights
(
	flightNumber int NOT NULL PRIMARY KEY,
	airportNumber int NOT NULL FOREIGN KEY REFERENCES Airports(airportNumber), /* I've added this colomn for relation between such tables: Airports & Flights*/
	departureAirport varchar(20) NOT NULL,
	arrivalAirport varchar(20) NOT NULL,
	stopsNumber int NOT NULL,
	averageTicketPrice int NOT NULL,
	availableSeats int NOT NULL
)
GO