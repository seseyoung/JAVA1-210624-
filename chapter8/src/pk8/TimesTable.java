package pk8;

import java.util.Scanner;

public class TimesTable {

		Scanner S = new Scanner(System.in);
		
		public void gugu() {
		System.out.print("몇단까지 하시겠습니까? : ");
		int A[][] = new int[S.nextInt()][9];
		int i = 0;
		int j = 0;
		int result;

		for (i = 0; i < A.length; i++) {
			System.out.print("구구단" + (i + 1) + "단 :");
			for (j = 0; j < A[i].length; j++) {
				result = (i + 1) * (j + 1);
				A[i][j] = result;
				System.out.print(A[i][j] + " ");
			}System.out.println();
			}
		}
		
		public void guguOne(int num) {
			System.out.println("구구단" +num+"단 출력");
			int A= num;
			int i=0;
			int result;
			
			for (i =1; i<=9 ; i++) {
				System.out.println(A+ "*" + i + "=" +A*i);
				
			}
		}
		
}

