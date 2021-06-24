package pk6;

public class ArrayCopy_02 {

	public static void main(String[] args) {

		//기본복사 외에 얕은복사 <->깊은복사가 있다.
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("태백산맥", "조경래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

		System.arraycopy(bookArray1, 0, bookArray2, 0, 3); // 0부터 3미만까지로 이해

		for (int i = 0; i < bookArray2.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		
		
		
	}

}
