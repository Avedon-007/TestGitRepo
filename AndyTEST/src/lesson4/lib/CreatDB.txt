CREATE DATABASE TestDB
ON
(
	NAME = 'Test_DB',
	FILENAME = 'D:\реярхпнбюмхе он\йСПЯШ\TestClub\Course 2 (Automation)\Lesson 4\DataBase\Test_DB.mdf',
	SIZE = 5MB,
	MAXSIZE = 10MB,
	FILEGROWTH = 1MB
)
LOG ON
(
	NAME = 'Log_Test_DB',
	FILENAME = 'D:\реярхпнбюмхе он\йСПЯШ\TestClub\Course 2 (Automation)\Lesson 4\DataBase\Test_DB.ldf',
	SIZE = 5MB,
	MAXSIZE = 10MB,
	FILEGROWTH = 1MB
)
COLLATE Cyrillic_General_CI_AS

EXECUTE sp_helpdb TestDB

USE TestDB
GO
