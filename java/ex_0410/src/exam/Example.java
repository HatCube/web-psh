package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Example {
	public static void main(String[] args) {
		//사용자로부터 여러개의 문자열을 입력받아 List에 저장한다.
		//이후 중복을 제거하고 정렬하여 출력하는 프로그램 작성
		//입력은 exit입력시 종료
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		while(true) {
			System.out.println("문자열 입력(exit 입력시 종료) : ");
			String input = sc.nextLine();
			
			if(input.equalsIgnoreCase("exit")) {
				break;
			}
			list.add(input);
		}
		Set<String> set = new HashSet<>(list);
		List<String> result = new ArrayList<String>(set);
		
		//정렬
		Collections.sort(result);
		
		System.out.println("중복 제거 이후 정렬 결과" + result);
		
		//학생 이름을 입력 받아 List에 저장한다.
		//이미 존재하는 이름이면 추가하지 않고 "이미 존재하는 이름입니다."메시지를 출력
		
		List<String> names = new ArrayList<String>();
		while(true) {
			System.out.println("학생 이름 입력(exit 입력시 종료) : ");
			String name = sc.nextLine();
			
			if(name.equalsIgnoreCase("exit")) {
				System.out.println("입력 종료");
				break;
			}
			if(names.contains(name)) {
				System.out.println("이미 존재하는 이름입니다.");
			}else {
				names.add(name);
			}
		}
		
		System.out.println("학생 명단" + names);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
