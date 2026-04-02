package ex1_innerclass.hiddenclass;

public class ButtonExample {
	public static void main(String[] args) {
		
		Button btnOk = new Button();
		Button btnCancle = new Button();
		
		// setter 호출하기
		btnOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("확인버튼을 누른다.");
			}
		});
		btnOk.click();
		
		btnCancle.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("취소버튼을 누른다.");
			}
		});
		btnCancle.click();
		
	}
}
