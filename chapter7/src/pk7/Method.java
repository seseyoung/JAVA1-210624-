package pk7;

public class Method {

	
	//필드생략=멤버변수
	
	//생성자 생략(기본생성자 사용하겠다)
	
	void makeBread() {
		System.out.println("빵빵");
	}//method1
	
	void makeBread(int count) {
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+ "번째 빵을 만들었습니다.");
		}
		System.out.println();
		System.out.println("요청하신 " + count + "개의 빵이 모두 만들어졌습니다.");
	}//method2
	
	void makeBread(int count, String name) {
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+ "번째" + name +"빵을 만들었습니다.");
		}
		System.out.println();
		System.out.println("요청하신 " + count + "개의 " +name+ "빵이 모두 만들어졌습니다.");
	}//method3
	
	
	
}//class
