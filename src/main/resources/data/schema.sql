
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
phone VARCHAR(255)
);
mvn spring-boot:run