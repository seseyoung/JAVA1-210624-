package pk8;

public class StdInfo {

	public String studentName;
	public int grade;
	public int money;

	// 생성자(오버로딩) 이름하고 돈은 갖고 태어나게 하라.

	public StdInfo(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
		if (money < 1500) {
			this.money += money;
		}
	}

	public void takeSub(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}

	public void showInfo() {
		System.out.println(studentName + "님의 잔액은 : " + money + "원 입니다.");
	}

	public void ChargeMoney(int money) {
		this.money += money;
	}

}
