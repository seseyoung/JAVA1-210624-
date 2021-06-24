package pk12;

public class DriverMain {

	public static void main(String[] args) {
		Driver driver=new Driver();
		
		driver.drive(new Taxi());
		driver.drive(new Bus()); //매개변수에 객체가 들어갈수있음
		
	}

}
