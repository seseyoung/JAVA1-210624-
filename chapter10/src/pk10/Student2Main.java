package pk10;

public class Student2Main {

	public static void main(String[] args) {

		Student2 St2 = new Student2();
		St2.setStudentName("오잉");
		
		System.out.print("학번 :" +St2.studentID+" ");
		System.out.println("이름: " + St2.getStudentName());
		
		Student2 St3 = new Student2();
		St3.setStudentName("어잉");
		
		System.out.print("학번 :" +St3.getSerialNum()+" ");
		System.out.println("이름: " +St3.studentName);
		
		
	}

}
