package pk4;

public class Example_03 {

	public static void main(String[] args) {
    //삼항연산자를 이용하여 score가 90보다 크면 'A'이고 score가 80보다 크면 'B'
		
		
    //삼항연산자를 이용하여 score가 90보다 크면 'A'이고 score가 80보다 크면'B'고 그 이하로는 모두 'C'로 간주한다.
		
		int score=85;
		
		char C;
		
		C=(score>90)? 'A':'B';
		System.out.println(C);
		
		System.out.println("--------");

		char C2;
		
		score=50;
		
		/*
		 * C2=(score>90)? 'A':'B'; System.out.println(C2); C2=(score<90 && score>80)?
		 * 'B':'C'; System.out.println(C2);
		 * 
		 */
		
		C2=(score>90)? 'A':((score>80)? 'B':'C');
		System.out.println("학점은 : " + C2);
		
		
		
	}

}
