package pk13;

public class SmartPhone extends Phone {
	
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	} //Phone에서 기본생성자가 아닌 String Owner를 설정하도록 해놨다, 그러므로 여기서도 무조건 생성해야함.단, 디폴트 생성자를 명시해줬다면 굳이 받을 필요 없다.
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
	
}
