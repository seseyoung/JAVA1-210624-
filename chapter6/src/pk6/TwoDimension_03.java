package pk6;

import javax.swing.JOptionPane;

public class TwoDimension_03 {

	public static void main(String[] args) {
		/*
		int[][] javaScore = new int[2][3];

		int java = 0;

		for (int i = 0; i < javaScore.length; i++) { // 0,1
			for (int j = 0; j < javaScore[i].length; j++) { // 0,1,2
				java = Integer.parseInt(JOptionPane.showInputDialog("javaScore"));
				javaScore[i][j] = java;
				System.out.println("javaScore[" + i + "][" + j + "]=" + javaScore[i][j]);
			}
			System.out.println();
		}

		int[][] pythonScore = new int[2][];
		int python = 0;
		
		pythonScore[0]=new int[2];
		pythonScore[1]=new int[3]; //이렇게 열을 유동적으로 줄 수도 있다.
		
		
		for (int i = 0; i < pythonScore.length; i++) {
			for (int j = 0; j < pythonScore[i].length; j++) {
				python = Integer.parseInt(JOptionPane.showInputDialog("pythonScore"));
				pythonScore[i][j] = python;
				System.out.println("pythonScore[" + i + "][" + j + "]=" + pythonScore[i][j]);
			}
			System.out.println();
			*/
			int[][] Bigdata= {{70,80},{92,96,70}};
			for(int i=0;i<Bigdata.length; i++) {
				for(int j=0;j<Bigdata[i].length;j++) {
					System.out.print("Bigdata["+i+"]["+j+"]=" + Bigdata[i][j]+ "\t" );
				}System.out.println();
			}
		}

	}


