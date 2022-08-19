// 차량 정보가 들어있는 Car 클래스 만들기
package singleton;

public class Car {
	private static int serialNum = 10000;
	int carNum;	
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}

}
