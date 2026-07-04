# Write your MySQL query statement below
SELECT d.name as department, e1.name as employee , e1.salary as salary
FROM employee as e1
LEFT JOIN department as d
ON e1.departmentId = d.id
WHERE 3>(
    SELECT COUNT(DISTINCT e2.salary)
    FROM employee AS e2
    WHERE e2.departmentId = e1.departmentId
    AND e2.salary > e1.salary
);