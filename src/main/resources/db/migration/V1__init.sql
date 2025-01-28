CREATE TABLE parkingPlace
(
 id IDENTITY PRIMARY KEY,
    status VARCHAR(100) NOT NULL,
    parkingNumber VARCHAR(100) NOT NULL,
    numberOfFlour VARCHAR(100) NOT NULL,
    price VARCHAR(100) NOT NULL,
    newPrice VARCHAR(100) NOT NULL
);

INSERT INTO parkingPlace (status, parkingNumber, numberOfFlour, price, newPrice)
VALUES (true, 1, 3, 250, 0),
       (false, 2, 3, 200, 0),
       (true, 3, 3,170, 0),
       (false, 4, 3,  350, 0),
       (false, 5, 3, 200, 0),
       (false, 6, 3, 220, 0),
       (true, 7, 3, 199, 0),
       (true, 8, 3,  201, 0),
       (true, 9, 3,  185, 0),
       (true, 10, 3,  210, 0),
       (true, 11, 3,  350, 0)
;