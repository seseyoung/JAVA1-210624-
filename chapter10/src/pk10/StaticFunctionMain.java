package pk10;

import javax.swing.JOptionPane;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
		/*
		 * StaticFunction st =new StaticFunction(); System.out.println(st.str1); 객체선언=>heap메모리 생성
		 */
		
		String str;
		str=StaticFunction.getStatic(); //클래스명으로 접근하면 객체를 선언하지 않아도 static을 쓸 수 있다.  (data,즉 전역변수기 때문이다)
		
		System.out.println(str);
		
		
	}

}
