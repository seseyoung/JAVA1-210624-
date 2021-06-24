package pk6;

public class ArraySum_03 {

	public static void main(String[] args) {

		int[] scores=new int[5];
		/*scores = new int[] { 83, 90, 87 };

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		*/
		int sum2=add(new int[] {83,90,87});
		System.out.println(sum2);
	}
		
	//메인 메소드 구현
		public static int add(int[] scores) { //int[] scores 매개변수:메소드 컴파일시 사용되는 변수
		int sum=0;
			for (int i = 0; i < scores.length; i++) {
				sum += scores[i];
			}
			return sum;
			
			//static 공통으로 사용 
		}
		
	
	
	
	
	
	
	
	}


