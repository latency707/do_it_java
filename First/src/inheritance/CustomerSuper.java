/*
 * super 예약어로 매개변수가 있는 생성자 호출
 * Customer 클래스 생성 시 고객ID와 이름을 반드시 지정해야 하는 규칙을 만들 경우, 
 * 	set() 메서드가 아닌 새로운 생성자를 직접 구현한 후 매개변수로 값을 전달받아야 함
*/

// 상속을 사용해 고객관리 프로그램 구현하기
// 1. Customer 클래스 구현
package inheritance;

public class CustomerSuper {
	// 멤버 변수
	protected int customerID;		// 상속받은 하위클래스에서 변수에 접근할 수 있도록
	protected String customerName;	// private 예약어를 일괄적으로 protected 예약어로 변경
	protected String customerGrade;	// 또한 변경한 변수를 사용하기 위해 getter, setter를 아래에 추가
	int bonusPoint;
	double bonusRatio;
	
	// 디폴트 생성자 
//	public CustomerSuper() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Customer() 생성자 호출");	// 상위 클래스 생성시 콘솔 출력문
//	}
	
	
	// 새로운 생성자 추가
	public CustomerSuper(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("CustomerSuper(int, String) 생성자 호출");
	}
	
	

	// 보너스 포인트 계산 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	// 고객 정보 반환 메서드
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + " 입니다.";
	}
	
	// 여기에 기본적인 Customer의 속성과 기능을 지닌 채 별도의 추가속성과 기능을 지닌 VIP 고객등급을 상속으로 구현할 수 있음
	
	
	
	// protected 변수용 getter/setter
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
