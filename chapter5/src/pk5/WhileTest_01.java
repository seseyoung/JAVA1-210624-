package pk5;

public class WhileTest_01 {

	public static void main(String[] args) {

		while(true) {                  //무한반복, 반드시 브레이크 필요. or 조건을 걸 것
			int num=(int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("프로그램 종료"); //커다란 프로그램을 돌린다고 생각 
	}

}
