create database chair;
use chair;

CREATE TABLE Chair (
    ChairID INT PRIMARY KEY,
    Model VARCHAR(50) UNIQUE,
    Material VARCHAR(50),
    Color VARCHAR(20),
    Price DECIMAL(6, 2) CHECK (Price > 0)
);

INSERT INTO Chair (ChairID, Model, Material, Color, Price) VALUES
(1, 'ErgoSeat', 'Mesh', 'Black', 150.00),
(2, 'ComfortPlus', 'Leather', 'Brown', 250.00),
(3, 'SimpleSit', 'Plastic', 'White', 50.00),
(4, 'FlexiBack', 'Fabric', 'Gray', 125.00),
(5, 'ExecutiveElite', 'Leather', 'Black', 300.00);
    
ALTER TABLE Chair
ADD CONSTRAINT unique_material UNIQUE (Material);

ALTER TABLE Chair
DROP CONSTRAINT unique_material;

ALTER TABLE Chair
DROP CONSTRAINT check_color;

ALTER TABLE Chair
ADD CONSTRAINT unique_material UNIQUE (Material);

ALTER TABLE Chair
DROP CONSTRAINT unique_material;

select * from Chair;


CREATE TABLE Vehicle (
    VehicleID INT PRIMARY KEY,
    Make VARCHAR(50) UNIQUE,
    Model VARCHAR(50),
    Year INT CHECK (Year >= 1886),
    Price DECIMAL(10, 2) CHECK (Price > 0)
);


INSERT INTO Vehicle (VehicleID, Make, Model, Year, Price) VALUES
(1, 'Toyota', 'Camry', 2020, 24000.00),
(2, 'Honda', 'Civic', 2019, 22000.00),
(3, 'Ford', 'Mustang', 2021, 35000.00),
(4, 'Chevrolet', 'Malibu', 2018, 18000.00),
(5, 'Tesla', 'Model 3', 2021, 45000.00);

ALTER TABLE Vehicle
ADD CONSTRAINT unique_model UNIQUE (Model);

ALTER TABLE Vehicle
DROP CONSTRAINT unique_model;

ALTER TABLE Vehicle
ADD CONSTRAINT unique_model UNIQUE (Model);

ALTER TABLE Vehicle
DROP CONSTRAINT unique_model;

select * from Vehicle;


    
    