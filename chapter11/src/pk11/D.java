package pk11;

public class D extends A {
	
	
	public D() {
		super(); //부모 생성자 생성 -> 메모리 상속자꺼씀(절약,중복성회피)
		//A a=new A();
		this.field="value"; //여기서 this는 super
		this.method();
	}

	public static void main(String[] args) {
		D d= new D();
		d.method();
	}

}
