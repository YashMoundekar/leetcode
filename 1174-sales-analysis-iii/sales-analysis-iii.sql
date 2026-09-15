# Write your MySQL query statement below
Select p.product_id,p.product_name from product as p
inner join Sales s
on p.product_id=s.product_id 
group by  p.product_id,p.product_name
having Min(s.sale_date) >='2019-01-01' and Max(s.sale_date)<'2019-04-01';