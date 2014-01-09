create schema if not exists eico_hp14;


create table if not exists eico_hp14.users(
id decimal(18) primary key,
name varchar(50),
pass varchar(64));

create SEQUENCE if not exists eico_hp14.sq_users START WITH 1 CACHE 20;

create table if not exists eico_hp14.roles(
id decimal(18) primary key,
code varchar(10),
name varchar(30));

create SEQUENCE if not exists eico_hp14.sq_roles START WITH 1 CACHE 20;

create table if not exists eico_hp14.users_roles(
	id decimal(18) primary key,
	id_users decimal(18),
	id_roles decimal(18));

create SEQUENCE if not exists eico_hp14.sq_users_roles START WITH 1 CACHE 20;

ALTER TABLE eico_hp14.users_roles ADD FOREIGN KEY (id_users) REFERENCES eico_hp14.users (id);
ALTER TABLE eico_hp14.users_roles ADD FOREIGN KEY (id_roles) REFERENCES eico_hp14.roles (id);


create table if not exists eico_hp14.colage(
	id decimal(18) primary key,
	name varchar(64)
);

create SEQUENCE if not exists eico_hp14.sq_collage START WITH 1 CACHE 20;

create table if not exists eico_hp14.person(
	id decimal(18) primary key,
	firstname varchar(32),
	surname varchar(32),
	nickname varchar(32),
	type varchar(2),
	points decimal(6),
	id_colage decimal(18)
);

create SEQUENCE if not exists eico_hp14.sq_person START WITH 1 CACHE 20;
alter table eico_hp14.person add foreign key(id_colage) references eico_hp14.colage (id);


create table if not exists eico_hp14.messages(
	id decimal(18) primary key,
	text varchar(10240),
	instime timestamp,
	id_person decimal(18)
);

create SEQUENCE if not exists eico_hp14.sq_messages START WITH 1 CACHE 20;
alter table eico_hp14.messages add foreign key(id_person) references eico_hp14.person (id);
