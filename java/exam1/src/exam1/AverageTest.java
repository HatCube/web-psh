package exam1;

public class AverageTest {
	   public static void main(String[] args) {
	       double[] scores = {80.0, 90.0, 75.0, 100.0};
	       double sum = 0;

	       // 오류 발생 지점 [A]
	       for (int i = 0; i < scores.length; i++) {
	           sum += scores[i];
	       }

	       // 오류 발생 지점 [B]
	       double average = sum / scores.length;

	       System.out.println("평균 점수: " + average);
	   }
	}