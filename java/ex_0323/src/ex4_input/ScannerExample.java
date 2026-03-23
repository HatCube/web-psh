package ex4_input;

//java.util 패키지에 있는 Scanner 클래스
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		//클래스에 정의되어 있는 기능을 사용하려면
		//클래스를 객체로 만드는 작업을 해야한다.
		//객체의 생성 : new 클래스명();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(sc);
		
		String name,adress;
		int age;
		double height;
		
		System.out.println("이름 : ");
		name = sc.next();
		
		//객체를 통해 클래스 안에 정의된 기능을 호출
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.println("주소 : ");
		adress = sc.next();
		
		System.out.println("신장 : ");
		height = sc.nextDouble();
		
		System.out.printf("당신의 이름은 %s세 입니다.\n",name);
		System.out.printf("당신의 나이는 %d세 입니다.\n",age);
		System.out.printf("당신의 주소는 %s 입니다.\n",adress);
		System.out.printf("당신의 신장은 %.1fcm 입니다.\n",height);
		
		
		
		
		
		
	}
}
