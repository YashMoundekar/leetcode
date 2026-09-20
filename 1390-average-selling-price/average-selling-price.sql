# Write your MySQL query statement below
SELECT p.product_id,Round(IFNull(Sum(u.units*p.price)/Sum(u.units),0),2) as average_price
from  Prices as p
left join UnitsSold as u
on p.product_id=u.product_id
And u.purchase_date between p.start_date and p.end_date
group by p.product_id ;
