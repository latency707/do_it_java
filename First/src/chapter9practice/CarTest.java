package chapter9practice;
import java.util.ArrayList;

import chapter9.step1.Car;

public class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Car car : carList) {
			car.run();
			System.out.println("==============");
		}
	}
	// 템플릿 메서드에 washCar() 메서드 "세차를 합니다" 추가할것
}
