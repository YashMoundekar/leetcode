# Write your MySQL query statement below
select u.name as NAME ,
    SUM(t.amount) as BALANCE 
from Users as u 
join 
    Transactions as t 
on u.account=t.account 
    Group by u.account,u.name
    having Sum(t.amount)>10000;
