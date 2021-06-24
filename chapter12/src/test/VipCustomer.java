package test;

/* grade = vip-> 10퍼 할인, 5퍼 적립
 * 전문상담원 agentID=정수로 할것
 * vip /Silver 기본 등급
 * 생성자 이용 (고객의 아이디, 이름, 상담원아이디가 세팅되야함)
 * 생성자 이용 (등급=VIP, bonusRatio=0.05, saleratio=0.1)
 * calcPrice => overriding
 * showcustomerInfo => overriding 
 */
public class VipCustomer extends Customer {

	private int agentID;
	double saleratio;

	public VipCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID=agentID;
		setCustomerGrade("VIP");
		saleratio=0.1;
		bonusRatio=0.05;
		}
	
	@Override
	public int calcPrice(int price) {
		return super.calcPrice(price)-(int)(price*saleratio);
	}

	@Override
	public String ShowCustomerInfo() {
		return super.ShowCustomerInfo() + "상담원의 번호는 " + agentID + "입니다.";
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public static void main(String[] args) {
		Customer OH = new Customer(1000, "오세영");
		System.out.println(OH.calcPrice(10000) + "원");
		System.out.println("적립금: " + OH.bonusPoint);
		System.out.println(OH.ShowCustomerInfo());
		System.out.println("-----------------------------------");
		VipCustomer rich = new VipCustomer(1001, "부자", 4545);
		System.out.println(rich.calcPrice(10000) + "원");
		System.out.println("적립금: " + rich.bonusPoint);
		System.out.println(rich.ShowCustomerInfo());

	}

}
