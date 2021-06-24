package pk6;

public class ArgsTest_01 {

	public static void main(String[] args) {
		/*
		 * public = 보안 상관 없이 아무데서나 끌어 쓸 수 있게 해줌. public <-> privite static = 고정시켜놓는다.
		 * main --> 엔진 , 실행형 파일 배열 초기화 int a[]=new int[5]; int[] a; a=new int [5];
		 * ->a배열에 5개의 첨자 생성 String[] args <- 쓸라면 쓰라고 선언해놓음, String형의 배열
		 */

		int aVal;
		int bVal;
		int cVal;
		int Tot;

		/*
		 * args = new String[3]; args[0] = "1"; args[1] = "2"; args[2] = "3";
		 */

		if (args.length == 3) {
			// String -> int
			aVal = Integer.parseInt(args[0]);
			bVal = Integer.parseInt(args[1]);
			cVal = Integer.parseInt(args[2]);
		} // true
		else {
			aVal = 0;
			bVal = 0;
			cVal = 0;
		} // false
		System.out.println(args[0]);
		Tot = aVal + bVal + cVal;
		System.out.println(Tot);

	}// main

}// class
