package ex1_map.exam;

import java.util.HashMap;
import java.util.Map;

public class MaxFinder {
	public static void main(String[] args) {
		int [] arr = {1,3,2,3,4,3,2,2,2};
		
		//숫자별 등장횟수를 HashMap<Integer, Integer>로 센다.
		//가장 큰 빈도수를 가진 숫자를 찾는다.
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int a : arr) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else {
				map.put(a, 1);
			}
		}
		int maxCount = 0;
		int result = 0;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				result = entry.getKey();
			}
		}
		
		System.out.println("가장 많이 나온 값 : " + result);
		System.out.println("등장 횟수 : " + maxCount);
		
		
		
		
		
		
	}
}
