package pk8;

public class Vending {
//멤버변수
	private Can can[] = new Can[5];
	private int money;

	// 생성자 생략

	// 초기화 메서드는 통상적으로 init <많이씁니다. 이니셜에 init
	public void init() {
		can[0] = new Can("환타", 1000);
		can[1] = new Can("아몬드브리즈", 1200);
		can[2] = new Can("레몬에이드", 900);
		can[3] = new Can("콜라", 1100);
		can[4] = new Can("알로에주스", 800);
	}

	public void showCans(int m) {
		money = m;
		System.out.println("구매 가능한 음료");
		for (int i = 0; i < can.length; i++) {
			if (money >= can[i].getPrice()) {
				System.out.println(can[i].getCanName() + "," + can[i].getPrice() + "원");
			}

		}
	}
		

	

	// 선택한 음료 제공 후 잔액을 계산해서 주는 메서드
	public void outCan(String name) {
		String c = name;
		int ex;
		for (int i = 0; i < can.length; i++) {
			if ((can[i].getCanName()).equals(c)) {
				System.out.println(can[i].getCanName() + "이(가) 나왔습니다.");
				ex = money - can[i].getPrice();
				System.out.println("현재 잔액: " + ex + "원");
			}
		}

	}

}
