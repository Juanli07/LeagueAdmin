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
points INT(10)
);

CREATE TABLE games(
journal INT NOT NULL PRIMARY KEY,
team_1 VARCHAR(50),
team_2 VARCHAR(50),
goals_1 INT(10),
goals_2 INT(10),
scorers LONGTEXT,
FOREIGN KEY(team_1) REFERENCES team(name),
FOREIGN KEY(team_2) REFERENCES team(name)
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
);