package ex1_abstract;

public class AirPlane extends Transport{
	
	int airportFee;
	int fuelCharge;
	
	//총 요금 : 기본요금 + 공항이용료 + 유류할증비
	public AirPlane(String name, int baseFare,int airportFee, int fuelCharge) {
		super(name,baseFare);
		this.airportFee = airportFee;
		this.fuelCharge = fuelCharge;
	}
	
	@Override
	int calculateFare() {
		return baseFare + airportFee + fuelCharge;
	}
	
}
