package pk10;

public class StaticFunction {
	
	String str1="일반 멤버변수";
	static String str2="Static 멤버변수";
	
	public static String getStatic() {
		//return str1; static 내부에서는 static변수만 접근 가능함.
		return str2;
	}

}
