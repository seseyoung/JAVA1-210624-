package pk7;

public class EX1_OverloadingMain {

	public static void main(String[] args) {

		EX1_Overloading ex = new EX1_Overloading();
		
		ex.getResult('A');
		ex.getResult(5);
		ex.getResult("안녕");
		ex.getResult(5, "안녕");
		
	}

}
