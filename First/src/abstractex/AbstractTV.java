/*
 * 모든 추상 메서드를 구현한 클래스에 abstract 예약어를 쓰면 어떻게 될까?
 * 문법상 모든 메서드를 구현했어도 abstract 예약어를 사용한 클래스는 추상클래스가 됨
*/

package abstractex;

public class AbstractTV {
	public void turnOn() {
		System.out.println("Power On");
	}
	
	public void turnOff() {
		System.out.println("Power Off");
	}
}
