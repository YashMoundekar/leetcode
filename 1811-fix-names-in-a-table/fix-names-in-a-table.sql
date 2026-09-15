# Write your MySQL query statement below
Select user_id,
Concat(Upper(SubString(name,1,1)),Lower(SubString(name,2))) as name
 from Users order by user_id;


 