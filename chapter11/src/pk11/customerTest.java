package pk11;

public class customerTest {

	public static void main(String[] args) {
		//일반고객 정보(Customer에 구현이 되있음)
		System.out.println("--------일반고객---------");
		Customer customerLee=new Customer(); //고객등급과 포인트 적용률 생성되있음.
		customerLee.setCustomerName("오세용");
		
		
		int price = 10000;
		int leePrice=customerLee.calcPrice(price);
		System.out.println(customerLee.ShowCustomerInfo());
		System.out.println(customerLee.getCustomerName()+"님이 "+leePrice+"원을 지불했습니다");
		System.out.println("--------Vip------------");
		VipCustomer rich = new VipCustomer(1001, "부자", 4545);
		int richPrice=rich.calcPrice(50000);
		System.out.println(rich.getCustomerName()+"님이"+richPrice+"원을 지불했습니다");
		System.out.println("적립금: " + rich.bonusPoint);
		System.out.println(rich.ShowCustomerInfo());
		
	}

}
