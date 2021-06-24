package pk9;

public class Person2Main {

	public static void main(String[] args) {

		Person2 personkim=new Person2();
		
		personkim.name="김유신";
		personkim.height=185.0f;
		personkim.weight=85.5f;
		
		personkim.showInfo();
		
		Person2 personOh=new Person2("오씨",180f,90f);
		
		personOh.showInfo();
		
	}

}
