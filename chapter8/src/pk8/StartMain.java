package pk8;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {

		Start S = new Start();

		boolean Run = true;

		while (Run) {
			S.check(S.getRandom());
			String Check = S.getResult();
			if (Check.equals("SUCCESS"))
				Run = false;

		}

	}

}
