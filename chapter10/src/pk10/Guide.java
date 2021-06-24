package pk10;

import java.util.Scanner;

public class Guide {
	static String point;
	Guest[] guest;

	public Guide(int n) {
		point = "가거도";
		// 배열의 메모리 확보
		guest = new Guest[n];
		for (int i = 0; i < guest.length; i++) {
			guest[i] = new Guest();
		}

	}

	public void PutInfo() {
		for (int i = 0; i < guest.length; i++) {
			Scanner S = new Scanner(System.in);
			System.out.print((i + 1) + "번 이름 입력: ");
			guest[i].setClientName(S.next());
			System.out.print((i + 1) + "번 성별 입력: ");
			guest[i].setGender(S.next());
		}

	}

	public void ShowInfo() {
		for (int i = 0; i < guest.length; i++) {
			System.out.println((i + 1) + "번 이름: " + guest[i].getClientName() + " |성별: " + guest[i].getGender()
					+ " |목적지: " + point);

		}

	}

	public void PointChange(String point) {
		Guide.point = point;
		System.out.println("목적지 변경 완료");
	}

}
