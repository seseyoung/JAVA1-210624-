package pk5;

public class ForTest_08 {

	public static void main(String[] args) {

		int i,j;
		
		for(i=1; i<=5; i++) {
			for(j=1;j<=i;j++) {
				//i=1 j=1
				System.out.println(j + " ");
				
			}//안쪽 for문
			System.out.println("=====");
		}//바깥쪽 for문
		
		
	}//main

}//class
