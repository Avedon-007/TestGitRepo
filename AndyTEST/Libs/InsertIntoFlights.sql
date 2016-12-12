USE TestDB
GO

INSERT INTO Flights
	(flightNumber, airportNumber, departureAirport, arrivalAirport, stopsNumber, averageTicketPrice, availableSeats)
VALUES
	(1001, 1, 'London', 'Munich', 0, 90, 12),
	(1002, 1, 'London', 'New York', 1, 300, 0),
	(1003, 1, 'London', 'Ottava', 1, 290, 2),
	(1004, 1, 'London', 'Milan', 0, 45, 33),
	(1005, 6, 'New York', 'Sydney', 2, 681, 17),
	(1006, 6, 'New York', 'Kiev', 1, 220, 80),
	(1007, 6, 'New York', 'Milan', 1, 440, 1),
	(1008, 6, 'New York', 'Barcelona', 0, 375, 14),
	(1009, 6, 'New York', 'Prague', 1, 410, 21),
	(1010, 6, 'New York', 'Helsinki', 1, 200, 5),
	(1011, 8, 'Budapest', 'London', 0, 15, 47),
	(1012, 8, 'Budapest', 'Kiev', 0, 39, 0),
	(1013, 8, 'Budapest', 'Vilnius', 0, 50, 11),
	(1014, 9, 'Beijing', 'Helsinki', 2, 190, 33),
	(1015, 9, 'Beijing', 'Barcelona', 1, 149, 13),
	(1016, 3, 'Sydney', 'Berlin', 1, 800, 13),
	(1017, 3, 'Sydney', 'Munich', 1, 1200, 13),
	(1018, 3, 'Sydney', 'Milan', 1, 1000, 9),
	(1019, 2, 'Paris', 'Ottava', 1, 999, 2),
	(1020, 2, 'Paris', 'Vilnius', 0, 67, 3),
	(1021, 2, 'Paris', 'Helsinki', 0, 95, 10),
	(1022, 2, 'Paris', 'New York', 0, 212, 10),
	(1023, 7, 'Kiev', 'New York', 2, 220, 25),
	(1024, 7, 'Kiev', 'Milan', 0, 99, 8),
	(1025, 5, 'Munich', 'London', 0, 15, 0),
	(1026, 12, 'Ottava', 'Vilnius', 1, 333, 0),
	(1027, 12, 'Ottava', 'Milan', 1, 310, 1),
	(1028, 12, 'Ottava', 'Barcelona', 1, 310, 4),
	(1029, 4, 'Berlin', 'Kiev', 0, 87, 7),
	(1030, 10, 'Prague', 'Helsinki', 1, 87, 23),
	(1031, 15, 'Barcelona', 'Ottava', 1, 310, 6),
	(1032, 11, 'Helsinki', 'Budapest', 0, 94, 8),
	(1033, 14, 'Milan', 'Beijing', 2, 190, 0),
	(1034, 14, 'Milan', 'Sydney', 2, 725, 2),
	(1035, 13, 'Vilnius', 'Munich', 0, 41, 100)
GO