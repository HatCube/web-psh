CREATE TABLE sales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    region VARCHAR(20) NOT NULL,
    category VARCHAR(20) NOT NULL,
    product_name VARCHAR(50) NOT NULL,
    sales_amount INT NOT NULL,
    sales_date DATE NOT NULL
);

INSERT INTO sales (region, category, product_name, sales_amount, sales_date) VALUES
('서울', '전자제품', '노트북', 1200000, '2026-05-01'),
('서울', '전자제품', '마우스', 50000, '2026-05-01'),
('서울', '가구', '의자', 150000, '2026-05-02'),
('서울', '가구', '책상', 300000, '2026-05-02'),
('부산', '전자제품', '노트북', 1100000, '2026-05-01'),
('부산', '전자제품', '키보드', 80000, '2026-05-02'),
('부산', '가구', '의자', 130000, '2026-05-03'),
('부산', '가구', '책상', 280000, '2026-05-03'),
('대구', '전자제품', '마우스', 45000, '2026-05-01'),
('대구', '전자제품', '키보드', 75000, '2026-05-02'),
('대구', '가구', '의자', 120000, '2026-05-03'),
('대구', '가구', '책상', 250000, '2026-05-03');

-- 1. 지역별 매출 합게와 전체 매출 합계 조회
-- - sales테이블에서 지역별 매출 합계를 구하고, 마지막에 전체 합계도 함께 출력하세요
-- region을 기준으로 그룹화하기
-- - sum(sales_amount) 사용하기
-- 
-- 2. ROLLUP 결과의 NULL을 ‘전체합계’로 표시하기

select ifnull(region,'전체 합계'), SUM(sales_amount)
from sales
group by region with rollup;

-- 3. 지역별, 카테고리별 매출 합계와 소계 조회
-- 
-- 지역과 카테고리별 매출 합계를 구하고, 각 지역별 소계와 전체 합계도 함께 출력하시오.
-- 
-- 조건
-- region, category 순서로 그룹화하시오.
-- 
-- 4. 지역별, 카테고리별 매출 소계를 보기 좋게 출력하기
-- 
-- 문제 3의 결과에서 NULL 값을 보기 좋은 문자로 바꾸시오.
-- 
-- 조건
-- region이 NULL이면 전체
-- category가 NULL이면 소계

select ifnull(category,'소계'),ifnull(region,'전체 합계'),sum(sales_amount)
from sales
group by category,region with rollup


-- 5. 지역별, 카테고리별 판매 건수와 매출 합계 조회
-- 
-- 지역별, 카테고리별로 판매 건수와 매출 합계를 구하고, 지역별 소계와 전체 합계를 함께 출력하시오.
-- 
-- 조건
-- 판매 건수는 COUNT(*)를 사용하시오.
-- 매출 합계는 SUM(sales_amount)를 사용하시오.

select region,category,count(*)
from sales
group by region,category with rollup;

-- 6. 날짜별 매출 합계와 전체 합계 조회
-- 
-- 판매일자별 매출 합계를 구하고, 전체 매출 합계도 함께 출력하시오.
-- 
-- 조건
-- sales_date 기준으로 그룹화하시오.
-- NULL은 전체기간으로 표시하시오.

select ifnull(cast(sales_date as char),'전체 기간'),sum(sales_amount)
from sales
group by sales_date with rollup;

-- 7. 특정 지역만 필터링한 뒤 ROLLUP 적용하기
-- 
-- 서울과 부산 데이터만 대상으로 지역별, 카테고리별 매출 합계와 소계를 구하시오.

select region,category,sum(sales_amount)
from sales
where region in('서울','부산')
group by region,category with rollup;

-- 8. 매출 합계가 1,000,000원 이상인 그룹만 조회하기
-- 지역별 매출 합계를 구한 뒤, 매출 합계가 1,000,000원 이상인 그룹만 출력하시오.

select region,sum(sales_amount) from sales
group by region with rollup
having sum(sales_amount) >= 1000000;

-- ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    emp_id INT AUTO_INCREMENT PRIMARY KEY,
    emp_name VARCHAR(30),
    department VARCHAR(30),
    salary INT
);

INSERT INTO employee (emp_name, department, salary) VALUES
('김철수', '개발팀', 7000),
('이영희', '개발팀', 7000),
('박민수', '개발팀', 5000),
('최유리', '인사팀', 6000),
('정하늘', '인사팀', 4000),
('한지민', '인사팀', 4000);

-- 급여가 높은 순으로 순번 부여하기
-- rank()사용
-- 순위 뒤에는 사원의 모든 내용 조회하기

select rank()over(order by salary desc),emp_name,department, salary 
from employee

-- 다음과 같은 형식으로 결과를 출력하시오
-- 개발팀 - 김철수 - 1위

select concat(department,' - ',emp_name,' - ',rank()over(order by salary desc),'위')
from employee

-- 개발팀 직원들의 급여 순위를 출력하시오

select emp_name,department,salary,rank()over(order by salary desc)
from employee
where department = '개발팀';

-- 부서별 순위

select
emp_name,department,salary,rank()over(partition by department order by salary desc)
from employee;
