DROP TABLE IF EXISTS a_user;

CREATE TABLE a_user
(
    user_id BIGINT,
    surname VARCHAR(100) NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    patronymic VARCHAR(100) NOT NULL,
    phone_number VARCHAR(20) NOT NULL,
    PRIMARY KEY (user_id)
);