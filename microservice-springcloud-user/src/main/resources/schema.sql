DROP TABLE USER IF EXISTS ;
CREATE table user(id bigint generated by default as identity ,username varchar(32),name varchar(20),balance decimal(10,2),primary key (id));