package pk3;

public class DoubleEx2 {

	public static void main(String[] args) {
		
		double dnum=1; //기본값 세팅
		
		//int가 아닌 double 기본값에 정수를 설정했지만 나중에 계산했을때 실수가 나올 수 있기 때문에 double을 쓴 경우
		
		/*
		 * dnum=dnum + 0.1;
		 * 
		 * System.out.println(dnum);
		 */
		
		for(int i=0; i<10000; i++) { //i++ == i+1 
			dnum=dnum + 0.1;
		}
						
		System.out.println(dnum);
					
	}

}
