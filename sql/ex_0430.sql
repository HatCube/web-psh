-- ROUND(숫자, 자릿수)
-- 반올림

SELECT
  ROUND(1234.567, 2),
  ROUND(1234.567, 0),
  ROUND(1234.567),
  ROUND(1234.567, -1),
  ROUND(1234.567,-2);

-- FLOOR()
-- 주어진 숫자보다 작거나 같은 정수 중 최대값을 반환
-- 내림이라 생각해도 좋다.

select
	FLOOR(2),
	FLOOR(2.1),
	FLOOR(-2.1);

-- TRUNCATE()
-- 버림

select
	TRUNCATE(3.141592,2);

-- CEIL()
-- 주어진 숫자보다 크거나 같은 정수 중 최소 값
-- 올림

select
	CEIL(2),
	CEIL(2.1),
	CEIL(-2.1);

-- SIGN()
-- 인자로 전달된 숫자가 양수 > 1
-- 음수 > -1
-- 0 > 0
-- NULL > NULL

select 
	SIGN(-238),
	SIGN(0),
	SIGN(359);

-- MOD()
-- 나누기 했을 때 나머지를 구한다.
select 
	mod(1,3),
	MOD(2,3),
	MOD(3,3),
	MOD(4,3);

-- POWER(밑값,지수)

select 
	POWER(2,1),
	POWER(2,2),
	POWER(2,3),
	POWER(2,0);

-- RAND()
-- 0이상 1 미만의 난수를 반환

select
	RAND();

-- GREATEST() / LEAST()
-- 최대값, 최소값을 반환

select
	GREATEST(10,20,5),
	LEAST(10,20,5);

CREATE TABLE sales (
  id INT PRIMARY KEY,
  product VARCHAR(50),
  price DECIMAL(10,2),
  quantity INT,
  discount_rate DECIMAL(5,2)  -- 할인율(예: 0.15 → 15%)
);

INSERT INTO sales VALUES
(1, 'Keyboard', 29900, 2, 0.10),
(2, 'Mouse',    15900, 3, 0.05),
(3, 'Monitor',  199000, 1, 0.20),
(4, 'USB',       8900, 10, 0.00),
(5, 'Speaker',  45500, 4, 0.15);

-- 각 상품의 제품명과 가격을 3으로 나눈 나머지를 조회 하세요

select product,price,mod(price,3)
from sales;

-- 모든 내용을 조회 하돠, 할인율을 %로 표시
select id,product,concat((round(discount_rate * 100)),'%') 
from sales;
-- 세일즈 테이블에서 아이디,제품명,가격,재고,총 가격(소수점 아래 버림)을 조회하시오
select id,product ,price ,quantity ,price * quantity 
from sales;

-- 1 ~ 100 사이의 난수를 생성
select truncate(((rand() * 100)+1),0);

-- 상품 가격이 50000보다 크면 1,작으면 -1 같으면 0이 되도록 상품 이름과 함께 조회하라
select sign(price - 50000),product
from sales;

-- FORMAT()
-- 숫자를 사람이 보기 좋게 "문자열 형태로 포맷팅"하는 함수
-- 특히 천 단위 콤마(,) + 소수점 자리수 지정을 자동으로 해준다.

select format(1000000000,0);

-- 결과는 숫자가 아니라 문자열로 반환한다.

select 
ID,PRODUCT,FORMAT(PRICE,0),QUANTITY,DISCOUNT_RATE from sales;

-- 날짜 함수
-- 날짜 / 시간 데이터를 조회ㅡ계산,추출,변환,포맷팅을 할 때 사용

-- NOW()
-- 현재 날짜와 시간을 반환한다.

select NOW();

-- CURDATE() / CURRENT_DATE()
-- 현재 날씨만 반환

select CURDATE();

-- CURTIME() / CURRENT_TIME()
-- 현재 시간만 반환
select CURTIME();

-- YEAR(날짜)
-- 연도만 추출한다.
select YEAR('2026-04-30');

-- MONTH(날짜)
-- 월만 추출
select MONTH('2026-04-30');

