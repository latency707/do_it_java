/*
 * 다형성을 활용한 프로그램 유지보수
 * Customer 클래스에 GOLD 등급 만들기
 * 
 * GOLD 등급 속성
 * 제품 구매시 10% 할인
 * 보너스포인트 2% 적립
 * 담당 전문 상담원 없음
*/

// 새로운 고객등급 추가하기
package witharraylist;

public class GoldCustomer extends polymorphism.Customer{
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	// 메서드 재정의
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
