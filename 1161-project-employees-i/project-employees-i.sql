# Write your MySQL query statement below
Select p.project_id,Round(Sum(e.experience_years)/Count(e.employee_id),2) as average_years 
from Project as p
inner join Employee e
on p.employee_id=e.employee_id
group by p.project_id;
