package pk5;

public class SwitchCase_07 {

	public static void main(String[] args) {

		int time=(int)(Math.random()*4)+9;//기본은 double->int형변환
		System.out.println("[현재시간: "+ time + "시]"); //[현재시간: 9시]
		
		switch(time) {
		case 9:
			System.out.println("출근합니다.");
		    break;
		case 10:
			System.out.println("커피를 마시고 쉽니다");
			break;
		case 11:
			System.out.println("점심을 먹습니다.");
			break;
		default :
			System.out.println("탄력근무");
		
		}
	}

}
