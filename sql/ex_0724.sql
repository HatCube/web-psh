CREATE TABLE productdb.product (
product_id bigint auto_increment primary key,
product_name varchar(50) not null,
product_stock bigint not null,
product_price int not null,
register_date datetime default CURRENT_TIMESTAMP(),
update_date datetime default current_timestamp()
)

create table productdb.orders (
order_id bigint auto_increment primary key,
product_id bigint,
product_count int, 
order_date datetime default current_timestamp(),
constraint fk_product_id foreign key (product_id) REFERENCES productdb.product(product_id)
)

insert into productdb.product values('1','사과',10,10000,current_timestamp(),current_timestamp());
insert into productdb.product values('2','바나나',15,20000,current_timestamp(),current_timestamp());