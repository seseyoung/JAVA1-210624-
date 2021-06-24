package pk5;

import javax.swing.JOptionPane;

public class SwitchCase_02 {

	public static void main(String[] args) {
	
		
		//1: 예금 조회 2: 출금 3: 입금 4: 이체 그외: 잘못...
		int Num;
		Num=Integer.parseInt(JOptionPane.showInputDialog("번호입력(1~4)"));
		
	    switch(Num) {
	    
	    case 1:
	    	System.out.println("예금조회를 선택하셨습니다.");
	    	break;
	    case 2:
	    	System.out.println("예금출금을 선택하셨습니다.");
	    	break;
	    case 3:
	    	System.out.println("예금입금을 선택하셨습니다.");
	    	break;
	    case 4:
	    	System.out.println("예금이체를 선택하셨습니다.");
	    	break;
	    default :
	    	System.out.println("잘못 입력하셨습니다.");
	    
		}//switch문 종료 
	}//main 종료
}//class 종료
