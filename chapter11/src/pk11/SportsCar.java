package pk11;

public class SportsCar extends Car{

	@Override
	public void speedUP() {
		speed+=10;
		System.out.println("현재 speed: " +speed);
	}

	/* 파이널 처리된 것은 오버라이딩이 불가능하다.
	 * public void stop() { }
	 */
	public static void main(String[] args) {
		
		SportsCar ac=new SportsCar();
		ac.speedUP();
		ac.stop();
		
		
	}

}
