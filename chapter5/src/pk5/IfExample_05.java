package pk5;

public class IfExample_05 {

	public static void main(String[] args) {

		int age=10;
		int charge=0;
		int i=10;
		
		if(age<8) {
			charge=1000;
		}
		if(age<14) {
			charge=2000;
		}
		if(age<20 && (i+=4)<0) {
			charge=2500;
		}
		System.out.println("입장료 : " + charge);
		//else를 안쓰고 if를 연이어 쓸 수 있다. -이중If문
	}

}
