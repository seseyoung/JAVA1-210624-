package pk8;

public class DmbcellPhone extends CellPhone{ //CellPhone class의 정보를 모두 복사해서 왔다.
	
	//필드
	int channel;
	
	//생성자
	public DmbcellPhone(String model, String color, int channl) {
		this.model=model; //CellPhone에 저장되어 있기 때문에, 여기서 따로 model을 선언하지 않아도 쓸 수 있다.
		this.color=color;
		this.channel=channl;
		
	}

	//메서드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannl(int channl) {
		System.out.println("채널을" + channel + "번 으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
}
