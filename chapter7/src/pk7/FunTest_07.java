package pk7;

public class FunTest_07 {

	public static int Recur(int a) { //3*2*1
	
		int gop;
		System.out.println(a); //3 2 1
		if(a==1)
			return (1); //return 1 = break : 정상 종료지만 실제로 값을 넘겨주진 않는다. 
		else gop=a*Recur(a-1); //3 * 2 * 1= 6 //Recur을 쓰면 다시 자신을 가져옴
		//return 0; //정상 리턴 
		
		return (gop);
	}
	
	public static void main(String[] args) {

		int res, x = 5;
		
		System.out.println("여기는 main()함수 입니다");
		System.out.println("메소드를 호출합니다");
		res= Recur(x); //재귀함수로 구현하시오
		System.out.println("main()으로 다시 돌아왔습니다.");
		System.out.println("1 ~ 3 까지의 수를 곱한 값 : " + res );
		
	}

}
