create database if not exists academy_db
character set = utf8mb4
collate = utf8mb4_unicode_ci;

# 한줄 주석
-- 한줄 주석

/*
 * 범위
 * 주석
 * */

#TBL_MEMBER라는 이름의 테이블 만들기
#속성 
-- 문자열 : 이름(길이 50) 
-- 정수 : 나이
-- 제약조건 없음

#SQL은 스크립트 전체가 실행되지 않는다.
# 구문별로 실행이 된다.

#테이블을 생성하는 SQL이기 때문에 다시 실행하면 이미 만들어져 있다고 에러가 발생한다.
create table if not exists TBL_MEMBER (
NAME VARCHAR(50),
AGE INT
);

#테이블명 TBL_CAR
#속성
#정수 : ID
#문자열 : brand(길이 100)
#문자열 : color(길이 100)
#정수 : price 
#id 속성에 기본 키 제약 조건 주기
create table if not exists TBL_CAR(
	id int primary key,
	brand varchar(100),
	color varchar(100),
	price int
);

# 테이블 삭제
drop table tbl_car;

#테이블이 존재할 때만 삭제하는 방식
#DROP TABLE IF EXISTS 테이블 명;

#테이블 안의 데이터도 전부 삭제된다.
#외래키(FK)로 연결된 테이블이 있을 경우 삭제가 안될 수 있다.


#속성 옆에 제약조건을 주는거랑
#constrraint 써서 제약조건 주는 거랑 무슨 차이인가

#속성 옆에 작성하는 방법(inline방식)
#간단하고 직관적이다

#constraint로 제약조건 작성(table-level 방식)
#이름 지정 가능 
#constraint car_pk primary key(id);

#inline 방식은 이름이 자동 생성 > 나중에 수정/삭제가 어렵다

#여러 컬럼 제약조건 가능 여부
#inline방식은 단일컬럼에만 가능
#constraint pk_order primary key(user_id,product_id);

#가독성과 구조
#inline 방식
#간단,빠르게 작성, 소규모 테이블에 적합하다.

#constraint방식
#구조가 명확
#제약조건을 한곳에서 관리 가능
#실무에서 더 많이 사용

create table example (
col1 varchar(10) not null,
col2 varchar(10),
create_date datetime default current_timestamp
);

#수정
#ALTER TABLE 테이블명 ...

#컬럼 추가하기
#add column 컬럼명 데이터 타입;
alter table example add column col3 varchar(50);

#컬럼 삭제하기 
#DROP COLUMN 컬럼명;
alter table example drop column col2;

#컬럼명 변경하기
#RENAME COLUMN 컬럼명 TO 바꿀 컬럼명;
alter table example rename column col1 to first_col;

#컬럼의 타입 변경
#MODIFY COLUMN 컬럼명 타입;
alter table example modify column col3 INT;

#제약조건 추가하기
# ADD 제약조건 종류 (대상 컬럼);
alter table example add primary key (first_col);

#제약조건 삭제하기
#DROP 제약조건종류;
alter table example drop primary key;

#show index from 테이블
#제약조건에 부여된 이름 찾기 KEY_NAME 부분이 부여된 이름임
show index from tbl_car;

#STUDENT 테이블 만들기
#속성 
# ID : 정수,기본키
#NAME : 문자열(50), NOT NULL
#AGE : 정수 
#EMAIL : 문자열(100)

create table STUDENT(
id int primary key,
name varchar(50) not null,
age int,
email varchar(100)
);



#다음의 컬럼을 테이블에 추가하세요
#PHONE : 문자열(20)

alter table student add column phone varchar(20);

#AGE 컬럼의 타입을 정수 > TINYINT로 수정히세요

alter table student modify column age tinyint;

#NAME컬럼의 이름을 STUDENT_NAME으로 변경하세요

alter table student rename column name to student_name;

#PHONE컬럼을 삭제하세요

alter table student drop column phone;

#EMAIL컬럼을 NOT_NULL로 변경하세요

alter table student modify email varchar(100) not null;

#여러 컬럼을 한번에 추가하기
# ADDRESS : 문자열(100)
# GRADE : 정수
alter table student
add address varchar(100),
add grade int;

# grade 컬럼의 기본값을 1로 설정하기
alter table student
modify column grade int default 1;

#add로 추가하기
#pk,unique,check

#modify로 수정하기
#not null, default

#mysql에서 예약어를 컬럼명으로 사용할때
#백틱으로(``) 감싸준다.
create table tbl_animal(
	id int primary key,
	type varchar(100),
	age int,
	feed varchar(100)
);

#default와 check 제약조건 사용해보기
create table tbl_student(
id int primary key,
name varchar(100),
mager varchar(100),
gender char(1) not null default 'w',
birth date,
constraint ban_char check (gender in ('m','w')),
constraint ban_date check (birth  >= '1980-01-01')
);

#default : 컬럼에 값이 아예 주어지지 않았을때 자동으로 들어가는 값
#not null : 컬럼에 null값 자체를 허용하지 않겠다.

#같이 사용하면 값 생략시 'w'가 들어가게 되고, 누군가 null을 넣으려고 하면 db가 거부한다.

#not null이 없고 default만 있을때 누군가 gender자리에 null이라 넣으면 데이터가 null이라고 들어가게 된다.

#gender에 들어갈 수 있는 데이터는 m과 w만 들어갔으면 좋겠음
#null이 들어오면 무결성이 깨진다.