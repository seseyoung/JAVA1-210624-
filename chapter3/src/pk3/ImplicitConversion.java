package pk3;

public class ImplicitConversion {
//묵시적인 형변환
	public static void main(String[] args) {
		
		byte bNum=10;
		int iNum=bNum; //자연스런 형변환
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2=20;
		float fNum=iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum); //보다 더 정밀한 곳에 맞추기 때문에 20.0으로 나옴
		
		double dNum;
		dNum=fNum+iNum;
		
		System.out.println(dNum); //
		
		

	}

}
