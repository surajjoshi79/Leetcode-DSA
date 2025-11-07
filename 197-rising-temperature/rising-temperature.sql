# Write your MySQL query statement below
with cte as(
    select id,recordDate,temperature as temp,
    lag(temperature,1) over() as prev,
    lag(recordDate,1) over() as prevDate
    from Weather
    order by recordDate
)select id from cte where prev<temp and datediff(recordDate,prevDate)=1;