package pk12;

public class Computer extends Calculator{
	
	double areaCircle(double r) {
		System.out.println("Computer객체의 areaCircle() 실행됨");
		System.out.println("넓이 계산에 쓰인 PI값: "+Math.PI);
		return Math.PI*r*r;
	}
}
