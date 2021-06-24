package pk10;

public class Guest {

	// 원래는 객체 생성하여 접근하여야 함
	public String getPoint() {
		return Guide.point;
	}

	private String ClientName;
	private String Gender;

	public String getClientName() {
		return ClientName;
	}

	public void setClientName(String clientName) {
		ClientName = clientName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

}
