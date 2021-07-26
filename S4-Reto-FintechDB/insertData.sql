INSERT into tb_document_type (code, namedt) VALUES 
  (1,'Tarjeta de Identidad'),
  (2,'Cedula de Ciudadania'),
  (3,'Cedula de Extranjeria'),
  (4,'Pasaporte'),
  (5,'Registro Civil')
;

INSERT into tb_transaction_type (code, name) VALUES 
  (1,'Sale/Payment'),
  (2,'Pre-authorization'),
  (3,'Capture'),
  (4,'Void'),
  (5,'Refund'),
  (6,'Verify'),
  (7,'transfer')
;

INSERT into tb_user (first_name, last_name, password, phone, email, born_date, expedition_date_document, document_number, document_type_id) VALUES 
  ('Melissa','Manrique', 'mm202003', '3103887465',''melissamm@gmail.com', '2012-11-30','2012-12-10','1032469753',5),
  ('Juan','Lopez', 'juanitoelmejor123', '3124569384','juan_lopez@gmail.com', '2004-01-30','2019-01-22','1032796587',1),
  ('Paula','Luna', 'PaulaL1974', '3054657895','paula_luna1974@yahoo.com', '1974-08-03','1994-10-10','52224782',2),
  ('Edgar','Rivas', 'EErr1234*', '3028247564','edgarR1@gmail.com', '1996-10-12','2017-02-15','136497955',3)
;

INSERT into tb_wallet_status (code, namews) VALUES 
  (1,'Empty'),
  (2,'Available'),
  (3,'Overdrawn'),
  (4,'Cancelled'),
  (5,'Blocked')
;

INSERT into tb_wallet (status_id, amount, user_id) VALUES 
  (2, 1500000, 1),
  (1, 0, 2),
  (2, 2354700, 3),
  (5, 185000, 4)
;

INSERT into tb_pocket (namep, wallet_id) VALUES 
  ('AhorrosU', 1),
  ('Gastos Personales', 1),
  ('AhorrosViajes', 3),
  ('AhorrosGenerales', 2),
  ('Dinero Mamá', 4)
;

INSERT into tb_pocket_transaction (pocket_id, transaction_type_id, amount) VALUES 
  (1, 1, 10000),
  (2, 1, -15000),
  (3, 5, 50000),
  (4, 1, 35000),
  (5, 1, -20500)
;

INSERT into tb_wallet_transaction (wallet_id, transaction_type_id, amount) VALUES 
  (1, 1, -100000),
  (2, 7, 50000),
  (3, 5, 25000),
  (4, 1, -35000),
  (1, 7, 10500)
;