package pk9;

public class OverloadMain {

	public static void main(String[] args) {

		Overload O1=new Overload();
		Overload O2=new Overload(29, 180f);
		Overload O3=new Overload(19, 170f, "오오오");
		
		O1.Disp();
		O2.Disp();
		O3.Disp();
		
		
	}

}
