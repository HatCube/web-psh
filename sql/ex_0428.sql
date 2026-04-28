-- film 테이블에서 길이가 60분 이상 90분 이하인 영화를 조회하세요

select title, length from film
where length between 60 and 90;

-- film 테이블에서 등급이 G 또는 PG 또는 PG - 13 인 영화의 제목과 길이,등급을 조회하라

select title,length,rating
from film
where rating in('G','PG','PG-13');

-- actor 테이블에서 이름이 A로 시작하는 배우의 이름을 조회하기

select last_name,first_name 
from actor
where first_name like 'A%';

-- film 테이블에서 제목에 LOVE가 포함된 영화의 제목을 조회하기 

select title 
from film
where title like '%love%';

-- actor 테이블에서 이름이 A로 시작하고 총 3글자인 배우의 이름을 조회하라

select first_name 
from actor
where first_name like 'A__';

-- actor 테이블에서 이름의 두번째 글자가 A인 배우를 조회하세요

select first_name 
from actor
where first_name like '_A%';

--- actor 테이블에서 이름이 정확히 4글자인 배우의 이름 조회

select first_name 
from actor
where first_name like '____';

-- not like
-- 패턴이 일치하지 않는 데이터를 조회할 때 사용

select title
from film
where title not like 'A%';

-- customer 테이블에서 이메일이 .org로 끝나는 고객을 조회하라

select first_name,last_name,email 
from customer
where email like '%.org';

-- film 테이블에서 제목에 dinosaur가 포함되어 있지 않은 영화의 제목을 조회하라

select title 
from film
where title not like '%dinosaur%';

-- DB 체인지 -- sakila > academy_db

create table fruit(
id int primary key,
name varchar(30),
price int
);

-- 한번에 여러 데이터 추가하기

insert into fruit (id,name,price)
values
	(1,'사과',3000),
	(2,'바나나',2000),
	(3,'포도',5000);

select * from fruit;

-- 한 건 추가
insert into fruit (id,name,price)
values (4,'복숭아',6000);

-- select가 된 결과를 추가하는 방법

create table fruit_backup(
id int primary key,
name varchar(30),
price int
);

insert into fruit_backup (id,name,price)
select id,name,price
from fruit
where price <= 3000;

select * from fruit_backup

-- 일부 컬럼만 추가하기
-- 컬럼이 not null이면 무조건 써야 함 
insert into fruit(id)
values (5);

select * from fruit;

-- 컬럼명을 생햑하는 insert
insert into fruit values (6,'딸기',3900);

select * from fruit;

-- null값을 직접 넣을 수 있다.
insert into fruit values (7,'키위',null);

-- default 값 사용하기
insert into tbl_student (id,name,mager,birth)
values (1,'홍길동','컴퓨터공학','2020-01-01');

select * from tbl_student;

-- 문자열 데이터를 넣을때 작은따옴표를 사용
-- 날짜 데이터도 작은따옴표 사용

insert into tbl_student (id,name,mager,gender,birth)
values (2,'이영희','산업디자인','W','2020-01-01');

insert into tbl_student (id,name,mager,gender,birth)
values (3,'김철수','화학공학','m','1980-01-02');

select * from tbl_student;

insert into flower (flower_name,flower_color,PRICE)
values
	('장미','빨간색',3000),
	('해바라기','노란색',6000),
	('튤립','보라색',5000),
	('안개꽃','흰색',2000);

select * from flower

-- 화분테이블에 추가하기
select * from pot;

insert into pot (pot_id,pot_color,pot_shape,flower_name)
values ('2026001','흰색','타원형','장미');

select * from pot;

insert into pot (pot_id,pot_color,pot_shape,flower_name)
values ('2026002','검은색','네모','해바라기');

-- tbl_student 테이블의 홍길동의 이름을 김길동으로 바꿔라

update tbl_student
set name = '김길동'
where id = 1; -- 이 조건을 걸지 않으면 테이블 내의 모든 속성이 수정될 수 있다.

select * from tbl_student ts;

-- default 값으로 바꾸기 
update tbl_student
set gender = default
where id = 3;

-- 여러 조건으로 update 하기
-- and를 사용하여 조건을 모두 만족하는 행만 수정하기
-- flower 테이블에서 색깔이 보라색이고 가격이 5000이상인 꽃의 이름을 진달래로 바꾸시오

select * from flower;

update flower
set flower_name = '진달래'
where flower_color = '보라색' and PRICE >=5000;

create table actor_practice as select actor_id,first_name,last_name,last_update
from sakila.actor;

select * from actor_practice;

-- actor 번호가 1번인 배우의 이름을 'james'로 수정

update actor_practice
set first_name = 'JAMES'
where actor_id = 1;

select * from actor_practice;

