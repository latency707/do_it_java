package practice12;

import java.util.HashMap;

public class CarFactory {
	private HashMap<String, Car> hashMap = new HashMap<String, Car>();
	private static CarFactory carFactory; // 싱글턴
	
	public Car createCar(String key) {
		Car car = null;
		if(!hashMap.containsKey(key)) // hashMap에 매개변수로 받은 키 값이 있다면
			hashMap.put(key, new Car(key)); // key값 집어넣기
		car = hashMap.get(key); // key값 가져오기
		return car;
	}
	
	public static CarFactory getInstance() { // 싱글턴
		if (carFactory == null) // carFactory가 null 값이라면
			carFactory = new CarFactory(); // 인스턴스 생성?
		return carFactory;
	}

}
