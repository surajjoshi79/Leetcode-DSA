# Write your MySQL query statement below
WITH cte AS (
    SELECT contest_id, COUNT(DISTINCT r.user_id) AS usercount FROM register r
    GROUP BY contest_id
)SELECT contest_id, ROUND(usercount/COUNT(users.user_id)*100,2) AS percentage FROM cte, users
GROUP BY contest_id
ORDER BY percentage DESC, contest_id;