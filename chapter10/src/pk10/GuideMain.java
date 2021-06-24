package pk10;

import java.util.Scanner;

public class GuideMain {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		boolean run = true;

		System.out.print("관광객 수를 입력하세요: ");
		Guide G = new Guide(S.nextInt());
		System.out.println("이름과 성별 입력하세요");
		G.PutInfo();

		while (run) {
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1.관광객 정보 | 2.목적지 변경 | 3.종료 ");
			System.out.print("입력: ");
			int select = S.nextInt();
			switch (select) {
			case 1:
				G.ShowInfo();
				break;
			case 2:
				System.out.println("현재 목적지: " + G.guest[0].getPoint());
				System.out.print("변경할 목적지 입력: ");
				G.PointChange(S.next());
				break;
			case 3:
				System.out.println("종료");
				run = false;
			}

		}

	}

}
