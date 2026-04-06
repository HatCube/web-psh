package ex1_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

	//어노테이션
	//자바 코드에 붙이는 표식
	//컴파일러에게 "이 코드에는 어떤 의미가 있다"라고 알려주는 정도
//@Setter//setter 메서드
//@Getter//getter 메서드
//@NoArgsConstructor//기본생성자
@AllArgsConstructor//모든필드를 매개변수로 갖는 생성자
//@RequiredArgsConstructor//final 또는 @NonNull이 붙은 필드만 매개변수로 갖는 생성자
//@ToString
@Data //getter,setter,hashCode(),equals(),soString()메서드가 자동으로 생성됨
public class Member {
	
	private final String id;
	private String name;
	private int age;
	
}
