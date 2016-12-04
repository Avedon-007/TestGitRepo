USE TestDB
GO

INSERT INTO Airlines
	(flightNumber, airline, additionalSpaceService, webRegistration, isMealincluded)
VALUES
	(1001, 'WizzAir', 'yes', 'no', 'no'),
	(1002, 'WizzAir', 'no', 'no', 'no'),
	(1003, 'Lufthansa', 'no', 'yes', 'no'),
	(1004, 'Lufthansa', 'yes', 'yes', 'yes'),
	(1005, 'Lufthansa', 'no', 'no', 'yes'),
	(1006, 'Lufthansa', 'yes', 'no', 'yes'),
	(1007, 'Windrose Aero', 'yes', 'no', 'yes'),
	(1008, 'Windrose Aero', 'yes', 'no', 'yes'),
	(1009, 'WizzAir', 'no', 'no', 'no'),
	(1010, 'Cathay Pacific', 'no', 'yes', 'yes'),
	(1011, 'Cathay Pacific', 'yes', 'yes', 'no'),
	(1012, 'Austrian Airlines', 'no', 'yes', 'yes'),
	(1013, 'AirAsia', 'no', 'yes', 'yes'),
	(1014, 'Virgin', 'no', 'yes', 'yes'),
	(1015, 'Virgin', 'yes', 'no', 'no'),
	(1016, 'Virgin', 'yes', 'yes', 'no'),
	(1017, 'AirAsia', 'no', 'no', 'no'),
	(1018, 'Emirates', 'yes', 'yes', 'yes'),
	(1019, 'Ryanair', 'no', 'no', 'no'),
	(1020, 'AirAsia', 'yes', 'no', 'yes'),
	(1021, 'Windrose Aero', 'no', 'no', 'no'),
	(1022, 'WizzAir', 'no', 'no', 'no'),
	(1023, 'AirAsia', 'yes', 'yes', 'yes'),
	(1024, 'AirAsia', 'no', 'no', 'no'),
	(1025, 'Emirates', 'yes', 'yes', 'yes'),
	(1026, 'WizzAir', 'yes', 'no', 'yes'),
	(1027, 'Emirates', 'no', 'yes', 'no'),
	(1028, 'Austrian Airlines', 'no', 'no', 'no'),
	(1029, 'Turkish Airlines', 'yes', 'yes', 'yes'),
	(1030, 'Air France', 'yes', 'no', 'no'),
	(1031, 'Air France', 'yes', 'no', 'yes'),
	(1032, 'Air France', 'yes', 'yes', 'no'),
	(1033, 'Air France', 'no', 'yes', 'no'),
	(1034, 'WizzAir', 'no', 'yes', 'yes'),
	(1035, 'Ryanair', 'no', 'yes', 'no')
GO