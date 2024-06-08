
CREATE TABLE bar (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(255),
    price DOUBLE
);

CREATE TABLE Users (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
email VARCHAR(255),
name VARCHAR(255),
surname VARCHAR(255),
password_hash VARCHAR(255),
phone VARCHAR(255),
points INT
);

CREATE TABLE MovieRating (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255),
    name VARCHAR(255),
    rating INT,
    date_added TIMESTAMP
);
CREATE TABLE MovieHistory (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255),
    name VARCHAR(255),
    date_added TIMESTAMP
);
mvn spring-boot:run