package pk3;

public class BinaryTest {
	// 파스칼: 무조건 첫글자 대문자
	// 카멜:맨앞소문자 첫글자 대문자
	public static void main(String[] args) {
		// int : 정수 (4바이트)
		int num = 10;
		int bNum = 0B1010; // 8421 = 8+2=10
		int oNum = 012; // 8+2 =10
		int hNum = 0xA; // 16진법 A==10

		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);

	}

}
