package pk5;

import javax.swing.JOptionPane;

public class IfExample_07 {

	public static void main(String[] args) {

		int Num1, Num2;
		
		Num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		Num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		//Num1이 Num2보다 크면 Num1이 더 큽니다 
		//Num2가 Num1보다 크면 Num2가 더 큽니다.
		
		if(Num1>Num2) {
			System.out.println("Num1이 Num2보다 더 큽니다");
		}else if(Num2>Num1) {
			System.out.println("Num2가 Num1보다 더 큽니다");
		}else {
			System.out.println("Num1과 Num2이 같습니다");
		}
		
	}

}

