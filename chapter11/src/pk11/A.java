package pk11;

public class A {
	
	protected String field; //(다른 패키지일 경우)protected는 상속에 한해 public과 같은 효과를 발휘한다, 같은 패키지라면 상관없이 모두 사용가능
	
	public A() {
	}
	
	protected void method() {
		System.out.println("A class");
		System.out.println("field");
	}
	
	
	
	
}
