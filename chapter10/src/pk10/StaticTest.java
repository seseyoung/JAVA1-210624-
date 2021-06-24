package pk10;

class StVal{
	int a;
	static int b; //final과 다른점, final은 처음부터 값을 선언해야한다.
}



public class StaticTest {

	
	public static void main(String[] args) {

		StVal obj1=new StVal();
		StVal obj2=new StVal();
		
		obj1.a=10;
		obj1.b=20; 
		
		System.out.println("obj1 a: "+obj1.a);
		System.out.println("obj1 b: "+obj1.b);
		
		obj2.a=100;
		obj2.b=200; //static은 변화되면 다 변함. 고로 obj1.b 역시 200으로 변했다. 주소 고정!
		
		System.out.println("obj2 a: "+obj2.a);
		System.out.println("obj2 b: "+obj2.b);
		System.out.println("obj1 a: "+obj1.a);
		System.out.println("obj1 b: "+obj1.b);
		
		obj2.a=100;
		obj2.b=300;
		
		System.out.println("obj2 a: "+obj2.a);
		System.out.println("obj2 b: "+obj2.b);
		System.out.println("obj1 a: "+obj1.a);
		System.out.println("obj1 b: "+obj1.b);
		
		
	}

}
