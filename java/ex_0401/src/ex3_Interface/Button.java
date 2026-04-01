package ex3_Interface;

//물리적 버튼
public class Button {
ClickListener listener;
	
	public void setListener(ClickListener listener) {
		this.listener = listener;
	}
	
	public void Click() {
		listener.onClick();
	}
}
