package pk9;

public class Person2 {
	
	String name;
	float height;
	float weight;
	
	public Person2() {
		// TODO Auto-generated constructor stub
	}
	
	public Person2(String name) {
		this.name=name;
	}
	
	public Person2(String name,float height, float weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	public void showInfo() {
		System.out.println("이름: "+name +", 키: " +height+ ", 몸무게: " + weight);
	}
	
	
	
	
	
}



