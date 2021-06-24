package pk13;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("지 혼자 갑니다");
	}

	@Override
	public void stop() {
		System.out.println("지 혼자 멈춥니다");
	}

}
