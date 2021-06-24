package pk13;

public abstract class Car {

	public abstract void drive(); //각각의 차 스타일에 맞춰서 알아서 써라~!
	public abstract void stop(); 
	public void clear() {}; //필수는 아님 -> 추가 구현시 많이 사용됨
	
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	
	//template : 변경 불가능한 프로젝트의 틀
	final public void run() {
		startCar();
		drive();
		clear();
		stop();
		turnOff();
	}
	
	
	
	
}