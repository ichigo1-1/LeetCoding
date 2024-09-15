/* Write your PL/SQL query statement below */
select name from Customer 
where referee_id!=2 OR nvl(referee_id,0)=0;