# Write your MySQL query statement below
select c.name as Customers
from Customers As c
left Join Orders as o on
c.id=o.customerId where o.customerid is null;