package pk4;

public class BitTest_01 {

	public static void main(String[] args) {
//Bit연산
		int num1=5;
		int num2=10;
		//Bit OR 연산
		int result= num1 | num2;
		System.out.println(result);
		
		
		//Bit AND
		result= num1 & num2;
		System.out.println(result);
		
		//Bit XOR //Exclusive Or
		result= num1 ^ num2;
		System.out.println(result);
		
		//Bit NOT(~) //틸드
		System.out.println(~num2+1); //0의 존재때문에 +1해줘야 함
		
		
		
		
		
	}

}
