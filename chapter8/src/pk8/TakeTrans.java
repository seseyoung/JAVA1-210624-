package pk8;

public class TakeTrans {

	public static void main(String[] args) {
		
		StdInfo studentJames=new StdInfo("James", 5000);
		StdInfo studentTomas=new StdInfo("Tomas",10000);
		StdInfo studentSeyoung=new StdInfo("Seyoung",999999999);
	
		
		Bus bs100=new Bus(100);
		studentJames.takeBus(bs100);
		Bus bs140=new Bus(140);
		
		
		Subway subwayGreen=new Subway("2");
		studentTomas.takeSub(subwayGreen);
		
		studentJames.showInfo();
		studentTomas.showInfo();
		studentSeyoung.takeBus(bs140);
		
		studentSeyoung.showInfo();
				
	}
	
}
