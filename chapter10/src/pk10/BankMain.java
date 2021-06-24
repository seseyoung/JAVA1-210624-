package pk10;

public class BankMain {

	public static void main(String[] args) {

		Bank b=new Bank("혜화", "02-123-4567");
		Bank t=new Bank("오이도", "02-234-5678");
		Bank.interest=0.2f;
		b.getBank();
		t.getBank();
		
		
		
	}

}
