package pk5;

public class ForTest_04 {

	public static void main(String[] args) {

		//0부터 출발해서 100까지의 합
		
		int i;
		int sum=0;
		
		for(i=0; i<5; i++) { //0부터 출발하면 <   ,  1부터 시작하면 <= (회전횟수를 잘 알기 위함) 5번 회전
			sum= sum+i;
		}
		System.out.println(sum);
	}

}
