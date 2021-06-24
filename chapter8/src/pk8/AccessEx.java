package pk8;

//접근한정자 실습
public class AccessEx {

	
	
	private int aa; //은닉화 같은 클래스가 아니라면 사용 불가능
	public int bb; //공통 //public은 디폴트 
	int cc; //패키지가 같으면 사용가능
	
	//현재 디폴트생성자를 쓰고 있음
	
	//---메소드----
	public void SetA(int a) {
		aa=a;
	} //메소드를 통해서 int aa에 대한 값을 다른 곳에서도 간접적으로 공유할 수 있다.
	
	public void SetB(int b) {
		bb=b;
	}
	
	public void SetC(int c) {
		cc=c;
	}
	
	public void Disp() {
		System.out.println("aa값 : "+aa+"\nbb값 : "+bb+"\ncc값 : "+cc);
		
	//--메소드--	
	}//class off
	
	
	
	public static void main(String[] args) {
	
		AccessEx Acc = new AccessEx();
		
		//Acc.aa=10; //멤버변수 직접 접근
		Acc.bb=20;
		//Acc.cc=30;
		Acc.SetA(10); //메서드로 변수방 초기화
		Acc.SetB(20);
		Acc.SetC(30);
		
		// call by value(Acc.aa) 와 call by reference(Acc.SetA)의 차이,
		
		Acc.Disp();
		
		
		
	}

}
