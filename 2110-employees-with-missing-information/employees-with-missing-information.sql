# Write your MySQL query statement below
Select employee_id from Employees where employee_id Not in(Select employee_id from Salaries)
Union
Select employee_id from Salaries where employee_id Not in(Select employee_id from Employees)
Order by employee_id asc;