package pk9;

public class consTest {
	
	private int aa;
	private int bb;
	
	public consTest(int aa, int bb) {
		this.aa=aa;
		this.bb=bb;
	}
	
	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

	public int getBb() {
		return bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}
	
	public void showA() {
		System.out.println(aa);
	}
	public void showB() {
		System.out.println(bb);
	}
	

	public static void main(String[] args) {
		consTest C=new consTest(5, 10);
		C.showA();
		C.showB();
		System.out.println(C.getAa());
		System.out.println(C.getBb());
		System.out.println(C.aa);
		System.out.println(C.bb);
	}


}
