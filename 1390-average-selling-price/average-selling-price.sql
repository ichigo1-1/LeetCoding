/* Write your PL/SQL query statement below */
SELECT p.product_id,
       NVL(ROUND(SUM(p.price * s.units) / NULLIF(SUM(s.units), 0), 2), 0) AS average_price
FROM Prices p
LEFT JOIN UnitsSold s
ON p.product_id = s.product_id
   AND s.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id;

