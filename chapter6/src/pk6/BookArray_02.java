package pk6;

public class BookArray_02 {

	public static void main(String[] args) {
		// Book library=new Book("백설공주", "홍길동"); //괄호 안에 메모리 할당
		// 배열로 끌어와야하는 이유 : 여러번 끌고 오는것보다 한번에 끌고오는게 합리적

		Book[] library = new Book[5];
		// 이곳에 저장되는것이 아닌 Book안에 public String ----에 저장, heap메모리!!, 각각 다른주소 다름
		library[0] = new Book("태백산맥", "조경래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		/*
		 * 서버에 만들것, 메인이 지저분해짐 System.out.println(library[0].bookName);
		 * System.out.println(library[1].bookName);
		 * System.out.println(library[2].bookName);
		 * System.out.println(library[3].bookName);
		 * System.out.println(library[4].bookName);
		 */

		// 위에 5줄보다 훨씬 깔끔하다.
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		System.out.println();

	}

}
