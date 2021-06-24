package pk11;

public class Vegetable extends Object { //여기서 Object가 superclass, 근본은 Object에서 나온 용어
	
	String sort;
	String season; //같은 패키지 안에서 사용가능, public->모든 프로젝트 한 클래스->private 
	String name;

	//기본생성자
	
	public void Set1(String a, String b, String c) {
		sort=a;
		season=b;
		name=c;	
	}
	
	
	//메서드를 활용하여 멤버변수 get
	public void Disp1() {
		System.out.println("분류: " +sort);
		System.out.println("계절: " +season);
		System.out.println("이름: " +name);
	}
	

}
