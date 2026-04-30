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

