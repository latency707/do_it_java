/*
 * 묵시적 클래스 형변환과 메서드 재정의
 * 상속에서 상위 클래스와 하위 클래스에 같은 이름의 메서드가 존재할 때 호출되는 메서드는 인스턴스에 따라 결정됨
 * 선언한 클래스형이 아닌, '생성된 인스턴스의 메서드를 호출'하는데 이를 '가상 메서드' 라고 함
 * 
*/

// 클래스 형변환과 재정의 매서드 호출하기
package inheritance;

public class OverridingTest2 {
	public static void main(String[] args) {
		CustomerSuper vc = new VIPCustomerSuper(10030, "IDONTKNOW", 2000);	// VIP 고객 생성
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원입니다.");	// 정가가 아닌 VIP 할인이 적용된 9000 반환
	}

}
