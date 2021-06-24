package pk4;

public class LogicTest_01 {

	public static void main(String[] args) {

		char a,b;
		boolean c;
		a='A'; //65
		b='B'; //66
		
		c=true || true && false;
		//c=true || false
		System.out.println(c);
		
		c= a<b && (a==b);
		System.out.println(c);
		
		c= a<b || (a==b);
		System.out.println(c);
		
		
	}

}
