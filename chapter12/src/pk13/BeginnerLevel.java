package pk13;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("달립니다");
	}

	@Override
	public void jump() {
		System.out.println("점프 못합니다");
	}

	@Override
	public void turn() {
		System.out.println("턴 못합니다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("초보자 입니다");
	}

}
