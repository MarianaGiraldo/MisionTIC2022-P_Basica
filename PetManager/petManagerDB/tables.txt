CREATE TABLE tb_doctor(
id int AUTO_INCREMENT primary key,
name varchar(50) not null,
phone varchar(20) not null,
address varchar(100) not null
);
CREATE TABLE tb_pet(
id int AUTO_INCREMENT primary key,
code varchar(3) not null,
name varchar(50) not null,
phone varchar(20) not null,
born_year int not null,
color varchar(20) not null,
healthStatus int not null
);
CREATE TABLE tb_cat(
id int AUTO_INCREMENT primary key,
breed varchar(30) not null,
id_pet int not null,
FOREIGN KEY (id_pet) REFERENCES tb_pet(id)
);
CREATE TABLE tb_dog(
id int AUTO_INCREMENT primary key,
breed varchar(30) not null,
pedigree boolean not null default 0,
id_pet int not null,
FOREIGN KEY (id_pet) REFERENCES tb_pet(id)
);

CREATE TABLE tb_hospital(
id int AUTO_INCREMENT primary key,
name varchar(50) not null,
phone varchar(20) not null,
address varchar(100) not null,
patient_type int not null,
id_doctor int not null,
FOREIGN KEY (id_doctor) REFERENCES tb_doctor(id)
);


CREATE TABLE tb_pet_hospital(
id int AUTO_INCREMENT primary key,
id_pet int not null,
id_hospital int not null,
FOREIGN KEY (id_pet) REFERENCES tb_pet(id),
FOREIGN KEY (id_hospital) REFERENCES tb_hospital(id)
);