# Write your MySQL query statement below
SELECT Max(a.num) as num
FROM(SELECT num FROM MyNumbers
GROUP BY num
HAVING COUNT(*)=1) as a;