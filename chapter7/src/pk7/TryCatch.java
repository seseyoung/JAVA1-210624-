package pk7;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TryCatch {
	
	public static void main(String[] args) {
		
		Scanner A = new Scanner(System.in);
		
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		/*
		 * int res=num1/num2; System.out.println(res);
		 */
		
		try { //해당 작업을 구현
			System.out.println(num1/num2);
		}catch (ArithmeticException e) { //에러가 나면
			System.out.println("값2에 숫자 0을(를) 입력하시면 안됩니다.");  //에러시 수행될 행위
		}
		
		System.out.println("Error 후 컴파일 = > 프로그램 수행 끝");
	}

}
