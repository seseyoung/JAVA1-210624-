package pk9;

public class Overload {

	private int age;
	private float h;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Overload() {
		age = 0;
		h = 0;
		name = "익명";
	}
	
	Overload(int age, float h) {
		this.age=age;
		this.h=h;
		name="익명";
	}
	Overload(int age, float h, String name) {
		this.age=age;
		this.h=h;
		this.name=name;
	}
	
	public void Disp() {
		System.out.println("나이: "+age+", 키: "+h+", 이름: "+name);
	}

}
