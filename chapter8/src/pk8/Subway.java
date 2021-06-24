package pk8;

public class Subway {

	public String SubwayLineNumber;
	int passengerCount; // 승객 수
	int money; // 지하철 수입

	public Subway(String SubwayLineNumber) {
		this.SubwayLineNumber = SubwayLineNumber;
	}

	public void take(int money) { //승객탑승
		this.money += money; //수금
		passengerCount++; //승객수증가
	}

	public void showInfo() {
		System.out.println("지하철 " + SubwayLineNumber + "호선의 승객은 " + passengerCount + "명이고, 지하철의 수입은 " + money + "입니다.");
	}

}
