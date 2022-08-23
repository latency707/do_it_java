// 테스트 프로그램 실행
package gamelevel;

public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}

/*
 * 상위클래스인 추상클래스는 하위에 구현된 여러 클래스를 하나의 자료형(상위클래스 자료형)으로 선언 또는 대입할 수 있음
 * 추상클래스에 선언된 메서드를 호출하면 가상 메서드에 의해 각 클래스에 구현된 기능이 호출됨
 * 즉 하나의 코드가 다양한 자료형을 대상으로 동작하는 다형성을 활용할 수 있음
 * 
 */