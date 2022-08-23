// 추상클래스 PlayerLevel 구현하기
package gamelevel;

public abstract class PlayerLevel {
	// 각 레벨마다 다르게 구현하기 위한 추상 메서드 선언
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {	// 재정의 방지용 final 선언
		run();
		for(int i = 0; i < count; i++) {
			 jump();
		}
		turn();
	}

}
