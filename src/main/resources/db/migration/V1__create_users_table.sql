CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(255),
                       lastName VARCHAR(255),
                       email VARCHAR(255),
                       username VARCHAR(255),
                       password VARCHAR(255),
                       birthDate DATE
);
