/*
 * 클래스를 인터페이스형 변수에 대입하면 형변환이 일어나, 특정 인터페이스에 선언한 메서드만 호출할 수 있음
*/
package interfaceex;
//Customer 작동 테스트 해보기
public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// Customer 클래스형 customer를 Buy 인터페이스형인 buyer에 대입하여 형변환
		Buy buyer = customer;
		buyer.buy();	// buyer는 Buy 인터페이스 메서드만 호출 가능
		
		// Customer 클래스형 customer를 Sell 인터페이스형인 seller에 대입하여 형변환
		Sell seller = customer;
		seller.sell();	// seller는 Sell 인터페이스 메서드만 호출 가능
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller;	// seller을 하위클래스형인 Customer로 다시 형변환. 다운캐스팅
			customer2.buy();
			customer2.sell();
		}
	}

}
