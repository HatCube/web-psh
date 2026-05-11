DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS product;

CREATE TABLE product (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    price INT NOT NULL,
    stock INT NOT NULL
);

INSERT INTO product(product_name, category, price, stock) VALUES
('기계식 키보드', '전자기기', 120000, 20),
('무선 마우스', '전자기기', 50000, 50),
('모니터 받침대', '가구', 35000, 30),
('사무용 의자', '가구', 200000, 10),
('텀블러', '생활용품', 25000, 100),
('노트북 거치대', '전자기기', 70000, 15);

CREATE TABLE orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT NOT NULL,
    quantity INT NOT NULL,
    total_price INT NOT NULL,
    order_date DATETIME DEFAULT NOW()
);

-- 전체 상품 조회 프로시저 만들기
-- 이름 : get_all_procedure
-- product 테이블의 전체 상품을 조회한다.
-- 가격이 높은 순서대로 정렬한다.

delimiter //
create procedure get_all_procedure()
begin
	select *
	from product
	order by price desc;
end //
delimiter ;

call get_all_procedure();

-- 상품 ID로 상품 조회하기
-- 이름 : get_product_by_id
-- 상품 id를 전달받아서 해당 상품 정보를 조회하세요
delimiter //
create procedure get_product_by_id(
	in p_product_id int
)
begin
	select *
	from product
	where product_id = p_product_id;
end //
delimiter ;

call get_product_by_id(1);
-- 카테고리별 상품 조회하기
-- 이름 : get_products_by_category
-- 카테고리명을 입력받는다.
-- 해당 카테고리의 상품만 조회한다.
-- 가격이 낮은 순으로 정렬한다.
delimiter //
create procedure get_products_by_category(
	in p_category varchar(50)
)
begin
	select *
	from product
	where category = p_category
	order by price;
end //
delimiter ;

call get_products_by_category('전자기기');

-- 상품 재고를 반환받기
-- 이름 : get_product_stock
-- 상품 ID를 입력받는다.
-- 해당 상품의 재고를 OUT 매개변수로 반환한다.
-- 호출 후 세션 변수로 결과를 확인한다.
delimiter //
create procedure get_product_stock(
	in p_product_id int,
	out p_stock int
)
begin
	select stock
	into p_stock
	from product
	where product_id = p_product_id;
end //
delimiter ;

call get_product_stock(1, @result_stock);
select @result_stock as stock;

-- 상품 추가 프로시저 만들기
-- 이름 : insert_product
-- 상품명, 카테고리, 가격, 재고를 입력받아서 product 테이블에 상품을 추가한다.
-- 추가 후 전체 상품 목록을 조회한다.

drop procedure insert_product;

delimiter //
create procedure insert_product(
	in p_product_name varchar(100),
	in p_category varchar(50),
	in p_price int,
	in p_stock int
)
begin
	insert into product (product_name, category, price, stock)
	values (p_product_name, p_category, p_price, p_stock);

	select * from product;
end //
delimiter ;

call insert_product('웹캠','전자기기',80000,25);

--  상품 가격 수정하기
-- 이름 : update_product_price
-- 상품 ID와 변경할 가격을 입력받는다.
-- 해당 상품의 가격을 수정한다.
-- 수정된 행이 있으면 "가격이 수정되었습니다." 출력하기
-- 수정된 행이 없으면 "해당 상품이 없습니다." 출력하기
-- ROW_COUNT() : 변경된 행의 개수 반환
delimiter //
create procedure update_product_price(
	in p_product_id int,
	in p_price int
)
begin
	update PRODUCT
	set PRICE = P_PRICE
	where PRODUCT_ID = P_PRODUCT_ID;

	-- row_count() : 직전에 실행한 sql문이 몇개의 행에 영향을 주었는지 반환
	if ROW_COUNT() > 0 then
		select '가격이 수정되었습니다.' as message;
	else
		select '해당 상품이 없습니다.' as message;
	end if;
end //
delimiter ;

