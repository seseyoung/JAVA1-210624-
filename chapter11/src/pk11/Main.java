package pk11;

public class Main {

	public static void main(String[] args) {

		ChildExam C1 = new ChildExam();
		
		System.out.println(C1.getCar());
		System.out.println(C1.getMoney()+"원");
		
		//ChildExam 곧 ParentExam이 된다 
		//왼쪽의 객체가 오른쪽의 클래스의 인스턴스냐, 즉 그 클래스로 만든 객체냐?
		//instanceof 는 연산자
		if(C1 instanceof ParentExam) {
			System.out.println("C1은 ParentExam의 자식 클래스입니다.");
			
			System.out.println("1.---------------------------------------------");
			
			ChildExam ch=new ChildExam();
			ParentExam p1=new ParentExam();
			
			p1=ch; //오버라이딩떄문에 한 상태에서 부모클래스의 메서드를 쓰기위해서 사용!!
			ch=(ChildExam)p1; //자식의 부모의 기능 대입 
			
			System.out.println("2.-----------");
			//자식은 부모의 메서드와 자기 자신의 메서드를 모두 사용.
			System.out.println(ch.getCar());
			System.out.println(ch.getMoney());
			System.out.println(ch.getStr());
			System.out.println("3.------------");
			//반면 부모는 자식의 메서드를 사용할 수 없다.
			System.out.println(p1.getMoney());
			System.out.println(p1.getStr());
			System.out.println("4.------------");
			System.out.println(((ChildExam)p1).getCar()); //<억지로 쓰는..
			
			
			
		}
	}

}
