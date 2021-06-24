package pk9;

public class KoreaMain {

	public static void main(String[] args) {

		Korea K1=new Korea("김파이썬", "대한민국");
		
		System.out.println(K1.name);
		System.out.println(K1.nation);
		
		Korea K2=new Korea("김자바", "영국");
		
		System.out.println("===========================");
		System.out.println(K2.name);
		System.out.println(K2.nation);
		
		System.out.println("===========================");
		Korea K3=new Korea();
		System.out.println(K3.name);
		System.out.println(K3.nation);
	}

}
