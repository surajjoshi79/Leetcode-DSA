# Write your MySQL query statement below
with cte as(
    select product_id, unit from Orders
    where order_date between "2020-02-01" and "2020-02-29"
) select product_name, sum(unit) as unit from Products
inner join cte on Products.product_id=cte.product_id
group by cte.product_id
having sum(unit)>=100;