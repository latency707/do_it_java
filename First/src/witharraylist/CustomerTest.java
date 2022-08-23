// 배열로 고객 5명 구현하기
package witharraylist;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<polymorphism.Customer> customerList = new ArrayList<polymorphism.Customer>();
		
		polymorphism.Customer customerLee = new polymorphism.Customer(10010, "이순신");
		polymorphism.Customer customerShin = new polymorphism.Customer(10020, "신사임당");
		polymorphism.Customer customerHong = new GoldCustomer(10030, "홍길동");
		polymorphism.Customer customerYoul = new GoldCustomer(10040, "이율곡");
		polymorphism.Customer customerKim = new polymorphism.VIPCustomer(10050, "김유신", 12345);
		
		// ArrayList의 add 속성 활용 객체배열에 고객 추가하기
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		// 고객 정보 출력
		System.out.println("===== 고객 정보 출력 =====");
		for(polymorphism.Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		int price = 10000;

		// 고객 등급에 따른 할인율, 적립금 다형성 구현 확인
		for(polymorphism.Customer customer : customerList) {
			int cost = customer.calcPrice(price);	// 호출한 변수별로 실제 인스턴스에 따라 재정의한 메서드를 각각 호출하여 계산
			System.out.println(customer.getCustomerName() + " 님이" + cost + "원 지불하셨습니다");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}
	}

}
