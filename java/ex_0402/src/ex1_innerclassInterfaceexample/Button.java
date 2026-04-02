package ex1_innerclassInterfaceexample;

public class Button {
	
	//static 붙히지 않아도 자동으로 static 처리
	//중첩 interface는 무조건 static이다(암묵적 static)
	public static interface ClickListener{
		
		void onClick();//추상 메서드
	}
	
	//필드
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	//버튼이 클릭 되었을때 실행할 메서드로 click()메서드 추가하기
	//실행 내용은 ClickListener 인터페이스 필드를 사용해서 onClick() 추상 메서드 호출하기
	
	public void Click() {
		clickListener.onClick();
	}
	
	
	
	
	
}
