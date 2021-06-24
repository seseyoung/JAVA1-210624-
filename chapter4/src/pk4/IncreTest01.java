package pk4;

public class IncreTest01 {

	public static void main(String[] args) {

		int a,b,c;
		
		a=10;
		b=20;
		c=3;
		
		  System.out.println("++a : " + (++a)); //a=a+1 a+=1, 전위계산
		  System.out.println("a++ : " + (a++)); //후위계산 System.out.println("후위계산 : " a); 
		  System.out.println("=========="); 
		  System.out.println("c++ : " + (c++));
		  System.out.println("후위계산 : " + c);
		  System.out.println("==========");
		 
        //a전위계산 + b 후위계산의 결과값
		
		//#1 첫번째 방법
		/*
		 * System.out.println("++a + b++ 값 : " + (++a+b++));
		 * System.out.println("후위계산 : " + b);
		 */
		//#2 두번째 방법
		/*
		 * System.out.println("++a : " + (++a)); System.out.println("b++ : " + (b++));
		 * System.out.println("++a + b++ : " + (a+b));
		 */
		
	}

}
