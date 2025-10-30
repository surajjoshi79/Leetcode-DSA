# Write your MySQL query statement below
with cte as (
    select distinct num,
    lead(num,1) over() as num1,
    lead(num,2) over() as num2
    from logs
)

select num ConsecutiveNums from cte where num=num1 and num=num2;