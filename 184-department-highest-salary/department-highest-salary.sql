# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary from Employee e ,
(select departmentId, max(salary) as maxSalary from Employee group by departmentId) d1,
Department d
where d.id=e.departmentId and e.departmentId=d1.departmentId and e.salary=d1.maxSalary;