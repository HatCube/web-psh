-- 꽃 flower
-- 이름(PK) varchar(200)
-- ㅡㅡㅡㅡㅡㅡ
-- 색깔 varchar(200)
-- 가격 int
-- 
-- 화분 pot
-- 제품번호(PK) varchar(100)
-- ㅡㅡㅡㅡㅡㅡ
-- 화분 색깔varchar(100)
-- 모양 varchar(100)
-- 꽃이름varchar(200)(FK)


create table if not exists FLOWER (
flower_name VARCHAR(200),
flower_color VARCHAR(200),
PRICE INT,
constraint flower_pk primary key(flower_name)
);

create table if not exists POT (
pot_id VARCHAR(100),
pot_color VARCHAR(200),
pot_shape VARCHAR(100),
flower_name varchar(200),
constraint foreign key(flower_name) references FLOWER(flower_name),
constraint flower_pk primary key(pot_id)
);

create table if not exists user (
user_id VARCHAR(200),
user_name varchar(200),
constraint user_pk primary key(user_id)
);

create table if not exists post (
post_id VARCHAR(200),
post_title VARCHAR(200),
post_detail VARCHAR(200),
user_id varchar(100),
constraint foreign key(user_id) references user(user_id),
constraint post_pk primary key(post_id)
);

create table if not exists comment (
comment_id VARCHAR(200),
post_id VARCHAR(200),
constraint foreign key(post_id) references post(post_id),
user_id varchar(200),
constraint foreign key(user_id) references user(user_id),
comment_detail varchar(200),
comment_time datetime default current_timestamp,
constraint comment_pk primary key(comment_id)

);