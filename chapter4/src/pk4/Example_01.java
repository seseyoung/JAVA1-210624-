package pk4;

public class Example_01 {

	public static void main(String[] args) {
		
		/*
		 * 과수원이 있다. 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개
		 * 그렇다면 
		 * 과수원에서 하루에 생산되는 총 개수를 출력하고, 시간당 전체 과일의 평균 생산갯수를 출력하시오
		 * 단, 평균값을 담은 변수는 float으로 지정할 것
		 */
		
		int A,B,C;
		
		A=5;
		B=7;
		C=5;
		
		int Total;
		
		Total=A+B+C;
		
		System.out.println("하루 생산 총량 : " + Total);
		float avg;
		
		avg=Total/24F; //f를 안써주면 정수로 계산되서 0으로 출력됨
		System.out.println("시간당 과일 평균 생산량 : " + avg);
		
		
		


		
	}

}
