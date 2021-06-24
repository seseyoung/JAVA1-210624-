package pk5;

public class ForTest_07 {

	public static void main(String[] args) {

		//continue
		
		int total=0;
		int num;
		
		for(num=1;num<=100;num++) {
			//짝수는 제외하고 더하기
			if(num%2==0) //짝수 판별수식
		    continue; //그냥 넘기라는 뜻
			
			total+=num;
			
		}
		System.out.println("1부터 100까지의 홀수의 합 : " + total + "입니다");
				
	 
	}

}
