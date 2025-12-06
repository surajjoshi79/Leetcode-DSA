# Write your MySQL query statement below
with cte1 as(
    select * from Accounts
    where income<20000
),
cte2 as(
    select * from Accounts
    where income>=20000 and income<=50000
),
cte3 as(
    select * from Accounts
    where income>50000
)
select "Low Salary" as category,count(*) as accounts_count from cte1
UNION
select "Average Salary" as category,count(*) as accounts_count from cte2
UNION
select "High Salary" as category,count(*) as accounts_count from cte3;