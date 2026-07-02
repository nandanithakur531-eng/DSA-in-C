# Write your MySQL query statement below
SELECT p.product_name , sum(o.unit) as unit
FROM products as p
JOIN orders as o
ON p.product_id = o.product_id
WHERE o.order_date BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY product_name
HAVING unit >=100 ;