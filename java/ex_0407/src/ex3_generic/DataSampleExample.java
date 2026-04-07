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
			
			//저장 데이터 타입이 Object이므로 어떤 타입의 데이터라도
			//저장할 수 있지만 데이터를 사용할 때는 타입 변환을 위한
			//검사를 해야 하는 번거로움이 있다.
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
