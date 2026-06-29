# Write your MySQL query statement below
SELECT x,y,z,
   CASE 
   WHEN x+y>z AND x+z>y AND y+z>x THEN 'Yes'
   WHEN x+y<=z OR x+z<=y  OR y+z<=x THEN 'No' 
   END AS triangle
FROM triangle;
