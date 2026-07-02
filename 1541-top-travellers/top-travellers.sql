# Write your MySQL query statement below
SELECT u.name , IFNULL(sum(r.distance),0) AS travelled_distance
FROM users as u
LEFT JOIN rides as r
ON u.id = r.user_id
GROUP BY u.id,u.name
ORDER BY travelled_distance DESC, u.name asc;
