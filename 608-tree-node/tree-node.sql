# Write your MySQL query statement below
SELECT id,
  IF(p_id IS NULL , 'Root',
     IF(id IN(SELECT DISTINCT p_id
              FROM tree
              WHERE p_id IS NOT NULL),'Inner','Leaf')
            ) AS type
FROM tree;            