package pk7;

public class FunTest_04 {
	//call by value
	
	public static void swap(int x, int y) {  //int으 ㅣ매개변수 2개 꼭!
		
		//swap 알고리즘
		int temp=x;
		x=y;
		y=temp; 
		
		System.out.println("swap() 결과 값 : x = " + x + ","+"y= " + y );
		
	}
	
	
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("swap() 호출 전 : a= " + a + ","+"b= " + b );
		System.out.println("================");
		swap(a,b); 
		System.out.println("================");
		System.out.println("swap() 호출 후 : a= " + a + ","+"b= " + b );
		
		
		//호출 전이나 호출 후나 값이 남아있다, 값은 넘겨 줬지만 결과값을 되받지는 않았기 때문이다. call by value
		
		
	}
	
	FunTest_05 f5=new FunTest_05(5); //new= 메모리 주겠다 // 생성자가 없어도 읽는다. 
	
	

}
