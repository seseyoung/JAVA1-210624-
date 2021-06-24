package pk13;

public abstract class Phone {
	
	//아무것도 추상메소드가 없기때문에 디폴트 생성자를 추상으로 간주
	
	public String owner;
	
	public Phone(String owner) {
		this.owner=owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	
	public void turnoff() {
		System.out.println("폰 전원을 끕니다");
	}
}
