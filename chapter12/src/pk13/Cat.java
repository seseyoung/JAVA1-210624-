package pk13;

public class Cat extends Animal {

	public Cat() {
		this.Kind="뀌요미";
		System.out.println(this.Kind);
	}
	
	@Override
	public void sound() {
		System.out.println("아오옭?");
	}
	
}
