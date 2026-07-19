# Write your MySQL query statement below
WITH totalcount AS (
    SELECT query_name, COUNT(*) AS no_of_query FROM queries
    GROUP BY query_name
),
ratio AS (
    SELECT query_name,rating/position AS ratio FROM queries
),
quality AS (
    SELECT r.query_name, ROUND(SUM(r.ratio)/no_of_query,2) AS quality FROM ratio r
    INNER JOIN totalcount t ON r.query_name=t.query_name
    GROUP BY r.query_name
),
noofpoorquery AS (
    SELECT query_name, COUNT(*) AS 'count' FROM queries
    WHERE rating < 3
    GROUP BY query_name
),
poorquerypercentage AS (
    SELECT p.query_name, ROUND(p.count/no_of_query*100,2) AS poor_query_percentage FROM noofpoorquery p 
    INNER JOIN totalcount t ON p.query_name=t.query_name
)SELECT q.query_name, quality, poor_query_percentage FROM quality q
INNER JOIN poorquerypercentage p ON q.query_name=p.query_name
UNION 
SELECT *, 0 AS poor_query_percentage FROM quality
WHERE query_name NOT IN (SELECT query_name FROM noofpoorquery) 