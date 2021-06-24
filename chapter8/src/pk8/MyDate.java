package pk8;

public class MyDate {

	public int day;
	public int month;
	public int year;
	
	
	
	public static void main(String[] args) {
		
		MyDate my=new MyDate();
		my.day=17;
		my.month=6;
		my.year=2021;
		
		
		
		System.out.println("오늘은 "+ my.year +"년 " + my.month + "월 " + my.day +"일 입니다");
	}
	
	
	
}
