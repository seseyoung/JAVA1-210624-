package pk11;

public class StrawBerry extends Berry {

	private String color;
	private int price;
	

	
	public void Set3(String a, int b) {
		color = a;
		price = b;
	}

	public void Disp3() {
		System.out.println("색깔 : "+ color);
		System.out.println("가격 : "+ price);
	}
}//만약 계절 부분에서 에러가 나면 Berry만 가서 수정하면 될것!





















