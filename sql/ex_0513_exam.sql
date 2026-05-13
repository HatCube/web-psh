CREATE TABLE customer (
    customer_id INT AUTO_INCREMENT PRIMARY KEY, -- 고객번호
    customer_name VARCHAR(50) NOT NULL, -- 고객 이름
    phone VARCHAR(20) UNIQUE, -- 전화번호(중복불가)
    grade VARCHAR(20) DEFAULT '일반' -- 고객 등급
);

CREATE TABLE product (
    product_id INT AUTO_INCREMENT PRIMARY KEY, -- 상품번호
    product_name VARCHAR(100) NOT NULL, --  상품명
    category VARCHAR(30) NOT NULL, --  카테고리
    price INT NOT NULL CHECK (price >= 0), --  가격
    stock INT NOT NULL DEFAULT 0 --  재고
);

CREATE TABLE orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY, -- 주문번호
    customer_id INT NOT NULL, -- 주문한 고객번호
    order_date DATETIME DEFAULT NOW(), --  주문일
    CONSTRAINT fk_orders_customer
        FOREIGN KEY (customer_id)
        REFERENCES customer(customer_id)
);

CREATE TABLE order_item (
    item_id INT AUTO_INCREMENT PRIMARY KEY, -- 주문 상세 번호
    order_id INT NOT NULL, -- 주문 번호
    product_id INT NOT NULL, -- 상품 번호
    quantity INT NOT NULL CHECK (quantity > 0), -- 주문수량
    CONSTRAINT fk_item_order
        FOREIGN KEY (order_id)
        REFERENCES orders(order_id),
    CONSTRAINT fk_item_product
        FOREIGN KEY (product_id)
        REFERENCES product(product_id)
);

INSERT INTO customer(customer_name, phone, grade) VALUES
('김철수', '010-1111-1111', '일반'),
('이영희', '010-2222-2222', 'VIP'),
('박민수', '010-3333-3333', '일반');

INSERT INTO product(product_name, category, price, stock) VALUES
('무선 마우스', '전자기기', 30000, 50),
('기계식 키보드', '전자기기', 120000, 20),
('사무용 의자', '가구', 180000, 10),
('텀블러', '생활용품', 25000, 100);

INSERT INTO orders(customer_id, order_date) VALUES
(1, '2026-05-01 10:00:00'),
(2, '2026-05-02 11:30:00'),
(1, '2026-05-03 14:00:00');

INSERT INTO order_item(order_id, product_id, quantity) VALUES
(1, 1, 2),
(1, 4, 1),
(2, 2, 1),
(3, 3, 1);
-- ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 select product_name, category, price,stock from product
 where price >= 50000 and stock  >= 20
 order by price desc;

insert into customer (customer_name,phone,grade) values
('최유리','010-4444-4444','일반');

select * from customer c;

select * from product p;

update product
set stock = stock + 30
where product_name = '텀블러'; 

select c.customer_name,
o.order_date,
p.product_name,
oi.quantity,
(p.price * oi.quantity) as order_price
from orders o 
inner join customer c 
on o.customer_id = c.customer_id 
inner join product p
inner join order_item oi
on p.product_id = oi.order_id 

select product_name,category,price
from product
where price > (select avg(price) from product);

select * from product p;

select customer_name
from customer
union
select product_name
from product p;

create table delivery(
delibery_id int auto_increment primary key,
order_id int not null,
address varchar(200) not null,
status varchar(20) default '배송준비',
delivered_at time,
constraint fk_order_id foreign key (order_id) REFERENCES orders(order_id)
);

select * from delivery;

alter table product add column description varchar(255);
alter table product modify stock int default 0;
alter table product drop column description;

select * from product p;

show index from product;
create index idx_product_category on product(category);

create view vw_customer_order_total as
select c.customer_id,
c.customer_name,
p.price * oi.quantity as total_price
from customer c
inner join product p
inner join order_item oi