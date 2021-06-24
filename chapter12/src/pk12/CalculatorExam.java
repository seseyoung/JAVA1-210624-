package pk12;

import java.util.Scanner;

//CalculatorExam클래스를 만들고
	//getResult()함수를 정의하세요. 반환형은 정수.
	//인자 두개(n1, n2)를 받고 -1로 리턴하게 만듭니다.
		
	//CalPlus클래스를 만들어 Calculator클래스를 상속받으세요.
	//오버라이딩을 이용하여 Calculator의 getResult()함수를
	//인자로 받은 n1과 n2를 더해주는 함수로 만듭니다.
	//물론 리턴값도 -1이면 안되겠죠??
		
	//CalMinus클래스를 만들어 Calculator클래스를 상속받으세요.
	//오버라이딩을 이용하여 Calculator의 getResult()함수를
	//인자로 받은 n1과 n2를 빼주는 함수로 만듭니다.
		
	//Main에서 실행하여 아래와 같은 결과가 나오면 성공
	//CalPlus : 30
	//CalMinus : 15

public class CalculatorExam {

	public int getResult(int n1, int n2) {
		return -1; //정상이긴한데, 아무것도 넘길게 없을때
	}
	
	public void calculator(CalculatorExam calculatorExam) {
	}
	
	public static void main(String[] args) {
		CalPlus calp=new CalPlus();
		CalculatorExam calm=new CalMinus();
		Scanner s=new Scanner(System.in);
		System.out.print("덧셈할 두 숫자 입력: ");
		int P=calp.getResult(s.nextInt(), s.nextInt());
		System.out.print("뺄셈할 두 숫자 입력: ");
		int M=calm.getResult(s.nextInt(), s.nextInt());
		System.out.println("CalPlus: " +P);
		System.out.println("CalMinus: "+M);
		
	}
	


}
