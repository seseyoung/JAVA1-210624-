package pk11;

public class Paprika extends Vegetable { //여기서는 vegetable 이 superclass
	
	private String color;
	private int price;
	private String name;
	
	public void Set3(String a, int b, String c) {
		color=a;
		price=b;
		name=c;
	}
	
	public void Disp2() {
		System.out.println("------------Paprika------------");
		System.out.println("분류 : " + sort);
		System.out.println("계절 : " + season);
		//super --> 기본 생성자를 통한 객체 생성과 똑같다.
		System.out.println("크기 : " + super.name);
		System.out.println();
		System.out.println("------------Paprika------------");
	}
	
	
	
	//get Disp3
	public void Disp3() {
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("크기 : " + name);
	}

}
