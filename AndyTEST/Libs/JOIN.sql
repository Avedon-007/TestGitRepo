Use TestDB
GO

SELECT airport, flightNumber, departureAirport, arrivalAirport, stopsNumber, priorityBoarding, dutyFree, availableSeats, averageTicketPrice
FROM Airports
INNER JOIN Flights
ON Airports.airportNumber = Flights.airportNumber
GO