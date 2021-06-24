package pk13;

public class Player {
	
	private PlayerLevel level;
	
	public PlayerLevel getLevel() {
		return level;
	}

	public String PlayerName;
	public int count;
	
	public Player(String PlayerName) {
		level=new BeginnerLevel();
		level.showLevelMessage();
		this.PlayerName=PlayerName;
	}
	
	public void play(int count) {
		level.go(count);
		this.count+=count;
		System.out.println("play 완료");
		if(count>10) 
			System.out.println("다음 단계로 업그레이드가 가능합니다");
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level=level;
		level.showLevelMessage();
	}
	
	
	public void PlayerInfo() {
		System.out.println(PlayerName+"님은 총 " +count+"회 play하셨습니다.");
		System.out.print(PlayerName+"님은 현재 ");
		level.showLevelMessage();
	}

}
