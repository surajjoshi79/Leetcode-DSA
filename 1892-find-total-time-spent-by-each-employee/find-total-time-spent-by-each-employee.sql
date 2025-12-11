# Write your MySQL query statement below
select event_day as 'day', emp_id, Sum(out_time)-Sum(in_time) as total_time from Employees
group by event_day, emp_id;