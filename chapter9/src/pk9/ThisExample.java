package pk9;

public class ThisExample {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year=year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	

	public static void main(String[] args) {
		
		ThisExample bDay=new ThisExample();
		bDay.setYear(2001);
		System.out.println(bDay.year);
		System.out.println("-------------------------------");
		System.out.println(bDay);
		System.out.println("-------------------------------");
		bDay.printThis();
		
	}

}
