package pk12;

import test.Customer;
import test.VipCustomer;

public class OverridingTest_02 {

	public static void main(String[] args) {
		
		Customer vc=new VipCustomer(1001, "오이", 2000); //업캐스트
		vc.bonusPoint=1000; //커스터머 타입의 변수이므로 커스터머 변수방을 사용합니다.
		
		System.out.println(vc.getCustomerName()+"님이 지불하실 금액은 "+vc.calcPrice(10000)+"입니다");
		
		
	}
	
}
