CREATE TABLE IF NOT EXISTS AUTEUR(ID INT PRIMARY KEY, PRENOM VARCHAR(255), NOM VARCHAR(255))
    AS SELECT * FROM CSVREAD('src/main/resources/author.csv');

CREATE TABLE IF NOT EXISTS AUTEUR_INFO(ID INT PRIMARY KEY, AUTEUR_ID INT, COULEUR_PREF VARCHAR(255), AGE INT, VILLE VARCHAR(255), PAYS VARCHAR(255))
AS SELECT * FROM CSVREAD('src/main/resources/author_info.csv');

CREATE TABLE IF NOT EXISTS LIVRE(ID INT PRIMARY KEY, PAGE INT, TYPE VARCHAR(255),EDITEUR VARCHAR(255), ISBN VARCHAR(255), TITRE VARCHAR(255))
    AS SELECT * FROM CSVREAD('src/main/resources/books.csv');

CREATE TABLE IF NOT EXISTS AUTEUR_LIVRE(id int auto_increment PRIMARY KEY, LIVRE_ID INT, AUTEUR_ID INT)
AS SELECT * FROM CSVREAD('src/main/resources/book_author.csv');