-- 상품이 있으면 수정하고 없으면 추가하기
-- 이름 upsert_product
-- 상품id 상품명 카테고리 가격 재고를 받는다
-- 입력받은 상품 id가 product 테이블에 존재하면 상품 정보를 수정한다.
-- 존재하지 않으면 새로운 상품을 추가한다
-- 처리 결과 메시지를 출력한다.

drop procedure upsert_product;

delimiter //
create procedure upsert_product(
   in p_product_id int,
   in p_product_name varchar(100),
   in p_category varchar(50),
   in p_price int,
   in p_stock int
)
begin
   -- 조회된 개수를 담을 변수
   declare v_count int;

   -- id를 가지고 조회되는 데이터가 있는 지 개수를 센다.
   select count(*)
   into v_count
   from product
   where product_id = p_product_id;
   
   -- v_count >0 : 조회된 행이 있다. -> product_id가 존재하니 수정을 해라
   if v_count > 0 then
      update product
      set product_name = p_product_name,
         category = p_category,
         price = p_price,
         stock = p_stock
      where product_id = p_product_id;
      
      select '기존 상품 정보가 수정되었습니다.' as message;
   else
      insert into product (product_id ,product_name, category, price, stock)
      values (p_product_id, p_product_name, p_category, p_price, p_stock);
      
      select '새로운 상품이 추가되었습니다.' as message;
   end if;
end //
delimiter ;

call upsert_product(1,'고급 기계식 키보드', '전자기기',150000, 30);
call upsert_product(100,'스마트 스탠드', '생활용품',45000, 30);

-- 상품 id가 있으면 삭제하고 없으면 없다고 메시지 출력하기
-- 이름 : delete_product_if_exists
-- 상품 id를 입력받고 해당 상품 id가 있으면 삭제한다.
-- 해당 상품 id가 없으면 '데이터가 없습니다'를 출력한다.
-- 삭제 성공 시 '삭제 되었습니다'를 출력한다.

DELIMITER //
create procedure delete_product_if_exists(
   in p_product_id INT
)
begin
   delete from product
   where product_id = p_product_id;

	if row_count() > 0 then
		select '삭제되었습니다' as message;
	else
		select '데이터가 없습니다.' as message;
	end if;
end //
DELIMITER ;

call delete_product_if_exists(100);
call delete_product_if_exists(100);

-- 주문처리 프로시저 만들기
-- 이름 : order_product
-- 상품 id와 주문수량을 입력받는다.
-- 상품이 존재하지 않으면 '상품이 존재하지 않습니다'출력
-- 재고가 부족하면 '재고가 부족합니다 '출력하기
-- 재고가 충분하면 orders 테이블에 주문을 추가한다.
-- 주문 후 product 테이블의 제고를 차감한다.
-- 주문 성공 시 '주문이 완료되었습니다'출력

delimiter //
create procedure order_product(
   in p_product_id int,
   in p_quantity int
)
begin
   declare v_count int;
   declare v_stock int;
   declare v_price int;
   
   select count(*)
   into v_count
   from product
   where product_id = p_product_id;
   
   if v_count = 0 then
      select '상품이 존재하지 않습니다' as message;
   else
      -- 가격과 재고를 조회하여 사용하기 위해 변수에 담는다.
      select price, stock
      into v_price, v_stock
      from product
      where product_id = p_product_id;
   
      if v_stock < p_quantity then
         select '재고가 부족합니다.' as message;
      else -- v_stock >= p_quantity
         -- 주문내역을 orders 테이블에 추가
         insert into orders (product_id, quantity, total_price)
         values (p_product_id, p_quantity, v_price * p_quantity);
         
         -- 주문한 수량만큼 제품의 재고를 차감
         update product
         set stock = stock - p_quantity
         where product_id = p_product_id;
         
         select '주문이 완료되었습니다.' as message;
      end if;
   end if;
end //
delimiter ;

call order_product(1,2);
-- 가격 등급 조회 프로시저
-- 이름 : get_price_grade
-- 상품 id를 입력받는다.
-- 가격이 100,000원 이상이면 "고가 상품"이라고 출력하기
-- 50,000원 이상 100,000 미만이면 "중간 가격 상품"을 출력하기
-- 상품 가격이 50,000원 미만이면 "저가 상품" 출력하기
-- 상품이 없으면 "상품이 없습니다." 출력하기

