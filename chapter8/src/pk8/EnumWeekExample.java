package pk8;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {

		Week today = null;
		
		//캘린더 기능
		Calendar cal = Calendar.getInstance(); // getInstance -> 힙메모리를 만들어줌 new가 아님 enum생성자는 조금 특이
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일요일1~ 토요일7

		switch (week) {

		case 1: {
			today = Week.SUNDAY;
			break;
		}

		case 2: {
			today = Week.MONDAY;
			break;
		}
		case 3: {
			today = Week.TUESDAY;
			break;
		}
		case 4: {
			today = Week.WEDNESDAY;
			break;
		}
		case 5: {
			today = Week.THURSDAY;
			break;
		}
		case 6: {
			today = Week.FRIDAY;
			break;
		}
		case 7: {
			today = Week.SATURDAY;
			break;
		}

		}
		System.out.println("오늘 요일 : " + today);

		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 숙면");
		} else {
			System.out.println("열심히 Java를 공부한다");
		}

	}
}
