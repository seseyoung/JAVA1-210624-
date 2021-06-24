package pk7;

import javax.swing.JOptionPane;

public class FunTest_01 {

	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	//한 번만 구현해 놓으면 언제든 쓸 수 있다.
	
	public static void main(String[] args) {
		
		int num1, num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("a값")); 
		num2=Integer.parseInt(JOptionPane.showInputDialog("b값"));
		sum(num1, num2);
		
		
		
	}

}
