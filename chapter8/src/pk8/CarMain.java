package pk8;

public class CarMain {

	public static void main(String[] args) {
		
		Car C= new Car();
		
		System.out.println("제작회사: " + C.company);
		System.out.println("모델명 : " + C.model);
		System.out.println("색깔 : " + C.color);
		System.out.println("최대속도 " + C.maxSpeed);
		System.out.println("현재 속도 : " + C.speed);
		System.out.println("==속도 변경 후==");
		C.speed=60;
		System.out.println("수정된 속도 : " + C.speed);
		
	}

}
