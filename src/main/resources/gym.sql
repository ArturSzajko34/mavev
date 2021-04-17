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

ALTER TABLE cardtype ADD CONSTRAINT fk_cardtype_card_id FOREIGN KEY (id) REFERENCES card(id);

ALTER TABLE gymcardtype ADD CONSTRAINT fk_gymcardtype_cardtype_id FOREIGN KEY (cardTypeId) REFERENCES cardType(id);

ALTER TABLE gym ADD CONSTRAINT fk_gym_gymCardType_id FOREIGN KEY (id) REFERENCES gymcardtype(gymId);

ALTER TABLE employee ADD CONSTRAINT fk_employee_gym_id FOREIGN KEY (gymId) REFERENCES gym(id);


ALTER TABLE gymcardtype
DROP FOREIGN KEY fk_gymcardtype_cardtype_id;


 // "orders" z jaka tabelą chcemy zrobic połaczenie, clietnId - klucz obcy z tabeli do której robimy połaczenie, klucz głowny z tabeli z której sie łączymy
ALTER TABLE orders ADD CONSTRAINT fk_smarphone_order FOREIGN KEY (clientId) REFERENCES smartphone(id);



