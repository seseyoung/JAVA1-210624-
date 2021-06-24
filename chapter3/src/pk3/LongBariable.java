package pk3;

public class LongBariable {

	public static void main(String[] args) {
		
//		int num1=12345678900; 'int'의 범위를 벗어났음
       long num2=12345678900L; //끝자리 L표기를 해줘야 한다.
       long num3=1000; //단 이런 경우 'int'에서도 흡수할 수 있기때문에 오류가 나지는 않는다. 일단 'int'로 인식중
       
       System.out.println(num2+num3);  
	}

}
