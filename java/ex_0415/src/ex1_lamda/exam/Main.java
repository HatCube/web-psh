package ex1_lamda.exam;

import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer();
		excutePrint(printer::print, "람다식 전달 연습");
	}
	
	
	public static void excutePrint(Consumer<String> action,String message) {
		action.accept(message);
	}
}