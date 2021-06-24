package pk13;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1=new Computer(); //추상클래스는 인스턴스(heap,객체,object)할 수 없다.
		Computer c2=new Desktop();
		//Computer c3=new NoteBook(); //Error : 추상클래스!! 인스턴스 불가!!
		Computer c4=new MyNoteBook();
		
		c2.typing();
		c4.typing();
	}

}
