package pk9;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		int side;
		int height;
		int Area;
		String form="";
		Scanner S = new Scanner(System.in);
		
		Encapsulation En =new Encapsulation();
		
		form="사각형";
		side=Integer.parseInt(JOptionPane.showInputDialog("넓이 입력"));
		height=Integer.parseInt(JOptionPane.showInputDialog("높이 입력"));
		Area=En.Cal_Area(side, height);
		System.out.println(form+" 넓이는 : "+Area);
		form=form+" 넓이는 : "+Area;
		JOptionPane.showMessageDialog(null, form);
		
	}

}
