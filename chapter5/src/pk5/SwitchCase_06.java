package pk5;

public class SwitchCase_06 {

	public static void main(String[] args) {

		int num=(int)(Math.random()*6+1);
		
		switch(num) {
		case 1:
			System.out.println("1번 획득");
			break;
		case 2:
			System.out.println("2번 획득");
			break;
		case 3:
			System.out.println("3번 획득");
			break;
		case 4:
			System.out.println("4번 획득");
			break;
		case 5:
			System.out.println("5번 획득");
			break;
		case 6:
			System.out.println("6번 획득");
			break;
		default :
			System.out.println("없는 번호");
			
		}
		
	}

}
