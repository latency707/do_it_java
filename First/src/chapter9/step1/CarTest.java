// 추상클래스 Car 테스트하기
package chapter9.step1;

public class CarTest {
	public static void main(String[] args) {
		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();
	}
}
