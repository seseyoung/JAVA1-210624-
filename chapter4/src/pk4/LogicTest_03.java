package pk4;

public class LogicTest_03 {

	public static void main(String[] args) {

		int num1=10;
		int i=2;
		
		
		boolean value=((num1+=10)<10) && ((i+=2)<10); //and연산은 앞이 거짓이면 무조건 거짓이므로 뒤는 연산 하지 않았다.(부울대수 논리)
		System.out.println(value); 
		System.out.println(num1);
		System.out.println(i); // 부울대수 논리에 의해 계산하지 않았으므로 '2'
		
		System.out.println("------");
				
		value=((num1+=10)>10) || ((i+=2)<10); //or연산에서 앞이 참이므로 뒤에는 계산하지 않는다. (둘중 하나면 참이면 참이므로)
		System.out.println(num1);
		System.out.println(i); //계산하지 않아서 '2'
		System.out.println(value);
		
		
				
	}

}
