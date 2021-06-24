package pk13;

import java.util.ArrayList;

public class AnimalExample {
	
	public static void Animal(Animal Animal) {
		Animal.sound();
	}
	ArrayList<Animal> aList=new ArrayList<Animal>();
	
	public void putanimal() {
		aList.add(new Cat());
		aList.add(new Dog());
	}
	
	public void getSound() {
		for(int i=0; i<aList.size();i++) {
			aList.get(i).sound();
		}
	}
	
	public static void main(String[] args) {
		//각각의 객체를 만들어서 Cat과 Dog의 메서드를 호출하세오.
		Cat c=new Cat();
		Dog d=new Dog();
		
		c.sound();
		d.sound();
		
		System.out.println("---자동형변환-----");
		
		Animal c1=new Cat();
		c1.sound();
		System.out.println();
		Animal c2=new Dog();
		c2.sound();
		
		System.out.println("---메서드(매개변수) 사용----");
		Animal(new Dog());
		System.out.println();
		Animal(new Cat());
		
		System.out.println("---어레이 사용+메서드---");
		AnimalExample ani = new AnimalExample();
		ani.putanimal();
		ani.getSound();
		
	}

}
