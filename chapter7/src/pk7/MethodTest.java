package pk7;

import java.util.Scanner;

public class MethodTest {

	public static void makeBread() {
		System.out.println("빵을 모두 완성했습니다!!!");
	}

	public static void makeBread(int a) {
		int[] bread = new int[a];
		for (int i = 0; i < bread.length; i++) {
			System.out.println((i + 1) + "번째 빵을 완성하였습니다.");
		}
		MethodTest.makeBread();
	}

	public static void makeBread(int a, String name) {
		int[] bread = new int[a];
		for (int i = 0; i < bread.length; i++) {
			System.out.println((i + 1) + "번째 " + name + "빵을 완성하였습니다.");
		}
		MethodTest.makeBread();
	}

	public static void order() {
		Scanner A = new Scanner(System.in);
		boolean run = true;
		int c = 0;
		while (run) {
			System.out.println("1.빵 개수 입력| 2.빵 개수와 종류 입력|3. 프로그램 종료");
			System.out.print("입력: ");
			c = A.nextInt();
			if (c == 1) {
				System.out.print("빵 개수를 입력하세요: ");
				MethodTest.makeBread(A.nextInt());
			} else if (c == 2) {
				System.out.print("빵 개수를 입력하세요: ");
				int cnt = A.nextInt();
				System.out.print("빵 종류를 입력하세요: ");
				String bre = A.next();
				MethodTest.makeBread(cnt, bre);
			} else if (c == 3) {
				System.out.println("프로그램을 종료하였습니다.");
				run = false;
				break;

			} else {
				System.out.println("잘못 입력하셨습니다.");
			}

		}

	}

}
