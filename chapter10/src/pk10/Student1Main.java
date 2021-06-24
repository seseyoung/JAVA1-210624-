package pk10;

public class Student1Main {

	public static void main(String[] args) {

		Student1 studentLee=new Student1();
		studentLee.setStudentName("오잉");
		System.out.println(studentLee.serialNum);
		Student1.serialNum++;
		
		Student1 studentKim=new Student1();
		studentKim.setStudentName("아잉");
		System.out.println(Student1.serialNum);
		
	}

}
