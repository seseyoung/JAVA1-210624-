package pk8;

public class Bus {

	//멤버변수
	int busNumber; //버스번호
	int passengerCount; //승객 수
	int money; //버스의 수입 
	
	//생성자를 overloading(버스번호를 매개변수로 받아서 this로 옮길것)
	public Bus (int busNumber) {
		this.busNumber=busNumber;
	}
	
	
	//메소드
	public void take(int money) { //승객이 낸 돈을 받음
			this.money+=money;
			passengerCount++;
	}
		
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 "+passengerCount+"명이고, 버스의 수입은 "+money+"입니다.");
	}
	
}
