package pk6;

public class Book {
	
	public String bookName; //멤버변수. 전역변수
	public String author;
	
	//메소드나 생성자는 같은 이름이 중복될 수 없다. 다형성을 위해 존재, 생성자의 다형상=오버로딩
	public Book() {}; //생성자 : 클래스 이름하고 똑같아야하고, 클래스를 초기화 해준다.
	
	public Book(String bookName, String author) {  //생성자, 안에 매개변수를 갯수나 타입이 다르냐 따라서 같은이름이 동시에 존재 가능 
		
		this.bookName=bookName;
		this.author=author;  //this를 쓰는 이유는 현재 class메모리 안에 있는 것을 참조하라는 뜻이다.
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	} //서버구축
	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	
	
}
