package pk5;

import javax.swing.JOptionPane;

public class SwitchCase_01 {

	public static void main(String[] args) {

		/*
		int ranking =Integer.parseInt(JOptionPane.showInputDialog("등수"));
		char medalcolor;
		
		switch(ranking) {
		
		case 1:medalcolor='G';
				break;
		
		case 2:medalcolor='S';
				break;
		
		case 3:medalcolor='B';
				break;
		default:
			medalcolor='A'; //브레이크를 걸지 않으면 1에서 끝나지 않고 아래까지 다 읽는다. If문과의 차이점.
			
		}
        System.out.println(ranking + "등 메달은 : " + medalcolor + "입니다");
        */
		int ranking =Integer.parseInt(JOptionPane.showInputDialog("등수"));
		char medalcolor='A'; //초기값을 주고 시작하면 디폴트값을 초기값으로 설정한다. 즉, default를 입력하지 않아도 된다.
		
		switch(ranking) {
		
		case 1:medalcolor='G';
				break;
		
		case 2:medalcolor='S';
				break;
		
		case 3:medalcolor='B';
				break;
		}
        System.out.println(ranking + "등 메달은 : " + medalcolor + "입니다");
	}
        

}
