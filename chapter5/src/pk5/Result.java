package pk5;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {

		//로그인 
		Scanner scan=new Scanner(System.in);
		
		System.out.print("아이디 : "); 
		String ID = scan.nextLine(); //smile
		
		System.out.print("비밀번호 : "); //12345
		String PW=scan.nextLine(); //클래스 선언으로 변수방을 설정받으면 인스턴트변수방이 된다. 클래스 내용을 담을 수 있음.
		
		//비번 형변환(string->int)
		int pass=Integer.parseInt(PW);
		
		if(ID.equals("smile")) {
			if(pass == 12345 ) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패 : 비밀번호가 다릅니다.");
			}
		}else {
			System.out.println("로그인 실패: 존재하지 않는 아이디 입니다");
		}
		
		
	}
		
		
		
}


