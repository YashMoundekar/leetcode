# Write your MySQL query statement below
Select p.product_name,Sum(o.unit)as unit
from Products as p
inner join Orders as o
on p.product_id=o.product_id
where o.order_date >'2020-01-31' AND o.order_date<'2020-03-01'  group by o.product_id Having SUM(unit)>=100;