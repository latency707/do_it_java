package gamelevelreverse;

public class Player {
	private PlayerLevel level;	// 모든 Player가 가지는 변수 level

	// 디폴트 생성자 
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	// 레벨 변경 메서드
	public void upgradeLevel(PlayerLevel level) {	// 매개변수 자료형에 모든 레벨로 변환 가능한 Playerlevel 입력
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);	// playerLevel 템플릿 메서드 go() 호출
	}
}
