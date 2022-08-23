/*
 * 추상클래스
 * 추상적이라는 것은 구체적이지 않고 막연한 것을 뜻함
 * 어떤 클래스가 추상적이라는 것은 구체적이지 않은 클래스를 뜻함
 * 추상클래스는 항상 추상메서드를 포함하는데 추상메서드는 구현코드 즉, 몸체(body)가 없음
 * 추상메서드는 중괄호{}로 감싼 부분인 구현부 없이 abstract 예약어를 통해 메서드 선언만 한다
 * 예시) abstract in add(int x, int y); 
*/

package abstractex;

public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("Power On");
	}
	public void turnOff() {
		System.out.println("Power Off");
	}

}
