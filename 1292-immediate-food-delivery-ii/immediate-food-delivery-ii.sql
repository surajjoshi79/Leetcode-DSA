# Write your MySQL query statement below
with cte as(
    select customer_id, order_date, customer_pref_delivery_date, 
    Row_Number() over(Partition by customer_id order by order_date) as rnk from Delivery
)select round(((select count(*) from cte where order_date=customer_pref_delivery_date and rnk=1) / count(distinct customer_id))*100,2) as 'immediate_percentage' from Delivery;