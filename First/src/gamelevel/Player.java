/*
 * 템플릿 메서드 응용
 * 
 * 코드 구현시 무조건 클래스를 만들어 코딩하는 것보다 주어진 문제를 어떻게 해결할 것인지를 천천히 생각해보고,
 * 	손으로 클래스 다이어그램을 간략하게 그려보는 것이 객체지향 방식 문제해결의 좋은 습관임
 * 큰 프로젝트 진행에서는 이 과정을 분석/설계 과정이라고 함
 * 
 *   클래스 설계하기
 *   템플릿 메서드를 사용해서 체계적인 클래스 설계 해보기
 *   클래스 목록
 *   Player
 *   PlayerLevel(abs)
 *   BeginnerLevel
 *   AdvancedLevel
 *   SuperLevel
*/


// 플레이어 클래스
package gamelevel;

public class Player {
	private PlayerLevel level;	// Player의 멤버변수
	
	// 디폴트 생성자
	public Player() {
		level = new BeginnerLevel();	// 최초 생성시 BeginnerLevel로 시작
		level.showLevelMessage();		// 레벨 메세지 출력
		
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	// 레벨 변경 메서드
	public void upgradeLevel(PlayerLevel level) {	// 매개변수 자료형은 모든 형변환이 가능한 PlayerLevel
		this.level = level;			// 매개변수로 입력받은 level로 변경
		level.showLevelMessage();
	}
	
	// PlayerLevel의 템플릿메서드 go() 호출
	public void play(int count) {
		level.go(count);
	}
}
