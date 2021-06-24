package pk8;

import javax.swing.JOptionPane;

public class SungJuk {

	// 멤버 변수=필드
	private String Std_num;
	private String Std_name;
	private int Java, Python, BigData;
	// private 외부에서 사용할때 접근을 막는다. =은닉성
	// 생성자는 디폴트 생성자

	// 메서드
	public void Sum() {
		System.out.println("합계는 : " + (Java + Python + BigData) + "입니다.");
	}

	public void Avg() {
		double Avg = ((double) Java + (double) Python + (double) BigData) / 3;
		System.out.println("평균은 : " + String.format("평균 : %.2f", Avg) + "입니다.");
	}

	public static void main(String[] args) {
		// rec 객체

		SungJuk rec = new SungJuk();
		rec.Std_num = JOptionPane.showInputDialog("학번");
		rec.Std_name = JOptionPane.showInputDialog("성명");
		rec.Java = Integer.parseInt(JOptionPane.showInputDialog("Java점수"));
		rec.Python = Integer.parseInt(JOptionPane.showInputDialog("Python점수"));
		rec.BigData = Integer.parseInt(JOptionPane.showInputDialog("BigData점수"));

		System.out.println(rec.Std_num + ", " + rec.Std_name + "의 성적입니다.");
		rec.Sum();
		rec.Avg();

	}

}
