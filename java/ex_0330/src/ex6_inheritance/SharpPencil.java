package ex6_inheritance;

public class SharpPencil extends Pen {
	
	private int width;
	
	public SharpPencil(int width, int amount) {
		super(amount);
		this.width = width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
}