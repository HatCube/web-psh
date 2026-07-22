CREATE TABLE users(
	id BIGINT auto_increment PRIMARY KEY,
	name varchar(50) NOT NULL,
	email varchar(100) NOT null
);

INSERT INTO users(NAME,EMAIL) VALUES('홍길동','hong@test.com');
INSERT INTO users(NAME,EMAIL) VALUES('김철수','kim@test.com');
INSERT INTO users(NAME,EMAIL) VALUES('이영희','lee@test.com');