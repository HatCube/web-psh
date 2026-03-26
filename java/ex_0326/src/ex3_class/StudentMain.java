package ex3_class;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		
		Student st = new Student();
		System.out.println("학생의 이름 : " + st.name);
		System.out.println("학생의 나이 : " + st.age);
		System.out.println("학생의 점수 : " + st.score + "P");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("저장할 학생 수 : ");
		int n = sc.nextInt();
		
		String[][] str = new String[n][3];
		
		for(int i = 0 ; i < str.length ; i++) {
			System.out.println("이름 : ");
			str[i][0] = sc.next();
			System.out.println("나이 : ");
			str[i][1] = sc.next();
			System.out.println("점수 : ");
			str[i][2] = sc.next();
			System.out.println("------------------");
		}
		System.out.println(str.length + "명 등록 완료");
		for (int i = 0; i <str.length ; i++) {
			for (int j = 0; j <str[i].length;j++ ) {
				System.out.println(str[i][j] + " ");
			}
		}System.out.println("------------------");
	}
}