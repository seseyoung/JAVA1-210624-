package pk7;

public class FunTest_02 {

	public static void main(String[] args) {

		
		
		int num1=10;
		int num2=20;
		
		int sum=addNum(num1, num2); //메소드 호출!! //매개변수 = args , int형 2개에 대한 조건만 충족하면 됩니다.
		System.out.println(sum);
	}
	
	public static int addNum(int n1, int n2) {
		int result = n1+n2;
		return result; //불렀던곳(호출한곳)에 다시 준다! 
		
		//void로 선언 되어있으면 return값이 필요없고 자체적으로 sysou로 결과값을 뿌린다. 
		
	
		
		
	}
	
}
