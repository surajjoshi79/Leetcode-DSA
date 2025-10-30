# Write your MySQL query statement below
select m.name from employee e
inner join employee m on e.managerId=m.id
group by e.managerId
having count(*)>=5;