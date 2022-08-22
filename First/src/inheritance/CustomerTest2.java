/*
 * 하위 클래스가 생성되는 과정
 * 상위 클래스인 Customer과 하위클래스 VIPCustomer의 생성자의 생성 출력문 순서를 보면 상위에서 하위 순으로 호출이 됨
 * 상위클래스를 상속받은 하위 클래스가 생성될 때는 반드시 상위클래스의 생성자가 먼저 호출된다는 뜻
 * 또한 상위 클래스 생섯ㅇ자가 호출될 때 상위 클래스의 멤버변수가 힙 메모리에 생성됨
 * 
*/

// 하위 클래스 생성
package inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		VIPCustomer customerKim = new VIPCustomer();	// VIP만 생성했는데 상위 클래스도 함께 생성된 이유는?? >>> super 예약어 때문
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("Kim Yu Shin");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
