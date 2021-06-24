package pk13;

public abstract class Computer {

	//구현부가 생략된게 추상클래스, 하나이상의 추상메서드가 들어있으면 클래스도 추상클래스로 선언해줘야한ㄷㅏ!!
	public abstract void display();
	public abstract void typing();
	
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnoff() {
		System.out.println("전원을 끕니다");
	}
	
	
	
	
}
