-- having
-- where과 기능은 같다.
-- 그룹화된 결과에 조건을 적용할 때 사용하는 키워드

-- where > 그룹 묶기 전 필터링
-- having > 그룹 묶은 후의 필터링

-- group by를 사용하면 데이터가 다음과 같이 바뀐다.
-- 여러 행 > 그룹으로 묶임 > 집계값이 생성

-- where에서는 집계함수를 사용할 수 없다.

-- 평균 급여가 5000보다 큰 부서의 정보를 조회하세요
SELECT department_id, avg(salary)
FROM employees
-- WHERE avg(salary) > 5000 -- 전체 행에 대해서 평균급여를 구함
GROUP BY department_id
having avg(SALARY) > 5000;

-- select
-- from
-- where
-- group by
-- having

-- 급여가 5000 이상인 사원들을 대상으로 부서별 평균 급여가 7000 이상인 부서 조회하기

select department_id, avg(salary)
from employees
where salary >=  5000
group by DEPARTMENT_ID
having avg(salary) >= 7000;