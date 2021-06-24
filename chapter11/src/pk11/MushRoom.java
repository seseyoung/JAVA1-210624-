package pk11;

public class MushRoom extends Vegetable{
	
	String size;
	int price;
	boolean poizon;
	
	public void Set2(String a, int b, Boolean c) {
		size=a;
		price=b;
		poizon=c;
	}
	
	public void Disp2() {
		System.out.println("크기 : "+size);
		System.out.println("가격 : "+price);
		System.out.println("독 유무 : "+poizon);
	}
	

}
