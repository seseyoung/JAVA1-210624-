package pk11;

import java.util.ArrayList;

public class AnimalTest2 {

	ArrayList<Animal> aList = new ArrayList<Animal>();
	// =Animal aniL=new Animal();

	public static void main(String[] args) {
		AnimalTest2 test = new AnimalTest2();

		System.out.println("--업캐스트--");
		test.addAnimal();
		System.out.println("--다운캐스트--");
		test.testCasting();

	}

	public void addAnimal() {
		aList.add(new Human());
		aList.add(new Tiger());
		aList.add(new Eagle()); //자동형변환,실제로 메모리는 new Human, new Tiger, new Eagle에서 만든것

		for (Animal ani : aList) { //배열의 요소들을 꺼내서 move호출 
			ani.move(); //오버라이딩 된것이라 나옴~!!
		}
	}

	public void testCasting() {
		for (int i = 0; i < aList.size(); i++) {
			Animal A = aList.get(i);
			if (A instanceof Human) {
				Human H = (Human) A;
				H.move();
				H.readBook();
			} else if (A instanceof Tiger) {
				Tiger T = (Tiger) A;
				T.move();
				T.hunting();
			} else if (A instanceof Eagle) {
				Eagle E = (Eagle) A;
				E.move();
				E.flying();
			} else
				System.out.println("모르는 동물입니다");

		}

	}
}
