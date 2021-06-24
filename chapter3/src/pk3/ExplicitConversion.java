package pk3;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		
		int iNum=1000; //32비트
     	byte bNum=(byte)iNum;  //8비트 -128~127
     	
     	System.out.println(bNum);
     	System.out.println(iNum); //문법상 문제는 없지만 오류가 난다.
     	
     	double dNum1=1.2;
     	float fNum2=0.9f;
     	
     	int iNum2=(int)(dNum1+fNum2); //2.1 ->2
     	int iNum3=(int)dNum1+(int)fNum2; //1+0 =1 어떤값이든 틀리지 않으니 잘 선택해서 써야한다.
     	System.out.println(iNum2);
     	System.out.println(iNum3);
     	

	}

}
