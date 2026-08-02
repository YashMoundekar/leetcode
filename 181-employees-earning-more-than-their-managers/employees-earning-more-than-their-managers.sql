# Write your MySQL query statement below
SELECT E.NAME AS Employee
 FROM EMPLOYEE AS E 
 INNER JOIN EMPLOYEE AS M 
 ON E.MANAGERID =M.id
 where e.salary>M.salary ;