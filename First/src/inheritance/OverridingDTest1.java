// calcPrice() 오버라이딩 테스트하기
package inheritance;

public class OverridingDTest1 {
	public static void main(String[] args) {
		CustomerSuper customerLee = new CustomerSuper(10100, "Lee Soon Shin");
		customerLee.bonusPoint = 1000;
		
		VIPCustomerSuper customerKim = new VIPCustomerSuper(10020, "Kim Yu Shin", 12345);
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원입니다.");
		System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원입니다.");
	}

}
