package pk7;

import javax.swing.JOptionPane;

public class FunTest_03 {
	
	public void sum(int a, int b) { 
		System.out.println(a + "+" + b + "=" + (a+b));
		
	}

	public static void main(String[] args) {
		int num1, num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("Num1: "));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Num2: "));
		
		//sum(num1, num2); //ERROR static은 static만 부를 수 있다, static을 쓰려면 반드시 객체를 만들어서 써야한다.
		
		FunTest_03 obj=new FunTest_03(); 
		obj.sum(num1, num2); //Assignment 할때 주소를 가져옴  
		//시간은 값을 받아오기엔 계속 보며 참조해야 하기 때문에 시간같은 경우 call by reference(참조에 의한 호출)로 해야한다.
		
	}
//작동순서 숫자 입력 -> sum(num1, num2)에 들어감 -> 서버로 값을 복사함 -> 서버에서 계산후 결과값을 보냄 (void의 경우 return x 
//void를 쓰는 경우는 내가 return값을 아래에서 쓰지 않는다는 확신이 있을때!
}
