package pk13;

public class Dog extends Animal{

	public Dog() {
		this.Kind="씨끄러움";
		System.out.println(this.Kind);
	}
	
	
	@Override
	public void sound() {
		System.out.println("멍몽망뭉");
	}
	
	
	
	
}
