# Write your MySQL query statement below
SELECT e.employee_id 
FROM Employees e
where salary<30000
and e.manager_id not in(select employee_id from Employees)
order by e.employee_id