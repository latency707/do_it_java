// AICar 클래스 구현
package template;

public class AICar extends Car{
	@Override
	public void drive() {
		System.out.println("자율주행을 시작합니다.");
		System.out.println("자동차가 알아서 방향을 전환합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("자동차가 스스로 정지합니다.");
	}
}
