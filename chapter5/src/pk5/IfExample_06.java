package pk5;

public class IfExample_06 {

	public static void main(String[] args) {

		int num=(int)(Math.random()*6)+1; // (0~5까지 랜덤으로 나옴) 아주 많이 쓴다.
//		double num1=(Math.random()*6); 실수인 숫자가 랜덤으로 추출된 		
				System.out.println(num);
		
		if(num==1) {
			System.out.println("A");
		}else if(num==2) {
			System.out.println("B");
		}else if(num==3) {
			System.out.println("C");
		}else if(num==4) {
			System.out.println("D");
		}else if(num==5) {
			System.out.println("E");
		}else {
			System.out.println("F");
		}
		
				
	}

}
