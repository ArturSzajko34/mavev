CREATE SCHEMA gym_db;

CREATE TABLE Client
( id int primary key AUTO_INCREMENT,
name varchar(255)
 );

CREATE TABLE Card
( id int primary key AUTO_INCREMENT,
clientId int,
cardTypeId varchar(255),
validFrom timestamp not null,
validTo timestamp not null
 );

 CREATE TABLE CardType
( id int primary key AUTO_INCREMENT,
name varchar(255),
price int
 );

 CREATE TABLE GymCardType
( gymId int primary key AUTO_INCREMENT,
cardTypeId int
 );

  CREATE TABLE Gym
( id int primary key AUTO_INCREMENT,
name varchar(255),
city  varchar(255),
openFrom timestamp,
openTo timestamp
 );

 CREATE TABLE Employee
( id int primary key AUTO_INCREMENT,
name varchar(255),
type  int,
gymId int
 );


 ALTER TABLE card ADD CONSTRAINT fk_card_client_id FOREIGN KEY (clientId) REFERENCES client(id);