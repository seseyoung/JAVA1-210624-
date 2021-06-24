package pk6;

public class ArrayTest_03 {

	public static void main(String[] args) {

		double[] data=new double[5];
		
		data[0]=10.0;
		data[1]=11.0;
		data[2]=12.0;
		data[3]=13.0;
		//선언되지 않은 나머지는 기본값 0으로 설정되서 나타난다.
		
		for(int i=0; i<data.length ; i++) {
			System.out.println(data[i]);
		}
		
		
	}

}
