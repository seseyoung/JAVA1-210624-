package pk4;

public class AssignTest_01 {

	public static void main(String[] args) {
		
		int aVar=20;
		System.out.println("aVar += 10 : " + (aVar += 10)); // aVar=(aVar)+10; --> aVar=+10;
		System.out.println("aVar -= 10 : " + (aVar -= 10)); // aVar=aVar-10; --> aVar=-10;
		System.out.println("aVar *= 10 : " + (aVar *= 10)); // aVar=aVar*10; --> aVar=*10;
		System.out.println("aVar /= 10 : " + (aVar /= 10)); // aVar=aVar/10; --> aVar=/10; * '='부등호가 무조건 뒤에 와야함.
        System.out.println("aVar %= 10 : " + (aVar %= 10)); // aVar=aVar%10; --> aVar=%10;
        
	}

}
