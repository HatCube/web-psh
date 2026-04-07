package ex3_generic;

import java.util.Scanner;

public class DataList {
	
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	//생성자
	//default 사이즈 만큼의 배열을 생성하는 생성자 만들기
	public DataList() {
		data = new Object[defaultSize];
	}
	//size값을 전달 받아서 size 크기만큼의 길이를 받는 배열을 만드는 생성자 만들기
	public DataList(int size) {
		data = new Object[size];
		}
	//값을 받아서 배열에 순차적으로 넣는 add 메서드
	public void add(Object value) {
		data[size++] = value;
	}
	//인덱스를 받아서 배열의 값을 반환하는 get 메서드
	public Object get(int index) {
		return data[index];
	}
	//배열에 데이터가 몇개 들어가있는지 확인하는 size()메서드
	public int size() {
		return size;
	}
	
	
	
	
	
	
}
