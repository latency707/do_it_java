// 템플릿 메서드 작동 테스트
package template;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("=== 자율주행 자동차 ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();
		
	}
}
