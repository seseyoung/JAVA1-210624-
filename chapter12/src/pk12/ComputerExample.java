package pk12;

public class ComputerExample {

	public static void main(String[] args) {
		int r=10;
		
		System.out.println("-----------Computer타입의 Computer객체------------");
		Computer Co = new Computer();
		double A = Co.areaCircle(r);
		System.out.println("원의 넓이: " + A);
		System.out.println("-----------Calculator타입의 computer객체----------");// 업캐스트
		Calculator ca1 = new Computer();
		double B = ca1.areaCircle(r);
		System.out.println("원의 넓이: " + B);
		System.out.println("-----------Calculator타입의 Calculator객체--------");
		Calculator ca2 = new Calculator();
		double C = ca2.areaCircle(r);
		System.out.println("원의 넓이: " + C);

	}

}
