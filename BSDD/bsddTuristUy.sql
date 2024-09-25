create database turistuy CHARSET utf8mb4;
use turistuy;
CREATE TABLE usuario(
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	username VARCHAR(16),
	mail VARCHAR(50),
    namee VARCHAR(30),
	lastname VARCHAR(30),
	tel VARCHAR(12),
	bajalogica BOOLEAN DEFAULT 0
);