-- 배우 번호가 2번인 배우의 이름을 'MINA',성을 'LEE'로 수정
update actor_practice
set first_name = 'MINA',
last_name = 'LEE'
where actor_id = 2;

-- sakila 데이터베이스에 있는 film 테이블을 film_practice로 복사

create table film_practice as select * from sakila.film;

-- 영화 번호가 1번인 영화의 대여 가격(rental_rate)를 4.99로 수정

update film_practice
set rental_rate = 4.99
where film_id = 1

-- actor 테이블에서 이름이 A로 시작하는 배우의 성을 'test'로 바꾸시오
update actor_practice
set last_name = 'TEST'
where last_name like 'A%';

-- 영화 테이블에서 등급이 'R' 또는 'NC-17'인 영화의 대여기간(rental_duration)을 3으로 바꾸시오

update film_practice 
set rental_duration = 3
where rating in ('R','NC-17');

select * from film_practice
where rental_duration ='3'

-- 영화 번호가 1인 영화에 대해 대여기간을 1증가 시키기
select title,rental_duration from film_practice
where film_id = 1

update film_practice
set rental_duration = rental_duration + 1
where film_id = 1;

-- 영화 테이블의 대여료(rental_rate)를 10% 인상하세요
update film_practice
set rental_rate = rental_rate * 1.1;

select title, rental_rate from film_practice;

-- 배우 테이블에서 id가 1인 배우 삭제하기
delete from actor_practice 
where actor_id = 1;

-- 여러 행 삭제
-- 이름이 JOHN인 배우 모두 삭제하기

delete from actor_practice
where first_name = 'JOHN';

-- like를 이용한 삭제
-- 이름이 A로 시작하는 배우 삭제하기

delete from actor_practice 
where last_name like 'A%';

-- 데이터만 전부 삭제하기
delete from actor_practice;

-- flower 테이블의 장미 삭제하기
-- 외래키 컬럼이 데이터를 참조하고 있으면 참조 당하는 쪽의 데이터를 먼저 삭제할수 없다 
-- 외래키를 설정할 때 on delete CASCADE 설정을 주게되면 같이 삭제된다.

delete from flower where flower_name = '장미';

-- pot 테이블에서 장미꽃을 담고있는 화분 데이터 삭제하기

delete from pot where flower_name = '장미';

create table products(
no int primary key,
name varchar(100),
price int,
p_date date

);

insert into products (no,name,price,p_date)
values
	(1000,'컴퓨터',100,'2021-04-15'),
	(1002,'냉장고',200,'2021-03-29'),
	(1003,'에어컨',300,'2020-12-15'),
	(1004,'오디오',20,'2020-12-15'),
	(1001,'세탁기',60,'2021-04-15');

select * from products;

-- 사용자 생성하기
create user 'student_user'@'localhost'
identified by '1234';

-- 사용자 확인하기
-- MySQL 사용자는 MySQL.user 테이블에서 확인할 수 있다.

select user, host from mysql.user;

-- 사용자에게 권한 주기
-- grant
-- grant 권한 on 데이터베이스명.테이블명 to '사용자명'@'접속위치';

-- sakila 데이터베이스의 actor 테이블을 조회할 수 있는 권한 주기
grant select on sakila.actor to 'student_user'@'localhost';

select * from actor;
-- sakila 데이터베이스의 다른 테이블에도 접근할 수 있다.
grant select,insert,update
on sakila.*
to 'student_user'@'localhost';

-- 모든 권한 부여하기
grant all privileges
on sakila.*

-- 권한 확인하기
show grants for 'student_user'@'localhost';

-- revoke
-- 사용자에게 부여한 권한을 회수하는 명령어
-- revoke권한 on 데이터베이스명.테이블명 from '사용자명'@'접속위치';

revoke select 
on sakila.actor
from 'student_user'@'localhost';

-- 모든 권한 회수하기
revoke all privileges on sakila.* from 'student_user'@'localhost';

-- 자주 쓰이는 권한의 종류
-- select, insert, update, delete : 데이터 관련
-- create, drop, alter 테이블 관련
-- index : 인덱스 생성 / 삭제 관련
-- references : 외래키 관련 권한
-- all privilieges

-- 사용자 삭제
-- drop user '사용자명'@'접속위치';
drop user 'student_user'@'localhost';

create user 'test_user'@'%'
identified by '1234';

grant select, insert
on sakila.film
to 'test_user'@'%';

show grants for 'test_user'@'%';

revoke select
on sakila.film
from 'test_user'@'%';

drop user 'test_user'@'%';

select title,rental_rate from film_practice;

start transaction;
-- 임시 상태
update film_practice
set rental_rate = rental_rate + 1
where film_id = 1;

--	commit을 통해 확정을 한다.
-- rollback을 통해서 되돌리기
rollback;

commit; -- commit을 하면 확정되기 때문에 rollback을 해도 반영이 안됨