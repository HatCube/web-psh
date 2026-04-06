package ex1_lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

	//어노테이션
	//자바 코드에 붙이는 표식
	//컴파일러에게 "이 코드에는 어떤 의미가 있다"라고 알려주는 정도
@Setter//setter 메서드
@Getter//getter 메서드
@NoArgsConstructor//기본생성자
@AllArgsConstructor//모든필드를 매개변수로 갖는 생성자
public class Member {
	
	private String id;
	private String name;
	private int age;
	
}