delimiter //
create procedure get_price_grade(
	in p_product_id int
)
begin
	declare v_count int ;
	declare v_price int;

	select count(*)
	into v_count
	from product
	where product_id = p_product_id;
	
	if v_count = 0 then
		select '상품이 없습니다' as message;
	else
		select price
		into v_price
		from product
		where product_id = p_product_id;
	
		if v_price >= 100000 then
			select '고가 상품' as grade;
		elseif v_price >= 50000 then
			select '중간 가격 상품' as grade;
		else 
			select '저가 상품' as grade;
		end if;
	end if;
	
end //
delimiter ;

call get_price_grade(1);
call get_price_grade(2);
call get_price_grade(3);

-- 기본 문법
-- case
-- 	when 조건식 1 then 결과 1
-- 	when 조건식 2 then 결과 2
-- 	when 조건식 3 then 결과 3
-- 	else 기본결과
-- end

-- product 테이블에서 상품명, 재고, 재고가 50개 이상이면 '재고많음'
-- 10개 이상이면 '재고 보통', 그 미만은 '재고 부족'

select 
	product_name,
	stock ,
	case
		when stock >= 50 then '재고 많음'
		when stock >= 10 then '재고 보통'
		else '재고 부족'
	end as stock_status
from product;

-- when은 조건
-- then은 조건이 참일 때 반환할 값
-- else는 어떠한 조건도 만족하지 않을 때의 반환할 값
-- end는 case문의 끝을 의미한다.
-- case문은 위에서 아래로 조건을 검사한다
-- 범위조건은 큰 조건부터 작은 조건 순서대로 작성해야 한다.

-- 특정 컬럼의 값이 무엇인지 비교할 때 사용할 수 있다.

select
	product_name,
	category,
	case category
		when '전자기기' then '전자제품 코너'
		when  '가구' then '가구 코너'
		when '생활용품' then '생활용품 코너'
		else '기타 코너'
	end as display_area
	from product;

-- case문은 select 절에서 사용되며 실제 테이블에 없는 가상의 결과 컬럼을 만들 수 있다.

-- case문은 order by에서도 사용할 수 있다.
select 
	product_name,
	stock
from product
order by
	case 
		when stock < 10 then 1
		when stock < 30 then 2
		else 3
	end, stock;
	
-- update 문에서도 사용할 수 있다.
alter table product add status varchar(20);

update product
set status = 
	case
		when stock <= 10 then '재고 부족'
		else '판매중'
	end;

select * from product;

-- group by와 집계에도 자주 사용된다.
-- 상품이 가격대별로 몇개 씩 있는지 조회하기
select
	case 
		when price >= 100000 then '고가'
		when price >= 50000 then '중가'
		else '저가'
	end as price_level,
	count(*) as product_count
	from product
	group by
		case 
			when price >= 100000 then '고가'
			when price >= 50000 then '중가'
			else '저가'
	end;

-- sum과 case 를 같이 쓰면 조건별 집계가 가능하다.
-- 조건별 개수를 직접 계산한다.
select
	sum(case when category = '전자기기' then 1 else 0 end) as electronic_count,
	sum(case when category = '가구' then 1 else 0 end) as furniture_count,
	sum(case when category = '생활용품' then 1 else 0 end) as life_count
	from product;

-- 카테고리별로 그룹을 만든다.
select 
	category,count(*)
	from product p
	group by category;

CREATE TABLE student_score (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(30),
    subject VARCHAR(30),
    score INT,
    attendance_rate INT
);
INSERT INTO student_score VALUES
(1, '김철수', 'Java', 95, 98),
(2, '이영희', 'Java', 82, 90),
(3, '박민수', 'Java', 67, 75),
(4, '최유리', 'Database', 88, 92),
(5, '정하늘', 'Database', 73, 80),
(6, '한지민', 'Database', 55, 60),
(7, '강민호', 'Python', 100, 100),
(8, '윤서연', 'Python', 45, 50);

-- 점수 등급 출력하기
-- 90점 이상 A 
-- 80점 이상 B
-- 70점 이상 C 
-- 60점 이상 D
-- 그 외 F
-- 출력 컬럼 student_name score grade

