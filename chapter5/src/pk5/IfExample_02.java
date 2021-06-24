package pk5;

import javax.swing.JOptionPane;

public class IfExample_02 {

	public static void main(String[] args) {

		int dat;
		
		dat = Integer.parseInt(JOptionPane.showInputDialog("값입력:")); //입력 대화상자 호출
		
		if(dat % 10 ==0) { //10의 배수 판별법
			System.out.println(dat + ":" + "10의 배수");
		}else {
			System.out.println(dat + ":" + "10의 배수 아님");
		}
		
		
	}

}
