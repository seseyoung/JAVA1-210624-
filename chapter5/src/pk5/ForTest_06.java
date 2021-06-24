package pk5;

public class ForTest_06 {

	public static void main(String[] args) {

		//조건이 생략되면서 합이 100을 초과하면 멈춤
		int num=0;
		int sum=0;
		
		for(num=0; ; num++) {
			sum+= num;
			if(sum>=100) 
				break;
		}
		System.out.println(sum);
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
	
		
		
		//합이 100보다 작을 떄까지 출력
		
		/*int i=0;
		int sum=0;
		for(i=1; i<=100;i++) {
			sum =sum +i;
			if(sum<100) {
				System.out.println(sum);
			}*/
			
		}
	}


