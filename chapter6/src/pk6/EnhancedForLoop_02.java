package pk6;

import java.util.ArrayList;

public class EnhancedForLoop_02 {

	public static void main(String[] args) {
		 //배열을 동적 메모리로 사용할 수 있게한다. 쓴만큼만 메모리를 할당하기 때문에 효율적이다. Type에 제한이 없다.
		ArrayList<Book> library=new ArrayList<Book>();
		//Book[] library=new Book[5]; 
		
		library.add(new Book("태백산맥", "조경래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생텍쥐페리"));
		
		for(int i=0; i<library.size(); i++) {
			Book book=library.get(i); //==library[0] 
			book.showBookInfo(); //==library[0].showBookInfo()
		}
		System.out.println();
		System.out.println("--향상된 for문 사용--");
		for(Book book:library) {
			book.showBookInfo();
		}
		
		
	}

}
