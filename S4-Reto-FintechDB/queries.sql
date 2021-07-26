-- ---------------QUERIES----------------
-- 1. Valor total del dinero, sumando bolsillos y billetera principal. ------
SELECT (u.last_name) User_LastName, (wt.amount + pt.amount + w.amount) TotalMoney
  from tb_user u
  INNER JOIN tb_wallet w 
  ON u.id_u = w.user_id
  INNER JOIN tb_wallet_transaction wt
  ON w.id_w=wt.wallet_id
  INNER JOIN tb_pocket p
  ON w.id_w=p.wallet_id
  INNER JOIN tb_pocket_transaction pt
  ON p.id_p=pt.pocket_id
GROUP BY u.id_u
;

-- 2. Valor total de la billetera.-------
SELECT (u.last_name) User_LastName, (wt.amount + w.amount) Total_Wallet_Money
  from tb_user u
  INNER JOIN tb_wallet w 
  ON u.id_u = w.user_id
  INNER JOIN tb_wallet_transaction wt
  ON w.id_w=wt.wallet_id
GROUP BY u.id_u
;

-- 3. Valor total de los bolsillos (Valor por cada bolsillo).-----
SELECT (u.last_name) User_LastName, p.namep PocketName, pt.amount Total_Pockets_Money
  from tb_user u
  INNER JOIN tb_wallet w 
  ON u.id_u = w.user_id
  INNER JOIN tb_pocket p
  ON w.id_w=p.wallet_id
  INNER JOIN tb_pocket_transaction pt
  ON p.id_p=pt.pocket_id
;

-- 4.  Log de transacciones de registros en la billetera principal. Limitado a 20 resultados. Y paginado iniciando en Cero, Para el caso de ir aumentando paginas para mostrarle al usuario el registro total. -----------
SELECT (u.last_name) User_LastName, tt.name Transaction_Type, wt.amount Amount
  from tb_user u
  INNER JOIN tb_wallet w 
  ON u.id_u = w.user_id
  INNER JOIN tb_wallet_transaction wt
  ON w.id_w=wt.wallet_id
  INNER JOIN tb_transaction_type tt
  ON tt.id_tt= wt.transaction_type_id
LIMIT 20
;


-- 5.  Log de transacciones de registros en el bolsillo, query sin límite y basado en el id del bolsillo. -----------
SELECT p.id_p PocketID, (u.last_name) User_LastName, tt.name Transaction_Type, Pt.amount Amount
  from tb_user u
  INNER JOIN tb_wallet w 
  ON u.id_u = w.user_id
  INNER JOIN tb_pocket p
  ON w.id_w=p.wallet_id
  INNER JOIN tb_pocket_transaction pt
  ON p.id_p=pt.pocket_id
  INNER JOIN tb_transaction_type tt
  ON tt.id_tt= pt.transaction_type_id
;

-- 6. Reporte de usuarios, valor total de dinero en bolsillos y billetera.-----
SELECT u.first_name User_FirstName, u.last_name User_LastName, (wt.amount + w.amount) Total_Wallet_Money, pt.amount Total_Pockets_Money
  from tb_user u
  INNER JOIN tb_wallet w 
  ON u.id_u = w.user_id
  INNER JOIN tb_wallet_transaction wt
  ON w.id_w=wt.wallet_id
  INNER JOIN tb_pocket p
  ON w.id_w=p.wallet_id
  INNER JOIN tb_pocket_transaction pt
  ON p.id_p=pt.pocket_id
GROUP BY u.id_u
;

-- 7. Top 10 de clientes que realizan mas pagos por la aplicación.-----
SELECT u.first_name User_FirstName, u.last_name User_LastName, (count(wt.wallet_id)+count(pt.pocket_id)) Total_Payments
  from tb_user u
  INNER JOIN tb_wallet w 
  ON u.id_u = w.user_id
  INNER JOIN tb_wallet_transaction wt
  ON w.id_w=wt.wallet_id
  INNER JOIN tb_pocket p
  ON w.id_w=p.wallet_id
  INNER JOIN tb_pocket_transaction pt
  ON p.id_p=pt.pocket_id
  INNER JOIN tb_transaction_type tt
  ON tt.id_tt= pt.transaction_type_id
  AND tt.name= 'Sale/Payment'
  AND tt.id_tt= wt.transaction_type_id
  AND tt.name= 'Sale/Payment'
GROUP BY u.id_u
ORDER BY Total_Payments DESC
LIMIT 10
;

-- 8. Top 10 de clientes que usan más los bolsillos. -----
SELECT u.first_name User_FirstName, u.last_name User_LastName  
  from tb_user u
  INNER JOIN tb_wallet w 
  ON u.id_u = w.user_id
  INNER JOIN tb_pocket p
  ON w.id_w=p.wallet_id
  INNER JOIN tb_pocket_transaction pt
  ON p.id_p=pt.pocket_id
GROUP BY u.id_u
ORDER BY count(pt.pocket_id) DESC
LIMIT 10
;


-- 9. Top 10 de clientes con mas transacciones en la billetera.-----
SELECT u.first_name User_FirstName, u.last_name User_LastName  
  from tb_user u
  INNER JOIN tb_wallet w 
  ON u.id_u = w.user_id
  INNER JOIN tb_wallet_transaction wt
  ON w.id_w=wt.wallet_id
GROUP BY u.id_u
ORDER BY count(wt.id_wt) DESC
LIMIT 10
;