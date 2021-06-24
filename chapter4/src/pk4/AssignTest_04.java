package pk4;

public class AssignTest_04 {

	public static void main(String[] args) {

		int GameScore=150;
		int LastScore=++GameScore; //1을 더하고 읽음.
		int LastScore2=--GameScore; //1을 빼고 읽기
						
		
		/*
		 * System.out.println(LastScore); System.out.println(LastScore2);
		 */
		
		System.out.println("=====================================");
		
		//후위 연산
		int LastScore3=GameScore++; //읽고난 후(출력한 후) 1을 더함
		/*
		 * System.out.println(LastScore3); //150, 하지만 메모리에는 151
		 * System.out.println(GameScore);
		 */
		
		int LastScore4=GameScore--; //읽고난 후(출력한 후) 1을 뺌
		
		System.out.println(LastScore4); //151, 하지만 메모리에는 150
		System.out.println(GameScore);
		
		
		
		
	}

}
