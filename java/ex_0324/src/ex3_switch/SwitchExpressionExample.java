package ex3_switch;

public class SwitchExpressionExample {

	public static void main(String[] args) {
		//break를 빼먹으면 fall-through가 발생
		//값을 변수에 넣으면 중복 코드가 많아짐
		//여러 case 를 묶기가 불편하다.
		
		int num = 2;
//		String result;
//		switch(num) {
//		case 1:
//			result = "A";
//			break;
//		case 2:
//			result = "B";
//			
//		case 3:
//			result = "C";
//		default:
//			result = "F";
//			break;
//		}
//		
		String result = switch(num) {
			case 1 -> "A";
			case 2 -> "B";
			case 3 -> "C";
			default -> "F";
		
		};
		
		
		
		
//		int day = 3;
//		String type;
//		switch(day) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//			type = "평일";
//			break;
//		case 6:
//		case 7:
//			type = "주말";
//			break;
//		}
		int day = 2;
		
		String type = switch(day) {
		case 1,2,3,4,5 -> "평일";
		case 6,7 -> "주말";
		default -> "잘못된 값";
		};
		// 화샇표 오른쪽에 여러줄의 로직이 필요하다면 {}를 써야한다
		//이때 최종적으로 반환할 값을 명시하려면 yield 키워드를 사용한다.
		result = switch(num) {
		case 1 -> "하나";
		case 2 ->{
			System.out.println("2가 입력됨");
			yield "둘";
			}
			default -> "기타";
		};
		
		
		//정수형 변수를 하나 만들고 해당 달이 몇일까지 있는지 switch문을 이용하여 작성
		//1 > 31
		//2 > 28
		//4 > 30
		
		int month = 4;
		switch (month) {
		case 1:
			System.out.println("1월은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println("2월은 28일까지 있습니다.");
			break;
		case 4:
			System.out.println("4월은 30일까지 있습니다.");
			break;
		default:
			System.out.println("잘못된 달 입력입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
