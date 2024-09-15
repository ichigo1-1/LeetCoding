/* Write your PL/SQL query statement below */
select a.id
from weather a
join weather b
on a.recordDate=b.recordDate+1
and a.temperature > b.temperature