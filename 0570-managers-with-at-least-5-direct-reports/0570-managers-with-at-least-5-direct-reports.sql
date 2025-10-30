SELECT e.name FROM Employee as e
    Where e.id IN(
        SELECT m.managerId
        FROM Employee m
        GROUP BY m.managerId
        HAVING COUNT(*) >= 5
    );

