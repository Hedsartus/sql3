select product_name from netology.ORDERS O
    inner join netology.CUSTOMERS C ON O.customer_id = C.id
WHERE LOWER(C.name) = LOWER(:name);