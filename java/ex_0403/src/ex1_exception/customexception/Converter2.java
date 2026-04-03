package ex1_exception.customexception;

public class Converter2 {
	
	//Integer.parseInt(문자열);
	public int toInt(String x) throws NumberFormatException{
		return Integer.parseInt(x);
	}
}
