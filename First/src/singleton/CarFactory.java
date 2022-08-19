/*
 * Q) 싱글턴 패턴으로 자동차공장 클래스 구현
 * 클래스 조건 목록
 * 자동차 공장은 유일한 객체
 * 자동차 생산 시 10001부터 시작해 1씩 증가하는 고유번호 부여
*/


package singleton;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