select 
	student_name,
	score,
	case 
		when score >= 90 then 'A'
		when score >= 80 then 'B'
		when score >= 70 then 'C'
		when score >= 60 then 'D'
		else 'F'
	end as grade
from student_score;

-- 출석상태 출력하기
-- 95 이상 우수
-- 80 이상 보통
-- 그외 위험
-- 출력 컬럼 
-- 이름 출석률 출석 상태

select 
	student_name,
	attendance_rate,
	case 
		when attendance_rate >= 95 then '우수'
		when attendance_rate >= 80 then '보통'
		else '위험'
	end as '출석상태'
from student_score;

-- 과목별 난이도 표시하기
-- java > 중급
-- database > 어려움
-- Python 쉬움
-- 출력 컬럼 
-- subject difficulty

select 
	subject,
	case subject
		when 'Java' then '중급'
		when 'Database' then '어려움'
		when 'Python' then '쉬움'
	end as difficulty
from student_score;

-- 장학생 여부 출력
-- 점수 >= 90이고 출석률 >= 90
-- 둘다 만족하면 장학생 
-- 아니면 일반학생

select 
	student_name,
	score,
	attendance_rate,
	case 
		when score >= 90 and attendance_rate >= 90 then '장학생'
		else '일반학생'
	end as scholarship
	from student_score;
	

-- grade 컬럼을 추가한 후 다음 기준으로 값을 update 하기
-- 90점 이상 A
-- 80점 이상 B
-- 70점 이상 C
-- 60점 이상 D
-- 그 외 F 

alter table student_score add grade varchar(20);

update student_score
set grade = 
		case 
			when score >= 90 then 'A'
			when score >= 80 then 'B'
			when score >= 70 then 'C'
			when score >= 60 then 'D'
			else 'F'
		end;

select * from student_score ss;

-- while문의 기본 문법
-- while 조건 do
-- 실행문;
-- end while;

create table loop_test(
	num int
);
delimiter //
create procedure while_example()
begin
	declare v_num int default 1;
	
	while v_num <= 5 do
		insert into loop_test values(v_num);
		set v_num = v_num + 1;
	end while;
end //
delimiter ;

call while_example();
select * from loop_test;

-- repeat
-- 무조건 한 번 실행 후 조건 검사
-- repeat
-- 실행문;
-- until 조건
-- end repeat;

delimiter //
create procedure repeat_example()
begin
	declare v_num int default 6;
	
	repeat
		insert into loop_test values(v_num);
		set v_num = v_num + 1;
	until v_num > 10 -- 조건이 거짓이면 반복, 참이면 종료
	end repeat;
end //
delimiter ;

call repeat_example;

select * from loop_test;

-- loop
-- 무한반복 기반
-- 직접 종료 조건을 만들어야 한다.
-- label : loop
-- 실행문 ;
-- if 조건 then leave label;
-- end if;
-- end loop;

delimiter //
create procedure loop_example()
begin
	declare v_num int default 11;
	
	my_loop:loop
		insert into loop_test values(v_num);
		
		set v_num = v_num + 1;
		
		if v_num > 16 then
			leave my_loop;
		end if;
	end loop;
end //
delimiter ;

call loop_example;

select * from loop_test;

create table loop_result(
	value_text varchar(100)
);
-- while 문을 이용하여 1 - 20 까지의 수 중 짝수만 저장하라
delimiter //
create procedure even_num()
begin
	declare v_num int default 1;
	
		while v_num <= 20 do
			if mod(v_num,2) = 0 then 
				insert into loop_result values(v_num);
			end if ;
		set v_num = v_num + 1;
	end while;
end //
delimiter ;

call even_num();
select * from loop_result;

-- repeat 문을 사용하여 1 부터 10 까지의 총합 구하기

delimiter //
create procedure sum_num()
begin
	declare v_num int default 1;
	declare v_sum int default 0;

		repeat
			set v_sum = v_sum + v_num;
			set v_num = v_num + 1;
		until v_num > 10
	end repeat;
		select v_sum;
end //
delimiter ;

call sum_num;
