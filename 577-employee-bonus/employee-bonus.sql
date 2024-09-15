/* Write your PL/SQL query statement below */
select name,bonus
from Employee e
left join Bonus b
on e.empId=b.empId
where bonus<1000 or nvl(bonus,0)=0