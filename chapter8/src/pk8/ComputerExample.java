package pk8;

public class ComputerExample {

	public static void main(String[] args) {
		Computer C =new Computer();
		
		int[] values1= {1,2,3};
		int result1=C.sum1(values1);
		System.out.println(result1);
		//int[] values=new int[] {1,2,3,4,5}
		int result2 = C.sum1(new int[] {1,2,3,4,5,6,7,8,9});
		System.out.println(result2);
		
		System.out.println("==============================================");
		
		int result3=C.sum2(1,2,3);
		System.out.println(result3);
		
		int result4=C.sum2(1,2,3,4,5,6);
		System.out.println(result4);
		
	}

}
