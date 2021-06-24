package pk11;

public class B {
	//같은 패키지안이므로 그냥 객체 생성하여 참조
	public void method() {
		A a = new A(); //생성자가 디폴트생성자라 , 다른 패키지에서 끌어오지 못한다.
		a.field="value";
		a.method();
	}
		
	public static void main(String[] args) {
		B b=new B();
		b.method();
}
}
