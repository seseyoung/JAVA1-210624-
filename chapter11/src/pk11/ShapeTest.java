package pk11;

import java.util.ArrayList;

class Shape{
	void draw() {
		System.out.println("draw Shape");
	}
	
}




class Circle extends Shape{

	@Override
	
	
	void draw() {
		System.out.println("draw Circle");
	}
	
	void circle() {
		System.out.println("원 모양입니다.");
	}
	
	
}

class Rectangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}
	
	void rectangle() {
		System.out.println("사각형입니다.");
	}
}

class Triangle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Triangle");
	}
	
	void triangle() {
		System.out.println("삼각형입니다.");
	}
	
}



public class ShapeTest {
	
	ArrayList<Shape> sList=new ArrayList<Shape>();  //제네릭 ? Shape는 물론 Shape로부터 상속받은 모든것들이 다 들어온다. 
	//Circle ???; 이 이미 선언 되있는거랑 같음
	//Object << 최상위 클래스
	
	public static void main(String[] args) {
	ShapeTest sTest=new ShapeTest();
	System.out.println("---업캐스팅---");
	sTest.addShape();
	System.out.println("---다운캐스팅---");
	sTest.testCasting();
	
	}


	public void addShape() {
		
		sList.add(new Circle()); //Circle의 객체가 추가됨
		sList.add(new Rectangle()); 
		sList.add(new Triangle());  //0,1,2방에 차례대로 들어갔을지는 알 수 없음
		
		//업캐스팅: Shape 클래스인 L에 Circle,Rectangle,Triangle 객체가 형변환 없이 들어갈 수 있는것, 모두 부모class(Shape)로도 해석되고 있는 것 이다.
		//overriding 된 메서드는 읽지 않음.
		for(Shape L : sList) {
			L.draw();
			
		}
		
	}
	
	public void testCasting() {
		for(int i=0;i<sList.size();i++) {
			Shape s=sList.get(i); //업캐스트 개념이 들어감, Shape타입으로 해석될 수 있으므로, shape 형태인 s변수에 들어갈 수 있음.
			if(s instanceof Circle) {
				Circle c=(Circle)s; //반면 shape타입은 circle타입으로 해석될 수 없기때문에 형변환을 거쳐서 들어간다.
				c.draw();
				c.circle();
			}//다운캐스팅 부모가 자식화 됨. Circle로 형변환된것
				else if(s instanceof Rectangle) {
					Rectangle r=(Rectangle)s;
					r.draw();
					r.rectangle();
				}else if(s instanceof Triangle) {
					Triangle t=(Triangle)s;
					t.draw();
					t.triangle();
			}else 
				System.out.println("인정되지 않는 모양입니다");
			
		} 
	}
	
	
	
	
	
	
}
