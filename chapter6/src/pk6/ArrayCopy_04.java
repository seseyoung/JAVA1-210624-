package pk6;
//깊은 복사
public class ArrayCopy_04 {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("태백산맥", "조경래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		//bookArray1->A라는 방에 값을 넣음 -> A방에서 bookArray2로. 값이 가는것! 서로의 주소가 닿지 않는다. 원본이 변해도 사본은 변하지 않음.
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//아주 중요한 부분! get <-> set 구조를 이해하자
		for(int i=0 ; i<bookArray2.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());		
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());		
		}
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		System.out.println("==원본==");
		bookArray1[0].setBookName("나 목");
		bookArray1[0].setAuthor("박완서");

		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}System.out.println("==복사본==");
		//원본의 영향을 받지 않는다. == 깊은 복사
		
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}

}








