package pk7;

public class MethodMain {

	public static void main(String[] args) {
		//참조하고 싶은 클래스의 메모리 객체(bread) 생성 ( 디폴트 생성자 사용 )
		Method bread = new Method();
		
		bread.makeBread();
		System.out.println("------------");
		bread.makeBread(5, "크림");
		System.out.println("------------");
		bread.makeBread(5);
	}

}
