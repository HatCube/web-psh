package ex6_date;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		//Date클래스의 문제점을 해결하려고 만든 클래스
		//Calendar클래스는 달력을 표현하는 추상클래스
		//날짜와 시간을 계산하는 방법이 지역과 문화에 따라 다르기 때문에
		//특정 역법에 따르는 달력은 자식 클래스에서 구현하도록 되어있다.
		
		//특정한 역법을 사용하는 경우가 아니라면 직접 하위 클래스를 만들 필요는 없고
		//Calendar 클래스의 정적 메서드인 getInstance()메서드를 사용하면
		//컴퓨터에 설정되어 있는 시간대를 기준으로 객체를 얻을 수 있다.
	}
}
