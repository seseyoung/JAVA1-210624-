package pk6;

public class CharArray_02 {

	public static void main(String[] args) {

		char[] alpahabets = new char[26];
		char ch = 'A'; // ASCII=65
		
		
		for(int i=0; i<alpahabets.length; i++, ch++) {
			alpahabets[i]=ch;
		}//입력 끝
		
		for(int i=0; i<alpahabets.length; i++) {
			System.out.println(alpahabets[i]+ ", "+ (int)(alpahabets[i]));
		}
			
	}

}
