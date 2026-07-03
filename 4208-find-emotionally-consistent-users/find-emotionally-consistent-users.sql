# Write your MySQL query statement below
SELECT user_id ,reaction AS dominant_reaction,
    ROUND(reaction_count / total_count,2)AS reaction_ratio
FROM (
    SELECT user_id, reaction, COUNT(*) as reaction_count,
    SUM(COUNT(*)) OVER (PARTITION BY user_id) AS total_count
    FROM reactions
    GROUP BY user_id, reaction
)t
WHERE total_count>=5
 AND (reaction_count / total_count )>= 0.60
ORDER BY reaction_ratio DESC , user_id  ASC;
