create database room;
use room;
CREATE TABLE show_room (
    room_id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    location VARCHAR(100) NOT NULL,
    capacity INT,
    available BOOLEAN,
    rating DECIMAL(2, 1),
    price_per_hour DECIMAL(10, 2),
    manager_id INT,
    contact_number VARCHAR(15),
    UNIQUE(name),
    UNIQUE(contact_number),
    CHECK (capacity > 0),
    CHECK (rating BETWEEN 0 AND 5)
);



CREATE TABLE market_info (
    market_id INT PRIMARY KEY,
    market_name VARCHAR(50) NOT NULL,
    location VARCHAR(100) NOT NULL,
    size_sqft INT,
    established_year INT,
    number_of_stalls INT,
    is_open BOOLEAN,
    manager_id INT,
    contact_number VARCHAR(15),
    UNIQUE(market_name),
    UNIQUE(contact_number),
    CHECK (size_sqft > 0),
    CHECK (established_year > 1800)
);




INSERT INTO show_room (room_id, name, location, capacity, available, rating, price_per_hour, manager_id, contact_number) VALUES
(1, 'Show Room A', 'Location 1', 50, TRUE, 4.5, 100.00, 101, '1234567890'),
(2, 'Show Room B', 'Location 2', 60, TRUE, 4.0, 150.00, 102, '0987654321'),
(3, 'Show Room C', 'Location 3', 45, TRUE, 4.2, 130.00, 103, '2345678901'),
(4, 'Show Room D', 'Location 4', 55, FALSE, 3.9, 110.00, 104, '3456789012'),
(5, 'Show Room E', 'Location 5', 65, TRUE, 4.1, 140.00, 105, '4567890123'),
(6, 'Show Room F', 'Location 6', 70, FALSE, 3.8, 120.00, 106, '5678901234'),
(7, 'Show Room G', 'Location 7', 50, TRUE, 4.5, 100.00, 107, '6789012345'),
(8, 'Show Room H', 'Location 8', 60, TRUE, 4.0, 150.00, 108, '7890123456'),
(9, 'Show Room I', 'Location 9', 45, TRUE, 4.2, 130.00, 109, '8901234567'),
(10, 'Show Room J', 'Location 10', 55, FALSE, 3.9, 110.00, 110, '9012345678'),
(11, 'Show Room K', 'Location 11', 65, TRUE, 4.1, 140.00, 111, '0123456789'),
(12, 'Show Room L', 'Location 12', 70, FALSE, 3.8, 120.00, 112, '1123456789'),
(13, 'Show Room M', 'Location 13', 50, TRUE, 4.5, 100.00, 113, '2123456789'),
(14, 'Show Room N', 'Location 14', 60, TRUE, 4.0, 150.00, 114, '3123456789'),
(15, 'Show Room O', 'Location 15', 45, TRUE, 4.2, 130.00, 115, '4123456789'),
(16, 'Show Room P', 'Location 16', 55, FALSE, 3.9, 110.00, 116, '5123456789'),
(17, 'Show Room Q', 'Location 17', 65, TRUE, 4.1, 140.00, 117, '6123456789'),
(18, 'Show Room R', 'Location 18', 70, FALSE, 3.8, 120.00, 118, '7123456789'),
(19, 'Show Room S', 'Location 19', 50, TRUE, 4.5, 100.00, 119, '8123456789'),
(20, 'Show Room T', 'Location 20', 70, FALSE, 3.8, 120.00, 120, '9123456789');



INSERT INTO market_info (market_id, market_name, location, size_sqft, established_year, number_of_stalls, is_open, manager_id, contact_number) VALUES
(1, 'Market A', 'Location 1', 1000, 1900, 50, TRUE, 101, '1234567890'),
(2, 'Market B', 'Location 2', 1200, 1920, 60, TRUE, 102, '0987654321'),
(3, 'Market C', 'Location 3', 1100, 1930, 55, FALSE, 103, '2345678901'),
(4, 'Market D', 'Location 4', 1300, 1940, 65, TRUE, 104, '3456789012'),
(5, 'Market E', 'Location 5', 1400, 1950, 70, FALSE, 105, '4567890123'),
(6, 'Market F', 'Location 6', 1500, 1960, 75, TRUE, 106, '5678901234'),
(7, 'Market G', 'Location 7', 1600, 1970, 80, FALSE, 107, '6789012345'),
(8, 'Market H', 'Location 8', 1700, 1980, 85, TRUE, 108, '7890123456'),
(9, 'Market I', 'Location 9', 1800, 1990, 90, FALSE, 109, '8901234567'),
(10, 'Market J', 'Location 10', 1900, 2000, 95, TRUE, 110, '9012345678'),
(11, 'Market K', 'Location 11', 2000, 2010, 100, FALSE, 111, '0123456789'),
(12, 'Market L', 'Location 12', 2100, 2020, 105, TRUE, 112, '1123456789'),
(13, 'Market M', 'Location 13', 2200, 2030, 110, FALSE, 113, '2123456789'),
(14, 'Market N', 'Location 14', 2300, 2040, 115, TRUE, 114, '3123456789'),
(15, 'Market O', 'Location 15', 2400, 2050, 120, FALSE, 115, '4123456789'),
(16, 'Market P', 'Location 16', 2500, 2060, 125, TRUE, 116, '5123456789'),
(17, 'Market Q', 'Location 17', 2600, 2070, 130, FALSE, 117, '6123456789'),
(18, 'Market R', 'Location 18', 2700, 2080, 135, TRUE, 118, '7123456789'),
(19, 'Market S', 'Location 19', 2800, 2090, 140, FALSE, 119, '8123456789'),
(20, 'Market T', 'Location 20', 2900, 2100, 145, TRUE, 120, '9123456789');



ALTER TABLE show_room ADD CONSTRAINT not_null_check CHECK (capacity IS NOT NULL);
ALTER TABLE show_room ADD CONSTRAINT unique_check UNIQUE (manager_id);

ALTER TABLE market_info ADD CONSTRAINT not_null_check CHECK (size_sqft IS NOT NULL);
ALTER TABLE market_info ADD CONSTRAINT unique_check UNIQUE (manager_id);


ALTER TABLE show_room ADD CONSTRAINT rating_check CHECK (rating >= 0 AND rating <= 5);
ALTER TABLE market_info ADD CONSTRAINT established_year_check CHECK (established_year >= 1800);

select * from show_room;
select * from  market_info;

