package ex1_innerclassInterfaceexample;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		//내부 인터페이스 구현
		class OkListener implements Button.ClickListener{
			//추상메서드 오버라이딩
			@Override
			public void onClick() {
				System.out.println("ok 버튼 클릭");
				
			}
			
		}
		btn.setClickListener(new OkListener());
		
		//ok 버튼 클릭하기
		btn.Click();
		
		//cancel 버튼 & 기능 만들기
		
		Button btn2 = new Button();
		
		class CancelListener implements Button.ClickListener{
			//추상메서드 오버라이딩
			@Override
			public void onClick() {
				System.out.println("cancel 버튼 클릭");
				
			}
			
		}
		btn2.setClickListener(new CancelListener());
		
		//cancel 버튼 클릭하기
		btn2.Click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
