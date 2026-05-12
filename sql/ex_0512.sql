-- 프로시저 이름 : evem_sum
-- 입력받은 두 숫자 사이의 짝수만 더하여 결과 출력하기
-- 시작값과 끝값은 In 매개변수로 받는다.
-- while 사용
-- 짝수만 누적
-- 결과는 select로 출력
delimiter //
create procedure even_sum(
in first_insert int ,
in last_insert int
)
 begin
 	
 end //
 delimiter ;
 
 -- 회원등급 자동 변경
CREATE TABLE customer (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(50),
    total_amount INT,
    grade VARCHAR(20)
);
INSERT INTO customer VALUES
(1, '김철수', 120000, NULL),
(2, '이영희', 80000, NULL),
(3, '박민수', 300000, NULL);

-- 모든 회원을 반복 조회하면서 등급 갱신하기
-- 조건
-- 구매금액      등급
-- 20만원 이상      VIP
-- 10만원 이상      GOLD
-- 나머지         SILVER

-- 주문 금액 누적 시 배송시 계산
CREATE TABLE cart (
    cart_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    price INT
);
INSERT INTO cart VALUES
(1, '마우스', 30000),
(2, '키보드', 50000),
(3, '모니터', 200000);

-- 장바구니 금액을 누적하면서 배송비를 계산하시오
-- 누적금액 100,000원 이상 → 배송비 0원
-- 미만 → 배송비 3000원
-- 상품을 하나씩 읽으며 누적
-- SELECT를 이용하여 조회하기

delimiter //
create procedure calcaulte_cart_total()
begin
   declare v_id int default 1; -- 시작값
   declare v_max_id int; -- 종료값
   declare v_price int; -- 가격을 담을 변수
   declare v_total int default 0; -- 총합을 담을 변수
   declare v_delivery_fee int; -- 배송비를 담을 변수
   
   -- 가장 마지막 id찾기
   select max(cart_id)
   into v_max_id
   from cart;
   
   while v_id <= v_max_id do
      select price
      into v_price
      from cart
      where cart_id = v_id;
   
      -- 가격이 null이 아니라면
      if v_price is not null then
         -- v_total에 누적
         set v_total = v_total + v_price;
      
         if v_total >= 100000 then
            set v_delivery_fee = 0;
         else
            set v_delivery_fee = 3000;
         end if;
         
         select 
            v_total as current_total,
            v_delivery_fee as delivery_fee;
      end if;
         
      set v_id = v_id + 1;
   end while;
end //
delimiter ;

create table member(
member_id int primary key,
member_name varchar(50) not null
);

delimiter //
create procedure insert_member()
begin
	declare continue handler for 1062
	begin 
		select '이미 존재하는 회원 ID입니다.' as message;
	end;

	insert into member(member_id,member_name)
	values(1,'홍길동');
	
	insert into member(member_id,member_name)
	values(1,'김철수');

	select '프로시저가 끝까지 실행되었습니다.' as result;
end //
delimiter ;

call insert_member();
-- 두번째 insert에서 기본키 중복에러가 발생하지만, continue handler가 처리했기 때문에 프로시저가 끝까지 실행된다.

delimiter //
create procedure insert_member_exit()
begin
	declare exit handler for 1062
	begin 
		select '중복 오류가 발생해 프로시저를 종료합니다.' as message;
	end;

	insert into member(member_id,member_name)
	values(1,'홍길동');
	
	insert into member(member_id,member_name)
	values(1,'김철수');

	select '이 문장은 실행되지 않습니다.' as result;
end //
delimiter ;

call insert_member_exit();

-- select into 결과가 없을때 처리하기
-- select ... into는 조회결과를 변수에 넣을때 사용한다.
-- 조회결과가 없으면 not found 상황이 발생할 수 있다,

-- 프로시저 명 : find_product
-- 매개변수 : in p_id int
-- id를 통해 상품의 이름과 가격을 조회
-- 조회되는게 없으면 '해당상품이 없습니다.'라고 조회하기

delimiter //
create procedure find_product(in p_id int)
begin
	declare v_name varchar(50);
	declare v_price int;
	
	
	declare continue handler for not found
	begin
		select '해당 상품이 없습니다.' as message;
	end;
	
	select product_name,price
	into v_name,v_price
	from product
	where product_id = p_id;
	
	select v_name as product_name,v_price as price;
end //
delimiter ;

call find_product(1);
call find_product(999);