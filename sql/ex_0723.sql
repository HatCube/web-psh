CREATE TABLE books(
id BIGINT auto_increment PRIMARY KEY,
title varchar(100) NOT NULL,
author varchar(50) NOT NULL,
category varchar(30) NOT NULL,
price int NOT NULL,
stock int NOT null
)

insert into books values('1','자바의 정석','남궁성','프로그래밍',30000,10);
insert into books values('2','스프링 부트 입문','김철수','프로그래밍',28000,5);
insert into books values('3','데이터베이스 기초','이영희','데이터베이스',25000,8);
insert into books values('4','리액트 시작하기','박민수','프로그래밍',32000,3);
insert into books values('5','MySQL 완벽 가이드','최지훈','데이터베이스',35000,7);
insert into books values('6','알고리즘 문제 해결','홍길동','알고리즘',40000,2);