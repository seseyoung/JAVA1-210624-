package pk5;

public class DoWhile_01 {

	public static void main(String[] args) {

		int num=1; //인덱스 변수 초기화가 여기서 이루어짐
		int sum=0;
		
		do { //do ~ while문의 헤더
			sum += num; //1 값을 증가
			num++; //2 //인덱스변수 증가
		}while(num<=10); //do while문을 조건 비교해서 닫아줌.
		
		
		//do while문과는 상관없고 do while문이 끝나고서 실행된다.
		System.out.println("1부터 10까지의 합 : " + sum+ "입니다.");
		
		
	}

}
