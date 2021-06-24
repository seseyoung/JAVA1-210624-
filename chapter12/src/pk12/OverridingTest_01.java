package pk12;
//라이브러리 개념으로 사용!
import test.Customer;
import test.VipCustomer;

public class OverridingTest_01 {

	public static void main(String[] args) {
		System.out.println("--silver--");
		Customer cLee=new Customer(1512, "씨리");
		cLee.bonusPoint=1000;
		System.out.println(cLee.ShowCustomerInfo());
		
		System.out.println("--vip--");
		//Car c=new Car(); //프로젝트가 달라져버리면 참고할수없음
		VipCustomer buja=new VipCustomer(1234, "김부자", 32042);
		buja.bonusPoint=10000;
		System.out.println(buja.ShowCustomerInfo());
		System.out.println(buja.getAgentID());
		System.out.println("----결제하실 금액----");
		int price=10000;
		System.out.println(cLee.getCustomerName()+"님이 지불하실 금액은 "+ cLee.calcPrice(price)+"원 입니다.");
		System.out.println(buja.getCustomerName()+"님이 지불하실 금액은 "+ buja.calcPrice(price)+"원 입니다.");
		
		
		
	}
}
