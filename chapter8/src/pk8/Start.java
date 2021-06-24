package pk8;

import java.util.Random;
import java.util.Scanner;

public class Start {

	private int random= new Random().nextInt(50)+1;
	private int count;
	private String result="FAIL";
	
	
	
	public String getResult() {
		return result;
	}



	public void setResult(String result) {
		this.result = result;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public int getRandom() {
		return random;
	}



	public void setRandom(int random) {
		this.random = random;
	}



	public String check(int n) { 	
		
		
		Scanner S = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int Q=S.nextInt();
		count++;
		if(n<Q) {
			System.out.println("DOWN!!");
		}else if(n>Q) {
			System.out.println("UP");
		}else if(n==Q) {
			result="SUCCESS";
			System.out.println("정답입니다. " + count + "회 만에 맞추셨습니다.");
		}return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
