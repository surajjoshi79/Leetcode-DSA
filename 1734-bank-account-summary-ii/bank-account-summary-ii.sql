# Write your MySQL query statement below
with cte as(
    select account,sum(amount) as balance from Transactions
    group by account
    having sum(amount)>10000
)
select name,balance from Users
inner join cte on cte.account=users.account;