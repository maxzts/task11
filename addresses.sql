CREATE TABLE addresses (
id INT PRIMARY KEY AUTO_INCREMENT,
city VARCHAR(100) NOT NULL,
street VARCHAR(100) NOT NULL,
house_number INT NOT NULL,
house_part INT,
apartment_number INT
);