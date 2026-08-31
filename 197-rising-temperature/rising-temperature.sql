# Write your MySQL query statement below
Select Distinct w1.id
from Weather as w1
Join Weather as w2
on DateDiff(w1.recordDate ,w2.recordDate)=1
where w1.temperature>w2.temperature;