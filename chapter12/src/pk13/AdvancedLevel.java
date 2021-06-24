package pk13;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("제법 빠르게 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("뜁니다");
	}

	@Override
	public void turn() {
		System.out.println("아직 턴은 못합니다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("중급자 입니다");
	}

}
