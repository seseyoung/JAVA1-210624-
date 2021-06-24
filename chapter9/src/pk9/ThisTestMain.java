package pk9;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {
		
		ThisTest T=new ThisTest();
		T.Move();
		T.Move();
		T.RAge();
		
		System.out.println("===객체2===");
		//swing으로 입력받기
		ThisTest T1=new ThisTest(Integer.parseInt(JOptionPane.showInputDialog("스피드")),
				Integer.parseInt(JOptionPane.showInputDialog("나이")) ,
				JOptionPane.showInputDialog("로봇이름"),
				JOptionPane.showInputDialog("로봇번호"));

		T1.Move();
		T1.Stop();
		T1.RName();
		T1.RNum();
		T1.RAge();
				
		
	}

}
