package pk6;

import javax.swing.JOptionPane;

public class CharArray_01 {

	public static void main(String[] args) {

		String str[]= {"ab111","cb222","ef333","gh444","ij555"};
		String res="";
		
		
		int i;
		
		for(i=0; i<str.length; i++) 
			res+=str[i]+"\n"; //\n << 뉴 라인의 약자. 엔터 
			
			System.out.println(res);
			
			JOptionPane.showMessageDialog(null, "배열원소의 값\n" + res);
		
		
	}

}
