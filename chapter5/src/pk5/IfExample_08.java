package pk5;

import java.util.Scanner;

public class IfExample_08 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in); //new 새로운 메모리가 스캐너라는 클래스에 생겼다는 뜻. 쓰는만큼 메모리를 잡음
		
		System.out.print("첫 번째 수 : ");
		double num1=Double.parseDouble(scan.nextLine()); //nextLine의 기본타입은 String이다. 
		
		System.out.println(num1);
		
		System.out.print("두번째 수 : ");
		double num2=Double.parseDouble(scan.nextLine());
		
		if(num2 != 0.0) {
			System.out.println("결과 : " + (num1/num2));
		}else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
			
		
		
		
	}

}
