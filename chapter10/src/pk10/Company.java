package pk10;

public class Company {
	
	
	//객채를 단 하나만 생성
	private static Company instance=new Company(); //다른곳에서 못만들기 때문에, Company내부에서 객체를 생성
	
	private Company() {};	//다른곳에서 함부로 company 생성자를 만들 수 없게 된다.
				
	public static Company getInstance() { //다른 곳에서 객체를 만들지 않고 company 인스턴스를 가져가게 하기 위해 static 선언을 한다.
		if(instance == null) { //객체를 생성한 적이 없다면, 이라는 뜻의 문법 singleton 생성문법, 이미 null이겠지만 혹시 모르니 쓰는 방어적 코드
			instance=new Company();
		}
		return instance; //리턴값으로 company의 인스턴스를 넘겨준다.
	}
	

	
	
	
	
		
			
}
