# Write your MySQL query statement below
Select p.product_name, s.year ,s.price from
Product as p 
right join  sales as s
on p.product_id=s.product_id; 
