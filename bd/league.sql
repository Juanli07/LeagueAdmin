CREATE DATABASE league;

USE league;

CREATE TABLE team(
name VARCHAR(50) NOT NULL PRIMARY KEY,
games_played INT(10),
games_won INT(10),
games_tied INT(10),
lost_games INT(10),
pending_games INT(10),
goals_favor INT(10),
goals_againts INT(10),
difference INT(10),
points INT(10),
tournament_id INT(10),
FOREIGN KEY(tournament_id) REFERENCES tournament(id)
);

CREATE TABLE played_games(
id INT NOT NULL PRIMARY KEY,
journal INT(10),
teams VARCHAR(50),
schedule VARCHAR(50),
marker VARCHAR(5),
date VARCHAR(50),
scorers LONGTEXT
);

CREATE TABLE games_to_play(
id INT NOT NULL PRIMARY KEY,
journal INT,
teams VARCHAR(50),
schedule VARCHAR(50),
date VARCHAR(50),
scorers LONGTEXT
);

CREATE TABLE player(
id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
team VARCHAR(50),
possition VARCHAR(50),
goals INT(10),
penalties INT(10),
FOREIGN KEY(team) REFERENCES team(name)
);

CREATE TABLE user(
user VARCHAR(50) NOT NULL PRIMARY KEY,
pass VARCHAR(50) NOT NULL,
tournament_id INT(10),
FOREIGN KEY(tournament_id) REFERENCES tournament(id)
);

CREATE TABLE tournament(
id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
duration INT(10),
description LONGTEXT
);
