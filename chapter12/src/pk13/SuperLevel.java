package pk13;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("겁나 빨리 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("겁나 높이 뜁니다");
	}

	@Override
	public void turn() {
		System.out.println("공중제비를 돕니다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("고수입니다");
	}

}
