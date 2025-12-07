SELECT emp.name , b.bonus
FROM Employee as emp LEFT JOIN Bonus as b
ON emp.empId = b.empId
WHERE b.bonus < 1000 OR b.bonus IS NULL;
