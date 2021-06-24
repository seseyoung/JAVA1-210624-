package pk3;

public class TypeInference {
//자바 version 10 이상
	public static void main(String[] args) {
		
			int i=10; //선언은 10 
			var j=10.0; //double j=10.0; 과 같다
		    var str="hello"; //String str="hello"와 같다 
		    
		    i=100; //변수 100입력하면 100으로 나옴
		    str="test";
		   // str=3; Type Error // 처음 선언을 String으로 한 것과 같기 때문에 숫자는 들어갈 수 없다.
		   		    
		    System.out.println(i);
		    System.out.println(j);
		    System.out.println(str);
		    
		    
		    
		    
	
	}

}
