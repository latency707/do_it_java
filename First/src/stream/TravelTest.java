/*
 ** 스트림 메서드 구현 예제
 * 1. 고객의 명단 출력
 * 2. 여행 총 비용 계산
 * 3. 고객 중 20세 이상 고객 이름 정렬 후 출력
*/

package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		// 고객 생성
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("== 고객 명단 추가된 순서대로 출력");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 여행 비용은: " + total + "입니다");
		
		System.out.println("== 20세 이상 고객 명단 정렬 및 출력");
		customerList.stream().filter(c->c.getAge() >= 20)
					.map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
