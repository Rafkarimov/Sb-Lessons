--создаем таблицу для цветов
CREATE TABLE flowers
(
    id                  BIGSERIAL PRIMARY KEY,
    --id INTEGER NOT NULL DEFAULT nextval('flowers_seq'::regclass),
    flower_name         VARCHAR(30)    NOT NULL,
    price_for_one_piece NUMERIC(10, 2) NOT NULL -- максимальное число для такой записи будет 999.99 - 3 до запятой, 2 после
);
--проверяем есть ли таблица
SELECT *
FROM flowers;
--заполняем таблицу цветами
--Розы - 100, Лилии - 50, Ромашки - 25
INSERT INTO flowers(flower_name, price_for_one_piece)
VALUES ('Розы', 100);
INSERT INTO flowers(flower_name, price_for_one_piece)
VALUES ('Лилии', 50);
INSERT INTO flowers(flower_name, price_for_one_piece)
VALUES ('Ромашки', 25);

--создаем таблицу с заказами
--в данной таблице будут храниться данные о заказчиках, имя и номер телефона
CREATE TABLE buyers
(
    id           BIGSERIAL PRIMARY KEY,
    buyers_name  VARCHAR(30) NOT NULL,
    phone_number VARCHAR(20) NOT NULL
);
--наполняем заказчиками, 12 человек
INSERT INTO buyers(buyers_name, phone_number)
VALUES ('Михаил', '+7-933-333-33-33');
INSERT INTO buyers(buyers_name, phone_number)
VALUES ('Виталий', '+7-933-444-44-44');
INSERT INTO buyers(buyers_name, phone_number)
VALUES ('Анна', '+7-932-123-32-32');
INSERT INTO buyers(buyers_name, phone_number)
VALUES ('Полина', '+7-932-321-23-23');
INSERT INTO buyers(buyers_name, phone_number)
VALUES ('Антон', '+7-931-555-45-32');
INSERT INTO buyers(buyers_name, phone_number)
VALUES ('Кирилл', '+7-931-666-44-44');
INSERT INTO buyers(buyers_name, phone_number)
VALUES ('Наталия', '+7-930-213-32-32');
INSERT INTO buyers(buyers_name, phone_number)
VALUES ('Полина', '+7-930-111-23-23');
INSERT INTO buyers(buyers_name, phone_number)
VALUES ('Василий', '+7-930-111-45-32');
INSERT INTO buyers(buyers_name, phone_number)
VALUES ('Виталий', '+7-930-111-44-44');
INSERT INTO buyers(buyers_name, phone_number)
VALUES ('Анна', '+7-929-111-32-32');
INSERT INTO buyers(buyers_name, phone_number)
VALUES ('Наталия', '+7-931-555-23-23');

--создать 3 таблицу, в которой будет храниться id цветка и покупателя, а также сколько покупатель купил цветов,
-- дата заказа и сумма заказа.
CREATE TABLE IF NOT EXISTS orders
(
    id                BIGSERIAL PRIMARY KEY,
    flower_id         BIGINT REFERENCES flowers (id),
    buyers_id         BIGINT REFERENCES buyers (id),
    number_of_flowers SMALLINT       NOT NULL,
    order_date        TIMESTAMP      NOT NULL,
    sum_orders        NUMERIC(10, 2) NOT NULL
    CONSTRAINT customers_number_of_flowers_check CHECK (number_of_flowers >= 1 AND number_of_flowers <= 1000)
    );
--добавляем заказы
INSERT INTO orders(flower_id, buyers_id, number_of_flowers, order_date, sum_orders)
VALUES (1, 1, 500, now() - INTERVAL '20days', (select price_for_one_piece from flowers where 1 = flowers.id) * 500);
INSERT INTO orders(flower_id, buyers_id, number_of_flowers, order_date, sum_orders)
VALUES (1, 1, 1000, now() - INTERVAL '20days', (select price_for_one_piece from flowers where 1 = flowers.id) * 1000);
INSERT INTO orders(flower_id, buyers_id, number_of_flowers, order_date, sum_orders)
VALUES (2, 2, 800, now() - INTERVAL '25days', (select price_for_one_piece from flowers where 1 = flowers.id) * 800);
INSERT INTO orders(flower_id, buyers_id, number_of_flowers, order_date, sum_orders)
VALUES (2, 5, 600, now() - INTERVAL '1 month 5 days',
        (select price_for_one_piece from flowers where 1 = flowers.id) * 600);
INSERT INTO orders(flower_id, buyers_id, number_of_flowers, order_date, sum_orders)
VALUES (3, 12, 750, '2023.02.12 20:22:10'::timestamp - interval '1 month',
        (select price_for_one_piece from flowers where 1 = flowers.id) * 750);
--решение заданий
-- п.1. По идентификатору заказа получить данные заказа и данные клиента, создавшего этот заказ
SELECT buyers_name,
       flower_name,
       phone_number,
       sum_orders,
       to_char(order_date at time zone 'UTC+3', 'DD.MM.YYYY HH24:MI:SS')
FROM orders
         INNER JOIN buyers AS B ON buyers_id = B.id
         INNER JOIN flowers AS F ON flower_id = F.id;
-- п.2. Получить данные всех заказов одного клиента по идентификатору клиента за последний месяц
SELECT *
FROM orders
WHERE buyers_id = 1
  and order_date > current_timestamp - interval '1 month';

--п.3. Найти заказ с максимальным количеством купленных цветов, вывести их название и количество
--1 способ
SELECT flower_name, number_of_flowers
FROM orders
         INNER JOIN flowers ON flower_id = flowers.id
order by number_of_flowers desc
    limit 1;
--2 способ
select f.flower_name, o.number_of_flowers
from (select *
      from orders
      where number_of_flowers = (select max(number_of_flowers) from orders)) as o
         inner join flowers as f on flower_id = f.id;
-- п.4. Вывести общую выручку (сумму золотых монет по всем заказам) за все время
SELECT sum(sum_orders)
FROM orders;
