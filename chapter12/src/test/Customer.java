package test;

/*고객이 있다 customer-> 1.일반고객 parent클래스
 *		   vipCustomer-> 전담상담원, 혜택 많음 child클래스가 될 것
 */
public class Customer {

	public int customerID;
	public String customerName;
	public int agentID;
	double saleRatio;
	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String customerGrade;
	public int bonusPoint;
	double bonusRatio;

	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += bonusRatio * price;
		return price;
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public String ShowCustomerInfo() {
		return customerName+"님의 등급은 "+customerGrade+"이며 보너스 포인트는 "+
				bonusPoint+"점 입니다.";
	}

}
