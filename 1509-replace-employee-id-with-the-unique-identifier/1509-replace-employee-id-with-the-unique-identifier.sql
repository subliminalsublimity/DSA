SELECT eun.unique_id , emp.name
FROM Employees as emp LEFT JOIN EmployeeUNI as eun
ON emp.id = eun.id; 