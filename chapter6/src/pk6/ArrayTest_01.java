package pk6;

public class ArrayTest_01 {

	public static void main(String[] args) {

		/*
		 * 배열 선언
		 *
		 * int number1[]=new int[10];
		 * int [] number2=new int[10];
		 * int number3[];
		 * number3=new int[10];
		 */

		/*
		 * 초기화 int[] number1=new int[] {1,2,3,4,5,6,7,8,9,10}; int[] number1=new int[10]
		 * {1,2,3,4,5,6,7,8,9,10}; //오류 int number3[]= {1,2,3,4,5,6,7,8,9,10}; //가장 많이
		 * 쓰는 방법 int[] number4= {1,2,3,4,5,6,7,8,9,10};
		 */

		int[] number1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; //number1[0] == 1 <<원소라고 부름

		int len = number1.length;
		//System.out.println(len);
		for (int i = 0; i < len; i++) {
			System.out.println(number1[i]);
		}

	}
}
