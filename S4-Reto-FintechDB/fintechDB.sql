CREATE DATABASE fintechDB;
use fintechDB;


--
-- Estructura para la tabla `tb_document_type`
--

CREATE TABLE tb_document_type (
  id_dt int(11) NOT NULL AUTO_INCREMENT primary key,
  code int(11) NOT NULL,
  namedt varchar(50) NOT NULL
);

-- --------------------------------------------------------

--
-- Estructura para la tabla `tb_transaction_type`
--

CREATE TABLE tb_transaction_type (
  id_tt int(11) NOT NULL AUTO_INCREMENT primary key,
  code int(11) NOT NULL,
  name varchar(50) NOT NULL
);
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_user`
--

CREATE TABLE tb_user (
  id_u int(11) NOT NULL AUTO_INCREMENT primary key,
  frist_name varchar(50) NOT NULL,
  last_name varchar(50) NOT NULL,
  password varchar(30) NOT NULL,
  phone varchar(15) NOT NULL,
  email varchar(100) NOT NULL,
  born_date date NOT NULL,
  expedition_date_document date NOT NULL,
  document_number varchar(15) NOT NULL,
  document_type_id int(11) NOT NULL,
  timestamp TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at datetime NOT NULL,
  FOREIGN KEY (document_type_id) REFERENCES tb_document_type(id_dt)
);
-- --------------------------------------------------------

--
-- Estructura para la tabla tb_wallet_status
--

CREATE TABLE tb_wallet_status (
  id_ws int(11) NOT NULL AUTO_INCREMENT primary key,
  code int(11) NOT NULL,
  namews varchar(50) NOT NULL
) ;

-- --------------------------------------------------------

--
-- Estructura para la tabla `tb_wallet`
--

CREATE TABLE tb_wallet (
  id_w int(11) NOT NULL AUTO_INCREMENT primary key,
  status_id int(11) NOT NULL,
  amount float NOT NULL,
  timestamp TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at datetime NOT NULL,
  user_id int(11) NOT NULL,
  FOREIGN KEY (status_id) REFERENCES tb_wallet_status(id_ws),
  FOREIGN KEY (user_id) REFERENCES tb_user(id_u)
);
-- --------------------------------------------------------

--
-- Estructura para la tabla `tb_pocket`
--

CREATE TABLE tb_pocket (
  id_p int(11) NOT NULL AUTO_INCREMENT primary key,
  namep varchar(50) NOT NULL,
  timestamp TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at datetime NOT NULL,
  wallet_id int(11) DEFAULT NULL,
  FOREIGN KEY (wallet_id) REFERENCES tb_wallet(id_w)
);

-- --------------------------------------------------------

--
-- Estructura para la tabla `tb_pocket_transaction`
--

CREATE TABLE tb_pocket_transaction (
  id_pt int(11) NOT NULL AUTO_INCREMENT primary key,
  pocket_id int(11) NOT NULL,
  transaction_type_id int(11) NOT NULL,
  amount float NOT NULL,
  FOREIGN KEY (transaction_type_id) REFERENCES tb_transaction_type(id_tt),
  FOREIGN KEY (pocket_id) REFERENCES tb_pocket(id_p)
);

-- --------------------------------------------------------

--
-- Estructura para la tabla 'tb_wallet_transaction`
--

CREATE TABLE tb_wallet_transaction (
  id_wt int(11) NOT NULL AUTO_INCREMENT primary key,
  wallet_id int(11) NOT NULL,
  transaction_type_id int(11) NOT NULL,
  amount float NOT NULL,
  FOREIGN KEY (transaction_type_id) REFERENCES tb_transaction_type(id_tt),
  FOREIGN KEY (wallet_id) REFERENCES tb_wallet(id_w)
);

