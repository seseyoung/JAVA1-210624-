package pk3;

public class CharacterEx2 {

	public static void main(String[] args) {
		
		//int a=65; //대문자 A 
		int a=97; //소문자 a
		
		System.out.println(a);
		System.out.println((char)a); //형변환 , 아스키코드로 문자65는 대문자A 문자97은 소문자 a
		
		System.out.println("=======================");
		
		//int와 char는 호환이 가능하지만 음수와는 호환되지 않는다.
		int b=-66;
		System.out.println(b);
		System.out.println((char)b);
		
		char a2=65; //아스키코드기 때문이기 입력가능
//		char b2=-66; ASCII 코드에 없기 때문에 오류
		System.out.println(a2);
		System.out.println((int)a2);
				
		
	}

}
