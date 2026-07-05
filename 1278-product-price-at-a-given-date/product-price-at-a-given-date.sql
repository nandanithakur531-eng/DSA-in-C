# Write your MySQL query statement below
SELECT product_id , 
IF(MIN(change_date) >'2019-08-16',10,
   (SELECT new_price
   FROM products as p2
   WHERE p1.product_id = p2.product_id AND p2.change_date<='2019-08-16'
   ORDER BY p2.change_date DESC LIMIT 1)
   ) AS price
FROM products as p1   
GROUP BY product_id;   
