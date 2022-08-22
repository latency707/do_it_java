/*
 * 상속
 * B 클래스가 A 클래스를 상속 받으면 B클래스는 A 클래스의 멤버변수와 메서드를 사용할 수 있음.
 * 이렇게 기존의 클래스가 가지고 있는 속성이나 기능을 추가로 확장하여 B클래스를 구현하는 것을 상속이라고 함
 * 
 * 코드로 표현하면 다음과 같다
 * class B extends A {}
 * 
 * 상속을 받는 클래스인 B를 하위클래스, 상속을 하는 클래스 A를 상위 클래스라고 함
 * 상위 클래스가 보다 일반적인 개념이고 하위클래스는 상위클래스보다 구체적임
*/

// 상속을 사용해 고객관리 프로그램 구현하기
// 1. Customer 클래스 구현
package inheritance;

public class Customer {
	// 멤버 변수
	protected int customerID;		// 상속받은 하위클래스에서 변수에 접근할 수 있도록
	protected String customerName;	// private 예약어를 일괄적으로 protected 예약어로 변경
	protected String customerGrade;	// 또한 변경한 변수를 사용하기 위해 getter, setter를 아래에 추가
	int bonusPoint;
	double bonusRatio;
	
	// 디폴트 생성자 
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");	// 상위 클래스 생성시 콘솔 출력문
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
