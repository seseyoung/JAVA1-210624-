package pk5;

public class ForTest_05 {

	public static void main(String[] args) {

		
		//100넘기 전에 멈출것
		
		int i;
		int sum=0;
		
		for(i=0; sum<10000; i++) {
			sum = sum + i;
			if(sum>=100)
				break;
			
			
		}
			System.out.println(sum-i);
			System.out.println("i :" + i);
	}
}


