package pk13;

public class CarMain {

	public static void method(Car Car) {
		Car.run();
	}

	public static void main(String[] args) {
		System.out.println("Manual Car");
		method(new ManualCar());
		System.out.println("AI Car");
		method(new AICar());
		
	}

}
