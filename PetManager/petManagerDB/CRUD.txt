INSERT INTO tb_doctor (name,phone,address) VALUES('Jhon Smith','89333764','Transv 34 N 12-34');

INSERT INTO tb_doctor (name,phone,address) VALUES('Cristina Adams','89536864','Diag 34 N 12-34');

SELECT * FROM tb_doctor WHERE name='Jhon Smith';

INSERT INTO tb_hospital (name,phone,address, patient_type, id_doctor) VALUES('Hospital Veterinario','567463154','San Juan 13-45', 1, 2);

ALTER TABLE `tb_pet` CHANGE `healthStatus` `healthStatus` VARCHAR(30) NOT NULL;

INSERT INTO tb_pet (code, name,born_year,color, healthStatus) VALUES
('001','Firulais',2004,'amarillo', 'Saludable'),
('002','Menino',2010,'Blanco', 'Enfermo'),
('003','Motas',2015,'Gris', 'Saludable')
;

INSERT INTO tb_dog (breed, pedigree, id_pet) VALUES
('Criollo',0,1),
('Pincher',1,3)
;

INSERT INTO tb_cat (breed, id_pet) VALUES
('Criollo',2);

UPDATE tb_doctor SET phone='3054650245', address='Cra 24 N12-78' WHERE id=2;

DELETE FROM tb_doctor where id=1;

SELECT * from tb_pet p
INNER JOIN tb_dog d
ON p.id = d.id=id_pet
;

SELECT p.code, p.name, p.born_year, p.color, p.healthStatus, d.breed, d.pedigree from tb_pet p
INNER JOIN tb_dog d
ON p.id = d.id=id_pet
;

SELECT p.code, p.name, p.born_year, p.color, p.healthStatus, d.breed, d.pedigree from tb_pet p
RIGHT JOIN tb_dog d
ON p.id = d.id=id_pet
;