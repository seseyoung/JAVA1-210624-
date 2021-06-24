package pk3;

public class ByteVariable {

	public static void main(String[] args) {
		
		byte bs1=-128; // -~128 ~ 127
//		byte bs2=128; 한도 초과
		short s=32767; //
		//short s=33000; //한도 초과  -32768~32767
		
		System.out.println(bs1);
		System.out.println(s);



	}

}
