package pk9;

public class Person {
	
	String name;
	int age;
	
	Person() {
		this("오세영", 29);
	}

	Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	Person returnSelf() {
		return this;
	}
	

	public static void main(String[] args) {
		Person nName=new Person();
		Person nName2=new Person("방방이", 15);
		System.out.println("기본생성자 객체");
		System.out.println(nName.name);
		System.out.println(nName.age);
		System.out.println("오버로딩 생성자 객체");
		System.out.println(nName2.name);
		System.out.println(nName2.age);
		
		System.out.println(nName.returnSelf());
		
		
	}
}
