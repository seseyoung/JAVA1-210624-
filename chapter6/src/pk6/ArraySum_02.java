package pk6;

import com.sun.net.httpserver.Authenticator.Result;

public class ArraySum_02 {

	public static void main(String[] args) {

		int[] scores = { 83, 90, 87 };

		int sum = 0;
		double avg = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		avg = (double) sum / scores.length;
		System.out.println(String.format("평균 : %.2f" ,avg));
		
		double a=15.82;
		double b=20.19;
		
		double result=a*b;
		System.out.println(String.format("평균 : %.2f",result));
		
	}

}
