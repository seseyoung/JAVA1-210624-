package pk5;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class IfExample_04 {

	public static void main(String[] args) {

		int age;
		age=Integer.parseInt(JOptionPane.showInputDialog("나이"));
		int charge;
		
		if(age<9) {
			charge=1000;
			System.out.println("미취학아동입니다.");
		}else if(age<14) {
			charge=2000;
			System.out.println("초등학생입니다.");
		}else if(age<20) {
			charge=3000;
			System.out.println("중고등학생입니다.");
		}else {
			charge=90000;
			System.out.println("성인입니다");
		}System.out.println("요금 : " + charge);
	}

}

