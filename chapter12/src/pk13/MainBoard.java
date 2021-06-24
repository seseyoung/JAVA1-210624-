package pk13;

import java.util.Scanner;

public class MainBoard {

	public static void main(String[] args) {
		
		boolean run = true;
		Scanner S = new Scanner(System.in);
		int Select;

		System.out.print("플레이어 이름을 입력하세요: ");
		Player p = new Player(S.next());
		while (run) {
			System.out.println(p.PlayerName+"님 무엇을 하시겠습니까?");
			System.out.println("1. play 2. 레벨 업그레이드 3. 진행상황 4.종료");
			System.out.print("입력>>");
			Select = S.nextInt();
			switch (Select) {
			case 1:
				System.out.print("몇번 play하시겠습니까: ");
				p.play(S.nextInt());
				break;
			case 2:
				if (p.count > 10 && p.getLevel() instanceof BeginnerLevel) {
					p.upgradeLevel(new AdvancedLevel());
					System.out.println("업그레이드 완료");
				} else if (p.count > 30 && p.getLevel() instanceof AdvancedLevel) {
					p.upgradeLevel(new SuperLevel());
					System.out.println("업그레이드 완료");
				} else {
					System.out.println("paly횟수가 부족합니다");
				}
				break;
			case 3: p.PlayerInfo();
				break;
			case 4:
				run = false;
			default : System.out.println("잘못 누르셨습니다.");
			}

		}
	}
}
