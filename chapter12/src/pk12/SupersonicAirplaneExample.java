package pk12;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeoff();
		sa.flying();
		sa.flyMode=SupersonicAirplane.SUPERSONIC;
		sa.flying();
		sa.flyMode=SupersonicAirplane.NORMAL;
		sa.flying();
		sa.land();
		
		
	}

}