-- DAY()
-- 일자를 추출 
select day ('2026-04-30');

-- HOUR(),MINUTE(),SECOND()
select HOUR('2026-04-30 15:20:10'),
MINUTE('2026-04-30 15:20:10'),second('2026-04-30 15:20:10');

-- 날짜(DATE) 포맷 : YYYY-MM-DD
-- DATETIME 포맷 : YYYY-MM-DD HH:MM:SS

-- 요일 관련 함수
-- DAYOFWEEK()
-- 요일을 숫자로 반환

select DAYOFWEEK('2026-04-30');
-- 1 : 일요일
-- 2 : 월요일
-- ...

-- WEEKDAY()
-- 요일을 숫자로 반환
-- 0 : 월요일
-- 6 : 일요일

-- DAYNAME()
-- 요일 이름을 반환(영어);
select DAYNAME('2026-04-30');

-- LAST_DAY(DATE)
-- 월의 마지막날 구하기
select CURDATE(),LAST_DAY('2026-05-01');

-- DATE_ADD(날짜,INTERVAL 숫자 단위)
-- INTERVAL 단위 : 얼마만큼 단위로 더할 것인가
select NOW(),DATE_ADD(NOW(),interval 10 DAY),
DATE_ADD(NOW(),interval 3 MONTH),
DATE_ADD(NOW(),interval 2 HOUR);

-- YEAR,MONTH,DAY,HOUR,MINUTE,SECOND

-- DATE_SUB(날짜, INTERVAL 숫자 단위)
-- 날짜를 뺀다.
select DATE_SUB(NOW(),interval 10 DAY),
DATE_SUB(NOW(),interval 3 MONTH),
DATE_SUB(NOW(),interval 2 HOUR);

-- 날짜 간의 차이를 계산
-- DATEDIFF()
-- 두 날짜 사이의 차이를 "일수"로 계산한다.
select DATEDIFF('2026-05-10','2026-04-30'),
DATEDIFF('2026-04-30','2026-05-10');


-- DATE_FORMAT(날짜,포맷)
-- 날짜를 원하는 문자열 형태로 바꾼다.

-- 자주 쓰는 포맷 기호
-- %Y : 4자리 년도		2026
-- %y : 2자리 년도		26
-- %m : 2자리 월		04
-- %c : 1-2자리 월 	4
-- %d : 2자리 일 		01
-- %e : 1-2자리 일	1
-- %H : 24시간제 시 	15
-- %h : 12시간제 시 	03
-- %i : 분
-- %s : 초
-- %w : 요일명	Thursday
-- %a : 짧은 요일명	Thu

select DATE_FORMAT('2026-04-30 15:20:10','%Y년 %m월 %d일 %H시 %i분 %s초');

-- MAKEDATE(연도,일수)
select MAKEDATE(2026,32);

-- 주문 테이블에서 고객의 이름과 년,월,일을 조회하세요

CREATE TABLE orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer VARCHAR(50),
    order_date DATE,
    ship_date DATE,
    price INT
   );

INSERT INTO orders (customer, order_date, ship_date, price) VALUES
('홍길동', '2025-01-02', '2025-01-05', 30000),
('이몽룡', '2025-01-10', '2025-01-12', 45000),
('성춘향', '2024-12-28', '2025-01-03', 52000),
('김철수', '2025-02-01', '2025-02-03', 15000),
('박영희', '2025-02-10', NULL, 22000);  -- 아직 배송되지 않음

select customer,year(order_date),month(order_date),day(order_date)
from orders;

-- 배송까지 걸린 일수를 이름과 함께 조회하기
-- 배송 안된것은 제외

select customer,DATEDIFF(ship_date,order_date) from orders where ship_date is not null;

-- 2025년 1월에 주문된 주문만 조회하라
select *
from orders
where year(order_date) = 2025 and month(order_date) = 1;

-- 주문 날짜를 기준으로 2024년에 주문된 기록만 조회하라

select *
from orders
where year(order_date) = 2024;

DROP TABLE IF EXISTS EMPLOYEES;

