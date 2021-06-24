package pk6;

public class TwoDimension_02 {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];

		int n = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				n++;
				System.out.print(n + "\t"); // \t는 띄어쓰기
			}
			System.out.println(); // Enter역할 (줄바꿈)

		} 

	}

}
