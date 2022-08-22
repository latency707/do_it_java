/*
 * 가상 메서드의 원리
 * 일반적으로 프로그램에서 메서드를 호출한다는 것은 그 메서드의 명령집합이 있는 메모리 위치를 참조해 명령을 실행하는 것임
 * 반면 가상메서드는 '가상 메서드 테이블'이 생성되는데, 가상 메서드 테이블은 각 메서드명과 실제 메모리 주소가 짝을 이룸
 * 어떤 메서드가 호출되면 이 테이블에서 주소 값을 찾아서 해당 메서드의 명령을 수행함
 * ***자바의 모든 메서드는 가상 메서드임***
*/

// 클래스형에 기반해 지불금액 계산하기
package virtualfunction;

import inheritance.CustomerSuper;
import inheritance.VIPCustomerSuper;

public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;
		
		// 상위클래스 Customer 인스턴스 생성
		CustomerSuper customerLee = new CustomerSuper(10010, "Lee Soon Shin");
		System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원입니다.");
		
		// 하위 클래스인 VIPCustomer 인스턴스 생성
		VIPCustomerSuper customerKim = new VIPCustomerSuper(10020, "Kim Yu Shin", 12345);
		System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원입니다.");
		
		// 하위클래스 VIPCustomer 인스턴스를 Customer형으로 변환
		CustomerSuper vc = new VIPCustomerSuper(10030, "IDONTKNOW", 2000);
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원입니다.");
		// 가상 메서드 방식에 의해 VIPCustomer 인스턴스의 메서드가 호출돼 할인가격 9000 출력
	}

}
