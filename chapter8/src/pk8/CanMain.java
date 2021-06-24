package pk8;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		
		Scanner S=new Scanner(System.in);
	
		Vending V=new Vending();
		V.init(); //음료수 세팅 완료
		
		System.out.print("돈을 투입하세요: ");
		V.showCans(S.nextInt());
		
		System.out.print("음료수를 선택하세요 : ");
		V.outCan(S.next());
		
	}

}
