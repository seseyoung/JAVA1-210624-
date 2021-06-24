package pk11;

//라이브러리 , 다른 패키지에 있는 클래스를 참조한다는 뜻
public class C {

	public void method() {
		A a=new A();
		a.field="value";
		a.method();
	}
	
	
	
	public static void main(String[] args) {
		C c=new C();
		
		
		
	}

}
