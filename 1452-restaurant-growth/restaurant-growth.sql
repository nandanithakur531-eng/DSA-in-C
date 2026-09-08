# Write your MySQL query statement below
SELECT visited_on , amount , average_amount
FROM(
    SELECT visited_on,
          SUM(SUM(amount)) 
          OVER(ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS amount,
          ROUND(AVG(SUM(amount))
          OVER (ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW),2)AS average_amount,
          DATEDIFF(
            visited_on ,
            (SELECT MIN(visited_on) FROM Customer))
            AS days_diff
    FROM Customer
    GROUP BY visited_on
)temp
WHERE days_diff >=6
ORDER BY visited_on;         
