package pk4;

public class BitTest_03 {

	public static void main(String[] args) {

		int num=0B00000101; //5
		
		System.out.println(num);
		
		//20이 되도록 왼쪽 쉬프트연산을 하시오
		
		int result;
		
		result=num<<2;
		System.out.println(result);
		//1이 되도록 오른쪽 쉬프트연산
		result=num>>2;
		System.out.println(result);
		System.out.println("-------------");
		
		
	}

}
