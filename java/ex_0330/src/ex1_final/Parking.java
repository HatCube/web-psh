package ex1_final;

public class Parking {
	//기본요금 10000원 (상수)
	//추가요금 시간당 2000(상수)
	
	//요금계산 메서드
	static final int normal = 10000;
	static final int time_Fee = 2000;
	
	public int CalculateFee(int time) {
		return normal + (time * time_Fee);
	}
}
