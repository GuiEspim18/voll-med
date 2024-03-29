CREATE TABLE patients (
    id bigint not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null unique,
    birthdate DATE not null,
    cpf varchar(11) not null,
    sex varchar(100) not null,
    active tinyint not null,
    telephone varchar(20) not null,
    street varchar(100) not null,
    neighborhood varchar(100) not null,
    zipcode varchar(9) not null,
    compliment varchar(100),
    number varchar(20),
    uf char(2) not null,
    city varchar(100) not null,

    primary key(id)
);