SELECT emp.name , empuni.unique_id
FROM Employees as emp LEFT JOIN EmployeeUNI as empuni
ON emp.id = empuni.id;
