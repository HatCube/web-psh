-- film 테이블에서 길이가 60분 이상 90분 이하인 영화를 조회하세요

select title, length from film
where length between 60 and 90;

-- film 테이블에서 등급이 G 또는 PG 또는 PG - 13 인 영화의 제목과 길이,등급을 조회하라

select title,length,rating
from film
where rating in('G','PG','PG-13');