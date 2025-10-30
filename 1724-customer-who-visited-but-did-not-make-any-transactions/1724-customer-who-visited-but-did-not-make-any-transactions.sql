SELECT v.customer_id , COUNT(*) as count_no_trans
FROM Visits as v LEFT JOIN Transactions as t 
ON v.visit_id = t.visit_id  Where t.transaction_id IS NULL
GROUP BY customer_id;