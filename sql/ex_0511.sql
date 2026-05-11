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

-- 상품 ID로 상품 조회하기
-- 이름 : get_product_by_id
-- 상품 id를 전달받아서 해당 상품 정보를 조회하세요

delimiter //
create procedure get_product_by_id(in p_id int)
begin
	select * 
	from product
	where product_id = p_id;
end //
delimiter ;

-- 카테고리별 상품 조회하기
-- 이름 : get_products_by_category
-- 카테고리명을 입력받는다.
-- 해당 카테고리의 상품만 조회한다.
-- 가격이 낮은 순으로 정렬한다.



-- 상품 재고를 반환받기
-- 이름 : get_product_stock
-- 상품 ID를 입력받는다.
-- 해당 상품의 재고를 OUT 매개변수로 반환한다.
-- 호출 후 세션 변수로 결과를 확인한다.

-- 상품 가격 수정하기
-- 이름 : update_product_price
-- 상품 : 상품 id와 변경할 가격을 입력받는다.
-- 해당 상품의 가격을 수정한다.
-- 수정된 행이 있으면 '가격이 수정되었습니다' 출력
-- 수정된 행이 없으며 '해당 상품이 없습니다' 출력
-- ROW_COUNT() : 변경된 행의 개수 

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