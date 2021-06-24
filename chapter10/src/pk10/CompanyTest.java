package pk10;

public class CompanyTest {

	public static void main(String[] args) {
		//일반적인 개체 생성
		/*
		 * Company Company1 = new Company(); Company Company2 = new Company();
		 * 
		 * System.out.println(Company1); System.out.println(Company2);
		 * 
		 * System.out.println("----------------------------------");
		 * 
		 * //객체를 하나만 생성할 수 있는 singleton
		 */
		
		Company mycompany1=Company.getInstance();//클래스타입이기 때문에 진입가능
		Company mycompany2=Company.getInstance();

		System.out.println(mycompany1);
		System.out.println(mycompany2);
		System.out.println(mycompany1==mycompany2);
		//-->주소가 같은 곳을 지칭,예를 들면 모든 클래스의 합을 구하기 적합하다

		
		
		
		
		
		
		
		
	}

}
