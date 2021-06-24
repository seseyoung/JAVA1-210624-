package pk4;

public class LogicTest_02 {

	public static void main(String[] args) {

		int num1=10;
		int num2=20;
		
		//&& t
		boolean flag=(num1>0) && (num2>0);
		System.out.println(flag);
		//&& f
		flag=(num1<0) && (num2>0);
		System.out.println(flag);
		// || t
		flag=(num1>0) || (num2>0);
		System.out.println(flag);
		// || f
		flag=(num1<0) || (num2<0); //같지 않으면 :  T  같으면 : F (질문이 같지 않냐로 물어봄)
		System.out.println(flag);
		// != f
		flag=(num1>0 != num2>0);
		System.out.println(flag);
		flag=!(num1>0); //관계연산 회로의 반대로 나옴 
		
		
		
	}

}
