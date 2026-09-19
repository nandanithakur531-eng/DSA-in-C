# Write your MySQL query statement below
(SELECT 
  name as results
  FROM
    (SELECT 
    u.name,
    RANK() OVER(ORDER BY COUNT(*) DESC) as user_rank
    FROM Users as u
    JOIN MovieRating as mr
    ON u.user_id = mr.user_id
    GROUP BY u.user_id, u.name) as t
WHERE  user_rank = 1
ORDER BY name
LIMIT 1
)

UNION ALL

(SELECT 
   title as results
   FROM(
    SELECT 
    m.title,
    RANK() OVER(ORDER BY AVG(mr.rating) DESC) as movie_rank
    FROM Movies as m
    JOIN MovieRating as mr
    ON m.movie_id = mr.movie_id
    WHERE mr.created_at >= '2020-02-01' AND mr.created_at <'2020-03-01' 
    GROUP BY m.movie_id , m.title) as t
    WHERE movie_rank = 1
    ORDER BY title
    LIMIT 1 
); 
