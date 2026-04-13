package ex1_map.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAvg {
	public static void main(String[] args) {
		//이름을 key 점수를 value로 저장한다
		//평균 최고점 학생을 찾는다.
		
		//평균점수 : XX점
		//최고학생 / 점수 : xxx / 00점
		

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김학생", 85);
		map.put("이학생", 92);
		map.put("박학생", 78);
		map.put("최학생", 95);
		
		int sum = 0;
		int maxScore = -1;
		String topStudent = "";
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			int score = entry.getValue();
			sum += score;
			if (score > maxScore) {
				maxScore = score;
				topStudent = entry.getKey();
			}
		}
		double avg = (double)sum / map.size();
		
		System.out.println("평균 점수 : " + avg);
		System.out.println("최고 점수 학생 : " + topStudent + "/" + maxScore);
	}
}
