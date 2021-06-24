package pk7;

public class FunTest_05 {
//call by reference
	int value; //멤버 변수, 전역 변수  a=10 b=20을 기억하고 있음 
	
	//오버로딩된 생성자는 디폴트 생성자가 반드시 명시 되어야 한다.
	public FunTest_05() {} //디폴트 생성자라서 쓰지 않아도 기본적으로 생성되있다.
	
	//생성자 : 클래스의 초기화
	//this=현재class에 있는
	FunTest_05(int value) {
		this.value=value;
	}//생성자를 직접 써주면 기본생성자를 무시하고 이 생성자를 쓴다
	
	
	public static void swap(FunTest_05 x, FunTest_05 y) {  //객체가 들어와야한다!
		
		int temp=x.value; 
		x.value=y.value;
		y.value=temp; 
		
		System.out.println("swap() 결과 값 : x = " + x.value + ","+"y= " + y.value );
	}
	
	public static void main(String[] args) {
		
		FunTest_05 a = new FunTest_05(10);
		System.out.println(a);
		FunTest_05 b = new FunTest_05(20);
		System.out.println(b);
		System.out.println("========================");
		
		System.out.println("swap() 호출 전 : a= " + a.value + ","+"b= " + b.value );
		System.out.println("================");
		//객체로 접근하여 호출 
		swap(a,b); 
		System.out.println("================");
		//heap메모리 참조후 값이므로 바뀜
		System.out.println("swap() 호출 후 : a= " + a.value + ","+"b= " + b.value );
	} //값이 아니라 메모리 주소를 올렸기 떄문에 값이 같이 바뀐다!

}
