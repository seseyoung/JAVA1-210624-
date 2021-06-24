package pk10;

import javax.swing.JOptionPane;

public class FinalTest {

	private static final int MAX=3; //상수는 일반 변수랑 구분하기 위해 보통 대문자 처리를 한다.
	
	public static void main(String[] args) {
		int num;
		for(int i=0; i<MAX; i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("값입력"));
			if(num>MAX) 
				System.out.println("입력값이 3보다 큽니다;");
			else
				System.out.println("입력값이 3보다 크지 않습디다.");
		}
		
	}

}
