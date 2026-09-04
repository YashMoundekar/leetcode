# Write your MySQL query statement below
Select r.contest_id,
    Round ((Count(r.user_id)/(Select Count(*) from users))*100,2) as percentage
from Register as r
join Users as u
on u.user_id=r.user_id
group by r.contest_id
order by percentage desc ,contest_id asc;
