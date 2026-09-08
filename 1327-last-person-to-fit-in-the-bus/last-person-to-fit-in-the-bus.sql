# Write your MySQL query statement below
SELECT person_name
FROM(
    SELECT person_name , 
         turn,
         SUM(weight) OVER(ORDER BY turn) as weight
         FROM Queue
) AS subquery_table
WHERE weight <= 1000
ORDER BY turn DESC
LIMIT 1;