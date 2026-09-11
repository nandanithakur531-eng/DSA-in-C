# Write your MySQL query statement below
SELECT
  t.teacher_id,
  COUNT(DISTINCT t.subject_id) AS cnt
FROM Teacher as t
GROUP BY teacher_id;
