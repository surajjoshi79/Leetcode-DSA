# Write your MySQL query statement below
WITH gettingprice AS (
    SELECT us.*, p.price FROM unitssold us
    INNER JOIN prices p ON us.product_id = p.product_id AND us.purchase_date BETWEEN p.start_date AND p.end_date 
),
totalamount AS (
    SELECT product_id, units, units*price AS amount FROM gettingprice
),
avgprice AS (
    SELECT product_id, ROUND(SUM(amount)/SUM(units),2) as average_price FROM totalamount
    GROUP BY product_id
)SELECT * FROM avgprice
UNION
SELECT product_id, 0 AS average_price FROM prices
WHERE product_id NOT IN (SELECT product_id FROM avgprice)
