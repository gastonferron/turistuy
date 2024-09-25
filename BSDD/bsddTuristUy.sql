drop database turistuy;
create database turistuy CHARSET utf8mb4;
use turistuy;
CREATE TABLE users(
	id_user INT UNSIGNED AUTO_INCREMENT,
	username VARCHAR(16),
	mail VARCHAR(50),
    name_user VARCHAR(30),
	lastname VARCHAR(30),
	tel VARCHAR(12),
	logicalDeletion BOOLEAN DEFAULT 0,
	PRIMARY KEY(id_user)
);
CREATE TABLE department(
	url VARCHAR(2048),
    name_department VARCHAR(20),
    explanation VARCHAR(300)
);
CREATE TABLE tourist(
	id_tourist INT UNSIGNED AUTO_INCREMENT,
	nacionality VARCHAR(50),
    PRIMARY KEY(id_tourist),
    FOREIGN KEY(id_tourist) REFERENCES users(id_user)
);
CREATE TABLE supplier(
	id_supplier INT UNSIGNED AUTO_INCREMENT,
	link VARCHAR(2048),
    generalExplanation VARCHAR(300),
    PRIMARY KEY(id_supplier),
    FOREIGN KEY(id_supplier) REFERENCES users(id_user)
);