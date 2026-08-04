# Write your MySQL query statement below
SELECT E.name,B.bonus 
FROM EMPLOYEE AS E
left JOIN BONUS AS B ON E.EMPID=B.EMPID 
WHERE B.BONUS<1000 or b.bonus is null ;