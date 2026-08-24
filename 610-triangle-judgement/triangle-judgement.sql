# Write your MySQL query statement below
SELECT 
    x,y,z,
    if(x+y>z AND x+z>y AND z+y>x ,'Yes','No') triangle
    from
    Triangle;