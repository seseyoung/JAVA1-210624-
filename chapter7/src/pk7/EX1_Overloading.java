package pk7;

public class EX1_Overloading {

	//필드==멤버변수
	
	//생성자 생략(디폴트 생성자)
	
	//메소드 구현
	//메서드 중복허용=Overloading을 한다 = class에 동일한 이름의 메서드가 존재 한다. 
	//Overloading(다형성) = 굳이 쓰는 이유는? 유지보수 관리의 효율성을 극대화 하기 위해 
	
	public void getResult(int n) {
		System.out.println(n + "은(는) int입니다.");
	}
	public void getResult(char n) {
		System.out.println(n + "은(는) char입니다.");
	}
	public void getResult(String n) {
		System.out.println(n + "은(는) String입니다.");
	}
	public void getResult(int n,String str) {
		System.out.println(n + "은(는) int, " + str + "은(는) String입니다.");
	}
	
}
