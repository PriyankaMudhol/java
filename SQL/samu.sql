---create juice table 5 coumns
insert 5 data for each table.
apply constraints unique,check,primray key:
1) while creating table.
a) add constraint.
2) after creating table.
a) add constraint using alter.
b) drop constraint using alter.
3) after inserting data.
a) add constraint using alter.
b) drop constraint using alter.

create database samu;
use samu;


CREATE TABLE Juice (
    JuiceID INT PRIMARY KEY,
    Name VARCHAR(50) UNIQUE,
    Flavor VARCHAR(50),
    Size VARCHAR(20),
    Price DECIMAL(5, 2) CHECK (Price > 0)
);


INSERT INTO Juice (JuiceID, Name, Flavor, Size, Price) VALUES
(1, 'Orange Delight', 'Orange', '500ml', 2.50),
(2, 'Apple Crisp', 'Apple', '750ml', 3.00),
(3, 'Berry Blast', 'Mixed Berry', '1L', 4.00),
(4, 'Tropical Twist', 'Pineapple', '500ml', 2.75),
(5, 'Green Machine', 'Kale & Spinach', '1L', 4.50);


ALTER TABLE Juice
ADD CONSTRAINT unique_flavor UNIQUE (Flavor);

ALTER TABLE Juice
DROP CONSTRAINT unique_flavor;

ALTER TABLE Juice
ADD CONSTRAINT unique_flavor UNIQUE (Flavor);

ALTER TABLE Juice
DROP CONSTRAINT unique_flavor;

ALTER TABLE Juice
DROP CONSTRAINT check_size;

select * from Juice;


CREATE TABLE Chocolate (
    ChocolateID INT PRIMARY KEY,
    Name VARCHAR(50) UNIQUE,
    Type VARCHAR(50),
    Weight DECIMAL(5, 2) CHECK (Weight > 0),
    Price DECIMAL(6, 2) CHECK (Price > 0)
);


INSERT INTO Chocolate (ChocolateID, Name, Type, Weight, Price) VALUES
(1, 'Dark Delight', 'Dark', 100.00, 2.50),
(2, 'Milk Marvel', 'Milk', 150.00, 3.00),
(3, 'White Wonder', 'White', 120.00, 2.75),
(4, 'Nutty Nougat', 'Nut', 130.00, 3.50),
(5, 'Fruit Fantasy', 'Fruit', 110.00, 4.00);

ALTER TABLE Chocolate
ADD CONSTRAINT unique_type UNIQUE (Type);

ALTER TABLE Chocolate
DROP CONSTRAINT unique_type;

ALTER TABLE Chocolate
ADD CONSTRAINT unique_type UNIQUE (Type);

ALTER TABLE Chocolate
DROP CONSTRAINT unique_type;

select * from Chocolate;

