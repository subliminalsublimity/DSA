# Write your MySQL query statement below
SELECT e.name from Employee e
WHERE e.id IN 
(SELECT m.managerId 
    FROM Employee m 
    GROUP BY m.managerId
    HAVING COUNT(*) >= 5
);