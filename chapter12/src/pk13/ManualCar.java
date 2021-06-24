package pk13;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("정해진대로 움직입니다");
	}

	@Override
	public void stop() {
		System.out.println("정해진대로 멈춥니다");
	}

}
