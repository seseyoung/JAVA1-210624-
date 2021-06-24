package pk7;

public class TryCatchThrows {

	public static void fun() throws Exception{
		try {
			System.out.println("fun()메서드");
			throw new Exception();
		} catch (RuntimeException e) { //실행중에 발생되는 에러
			System.out.println("예외발생");
		}finally {//finally = try catch문과 상관없이 무조건 실행된다. 에러를 잡지 못하더라도
			System.out.println("finally 문장");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		//fun();
		    try {
				fun();
			} catch (Exception e) {
				System.out.println("main()의 catch문 문장");
			}
		//데이터베이스 연동할때 많이 쓴다. 통신에 문제가 있다~ 서버에 문제가 있다~
	}//main

}//class
