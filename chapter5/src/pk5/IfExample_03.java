package pk5;

import javax.swing.JOptionPane;

public class IfExample_03 {

	public static void main(String[] args) {

		int Jumsu;
		
		Jumsu=Integer.parseInt(JOptionPane.showInputDialog("점수 입력"));
		
		char grade;
		
		if(Jumsu>=90) { 
			grade='A'; 
		}else if(Jumsu>=80) {
			grade='B';
		}else if(Jumsu>=70) {
			grade='C'; 
		}else if(Jumsu>=60) {
			grade='D';  
		}else {
			grade='F'; 
		}
		System.out.println("학점 : " + grade);
		
		//{}을 씌우는 이유는 첫줄로 간주하기 위해서.
		
		
	}
	
}
