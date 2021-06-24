package pk8;

public class DmbcellPhoneExample {

	public static void main(String[] args) {

		DmbcellPhone dmbCellPhone = new DmbcellPhone("JavaPhone", "흰색", 11);
		//CellPhone class에 존재
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		//Dmb.. class에 존재
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		//CellPhone에 존재하는 메서드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("네 누구십니까?");
		dmbCellPhone.sendVoice("아 안녕! 공부 좀 하세요");
		dmbCellPhone.receiveVoice("싫어요!!!");
		dmbCellPhone.hangUp();
		//dmb...에 존재하는 메서드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannl(7);
		dmbCellPhone.turnOffDmb();
	}

}
