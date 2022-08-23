/*
 * 템플릿 메서드
 * 템플릿 메서드는 디자인패턴의 한 방법으로, 틀이있는 메서드라는 뜻을 지님
 * 모든 객체 지향 프로그램에서 사용하는 구현방법
 * 
*/

// 추상클래스를 통한 템플릿 매서드 구현
package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() {
		startCar();
		drive();	// 차종에따라 방식이 다를 수 있으므로 추상메서드 선언
		stop();		// 차종에따라 방식이 다를 수 있으므로 추상메서드 선언
		turnOff();
	}

}
