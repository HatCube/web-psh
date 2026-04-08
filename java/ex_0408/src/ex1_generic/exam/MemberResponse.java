package ex1_generic.exam;

public class MemberResponse<T> {
	boolean success;
	String message;
	T data;
	
	public boolean isSuccess(boolean b) {
		this.success = b;
		return success;
	}
	
	public void getMessage(String message) {
		this.message = message;
	}
	
	public T getData() {
		return data;
	}
	
	
}
