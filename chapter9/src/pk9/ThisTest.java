package pk9;

public class ThisTest {

	private int Speed;
	private int Age;
	private String RobotName;
	private String RobotNum;
	
	public ThisTest() {
		this(10,30,"R1","20210608");
	}
	
	ThisTest(int Speed, int Age, String RobotName, String RobotNum) {
		this.Age=Age;
		this.Speed=Speed;
		this.RobotName=RobotName;
		this.RobotNum=RobotNum;
	}
	
	public void Move() {
		Speed += 20;
		System.out.println("RobotSpeed: " + Speed);
	}
	public void Stop() {
		Speed = 0;
		System.out.println("RobotSpeed: " + Speed);
	}
	
	public void RAge() {
		Age+=1;
		System.out.println("RobotSAge: " + Age);
	}
	
	public void RName() {
		System.out.println("RobotName: " + RobotName);
	}
	
	public void RNum() {
		System.out.println("RobotNumber: " + RobotNum);
	}
	

	
	
	
	
	
	
	
}
