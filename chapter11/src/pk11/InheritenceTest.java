package pk11;

public class InheritenceTest {

	public static void main(String[] args) {
		
		StrawBerry obj=new StrawBerry();
		
		obj.Set1("Berry류", "겨울");
		obj.Set2("딸기", "소");
		obj.Set3("빨강", 5000);
		obj.Disp1();
		System.out.println("--------------");
		obj.Disp2();
		System.out.println("--------------");
		obj.Disp3();
	}

}//프로젝트가 커지면 상속을 받아서 쓸수밖에 없다~