CREATE TABLE EMPLOYEES (
    EMPLOYEE_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(50),
    LAST_NAME VARCHAR(50),
    EMAIL VARCHAR(100),
    HIRE_DATE DATE,
    JOB_ID VARCHAR(20),
    SALARY INT,
    COMMISSION_PCT DECIMAL(3,2),
    MANAGER_ID INT,
    DEPARTMENT_ID INT
);

INSERT INTO EMPLOYEES VALUES
(100, 'Steven', 'King', 'SKING', '2003-06-17', 'AD_PRES', 24000, NULL, NULL, 90),
(101, 'Neena', 'Kochhar', 'NKOCHHAR', '2005-09-21', 'AD_VP', 17000, NULL, 100, 90),
(102, 'Lex', 'De Haan', 'LDEHAAN', '2001-01-13', 'AD_VP', 17000, NULL, 100, 90),
(103, 'Alexander', 'Hunold', 'AHUNOLD', '2006-01-03', 'IT_PROG', 9000, NULL, 102, 60),
(104, 'Bruce', 'Ernst', 'BERNST', '2007-05-21', 'IT_PROG', 6000, NULL, 103, 60),
(105, 'David', 'Austin', 'DAUSTIN', '2005-06-25', 'IT_PROG', 4800, NULL, 103, 60),
(106, 'Valli', 'Pataballa', 'VPATABAL', '2006-02-05', 'IT_PROG', 4800, NULL, 103, 60),
(107, 'Diana', 'Lorentz', 'DLORENTZ', '2007-02-07', 'IT_PROG', 4200, NULL, 103, 60),
(108, 'Nancy', 'Greenberg', 'NGREENBE', '2002-08-17', 'FI_MGR', 12000, NULL, 101, 100),
(109, 'Daniel', 'Faviet', 'DFAVIET', '2002-08-16', 'FI_ACCOUNT', 9000, NULL, 108, 100),
(110, 'John', 'Chen', 'JCHEN', '2005-09-28', 'FI_ACCOUNT', 8200, NULL, 108, 100),
(111, 'Ismael', 'Sciarra', 'ISCIARRA', '2005-09-30', 'FI_ACCOUNT', 7700, NULL, 108, 100),
(112, 'Jose Manuel', 'Urman', 'JMURMAN', '2006-03-07', 'FI_ACCOUNT', 7800, NULL, 108, 100),
(113, 'Luis', 'Popp', 'LPOPP', '2007-12-07', 'FI_ACCOUNT', 6900, NULL, 108, 100),
(114, 'Den', 'Raphaely', 'DRAPHEAL', '2002-12-07', 'PU_MAN', 11000, NULL, 100, 30),
(115, 'Alexander', 'Khoo', 'AKHOO', '2003-05-18', 'PU_CLERK', 3100, NULL, 114, 30),
(116, 'Shelli', 'Baida', 'SBAIDA', '2005-12-24', 'PU_CLERK', 2900, NULL, 114, 30),
(117, 'Sigal', 'Tobias', 'STOBIAS', '2005-07-24', 'PU_CLERK', 2800, NULL, 114, 30),
(118, 'Guy', 'Himuro', 'GHIMURO', '2006-11-15', 'PU_CLERK', 2600, NULL, 114, 30),
(119, 'Karen', 'Colmenares', 'KCOLMENA', '2007-08-10', 'PU_CLERK', 2500, NULL, 114, 30);

-- 부서번호가 30번인 사원들의 이름을 출력하되, 아룸즁 'el'을 모두 '**'로 마스킹 처리하여 출력하라
select REPLACE(first_name,'el','**') from employees where DEPARTMENT_ID = 30;
-- 이름이 6글자 이상인 사원의 사번과 이름, 급여를 조회하라
select EMPLOYEE_ID , FIRST_NAME, salary from employees where CHAR_LENGTH(FIRST_NAME) >= 6;
-- 사원테이블에서 이름과 사번을 출력하되 사원번호는 짝수면 0 홀수면 1로 출력하라
select first_name,MOD(employee_id,2) from employees;
-- 사원 번호가 짝수인 사람들의 사원번호와 이름 조회하기
select first_name,employee_id from employees where mod(EMPLOYEE_ID,2) = 0;

