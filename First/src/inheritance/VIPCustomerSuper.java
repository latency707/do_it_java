/*
 * 부모를 부르는 예약어 super
 * 하위 클래스는 상위 클래스의 주소, 즉 참조값을 알고 있는데 이 참조값을 갖고 있는 예약어가 super
 * super는 상위 클래스의 생성자를 호출 시에도 쓰임
 * 하위 클래스 생성자만 호출했는데 상위 클래스 생성자까지 호출되는 이유는 하위클래스 생성자에서 super()를 자동으로 호출하기 때문
 * 
 * 클래스에서 명시하지 않아도 컴파일러가 자동으로 디폴트 생성자를 추가하는 것처럼 super()도 자동으로 생성자에 추가되어 상위 클래스 디폴트 생성자를 호출함
 * 
*/

// 상위 클래스의 멤버변수나 메서드를 참조하는 super
package inheritance;

public class VIPCustomerSuper extends CustomerSuper{	// VIPCustomer 클래스는 Customer 클래스를 상속받음
	private int agentID;	// VIP고객 상담원 ID
	double saleRatio;		// 특별 할인율
	
	public VIPCustomerSuper(int customerID, String customerName, int agentID) {	// 묵시적으로 호출될 디폴트 생성자 CustomerSuper()가 정의되지 않았기 떄문에, 반드시 명시적으로 다른 생성자를 호출해야 한다는 뜻
		super(customerID, customerName);	// 상위클래스 생성자 호출 및 코드 순서대로 멤버변수 초기화
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID; 
		System.out.println("VIPCustomerSuper(int, String, int) 생성자 호출 ");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	// super 예약어 활용해 상위 클래스의 showCustomerInfo 메서드를 참조해 담당 상담원 ID를 추가로 출력하는 메서드 구현
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원 ID는 " + agentID + " 입니다.";
	}
	
	// 메서드 오버라이딩
	// 상위 클래스에서 정의한 calcPrice()는 혜택없이 정가를 지불하기 때문에 vip 혜택에 맞게 재정의할 필요가 있음
	// 이를 메서드 오버라이딩이라고 하는데 오버라이딩은 반환형, 메서드명, 매개변수 개수, 매개변수 자료형이 전부 일치해야함
	@Override	// @Override 애노테이션은 '이 메서드는 재정의된 메서드입니다' 라고 컴파일러에 정보를 제공하는 역할
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	// 보너스 포인트 적립
		return price - (int)(price * saleRatio);	// 할인 가격 계산 후 반환
	}

}
