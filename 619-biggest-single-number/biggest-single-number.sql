# Write your MySQL query statement below
Select  Max(num) as num from 
(select Num from MyNumbers group by num having count(num)=1)As Unique_Number  ;