-- 사원 테이블에서 이름, 급여 1000당 ■로 개수 채워 조회하기
-- ex) 홍길동 8000 ■■■■■■■■ 

select first_name,salary,repeat('■',round(salary / 1000)) from employees; 

-- 사원 테이블에서 이름, 입사 날짜, 6개월 뒤 입사 날짜 순으로 조회하라
select first_name, hire_date, DATE_ADD(HIRE_DATE,interval 6 month)from employees;

-- 집계함수
-- 여러행의 값을 하나의 결과값으로 요약해주는 함수

# 학생 점수를 저장한 score 테이블을 먼저 만들고 데이터를 넣는다.
CREATE TABLE score (
  id INT,
  name VARCHAR(30),
  subject VARCHAR(20),
  point INT
);

INSERT INTO score VALUES
(1, '홍길동', '국어', 85),
(2, '김철수', '영어', 90),
(3, '이영희', '수학', 78),
(4, '박민수', '영어', 92),
(5, '최다혜', '국어', NULL);

-- count()
-- 값의 개수를 반환하는 함수
select count(point) from score;
-- 점수가 null이 아닌 개수

select count(name) from score;
select count(*) from score; -- null을 포함한 모든 행의 개수

-- sum()
-- null은 제외한 총합을 구한다.
select sum(point) from score;

-- avg()
-- null을 제외한 평균 계산
select avg(point) from score;

-- max()
-- 최대값을 구한다
select max(point)from score;

-- min()
-- 최소값을 구한다.
select min(point) from score;

-- 사원 테이블에서 직종이 (job_id)가 it_prog인 사람들의
-- 평균 급여, 급여 최고액, 급여 최저액, 급여의 총 합계를 출력하세요
select avg(salary),max(salary),min(salary),sum(salary) from employees where JOB_ID = 'IT_PROG';

-- 사원 테이블에서 100번 부서의 사원들의 급여의 평균을 출력하되 소수점 한자리 까지 출력하라 
select format(avg(salary),1) from employees where DEPARTMENT_ID = 100;

-- 총 사원수가 몇명인지 구하시오
select count(*) from employees;

-- 급여가 5000 이상인 사람들의 평균 급여를 구하시오
select avg(salary) from employees where salary >= 5000;

-- 입사일이 2005년에 입사한 사원들의 수를 구하시오
select count(hire_date) from employees where year(HIRE_DATE) = '2005';  

-- 일반적으로 집계함수와 일반 속성은 select절에서 같이 조회가 불가능하다.

select job_id,count(*)
from employees
group by JOB_ID;

-- group by로 묶은 속성은 select에서 집계함수와 함께 사용할 수 있다.

-- 사원 테이블에서 각 직종별 급여의 합 구하기
select JOB_ID, sum(salary)
from employees
group by JOB_ID;

-- 부서별로 가장 높은 급여 조회
select DEPARTMENT_ID, max(salary)
from employees
group by DEPARTMENT_ID;

-- 그룹별로 구분을 할 때 기준이 꼭 하나일 필요는 없다.

select DEPARTMENT_ID,JOB_ID,count(*)
from employees
group by DEPARTMENT_ID, JOB_ID;

-- 사원 테이블에서 입사 년도 별 사원 수를 조회
-- 년도 이름 순으로
select year(HIRE_DATE),count(*)
from employees
group by year(HIRE_DATE);

-- 부서별로 급여가 5000 이상인 사원들의 평균 급여 구하기 

select avg(salary),count(*)
from employees
where salary >= 5000
group by salary;

-- 부서별 최고급여와 최저급여의 차이를 구하시오

select JOB_ID,MAX(salary),MIN(salary),(MAX(salary) - MIN(SALARY))
from employees
group by JOB_ID;

-- 이름에 'A'가 포함된 사원들만 대상으로 이름 길이별 사원 수를 구하라

select first_name,last_name,format(CHAR_LENGTH(FIRST_NAME),0)
from employees
where FIRST_NAME like '%A%';

-- 입사일 기준으로 요일별 사원 수 구하기

