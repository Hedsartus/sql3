insert into customers(name, surname, age, phone_number)
VALUES
    ('Timofey', 'Sidorov', 27, '23323223'),
    ('Ivan', 'Strijen', 35, '45464435'),
    ('Viktor', 'Chernov', 43, '435435656676'),
    ('Olga', 'Vorontsova', 21, '45666'),
    ('Natalya', 'Sablina', 18, '78787787'),
    ('Alexey', 'Gorniy', 29, '12121122'),
    ('Svetlana', 'Kurnikova', 34, '37373777');

insert into orders(date, customers_id, product_name, amount)
VALUES
    ('2023-01-09', 1, 'Ноутбук', '53000'),
    ('2023-01-12', 2, 'Кресло', '12000'),
    ('2023-01-13', 3, 'Мышка', '1500'),
    ('2023-01-04', 6, 'Процессор', '48000'),
    ('2023-01-06', 5, 'Материнская плата', '9000'),
    ('2023-01-19', 6, 'Монитор', '15000');