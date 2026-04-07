package ex3_generic;

public class DataSampleExample {
	public static void main(String[] args) {
		//데이터 리스트 객체 만들기
		
		DataList list = new DataList();
		
		list.add(10);
		list.add("문자열");
		list.add(3.14);
		
		//배열에 들어있는 내용 출력
		for(int i = 0; i < list.size(); i++) {
			Object data = list.get(i);
			if(data instanceof Integer) {
				System.out.println("정수 : " + (int)data);
			}else if (data instanceof Double) {
				System.out.println("실수 : " + (Double)data);
			}else if (data instanceof String) {
				System.out.println("문자열 : " + (String)data);
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
