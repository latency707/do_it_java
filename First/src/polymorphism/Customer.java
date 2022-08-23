/*
 * 다형성을 활용해 VIP 클래스 완성하기
*/

// 고객관리 프로그램 완성하기
package polymorphism;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	public int bonusPoint;			// witharraylist 패키지 상속 실행하려고 public 예약해봄
	protected double bonusRatio;
	
	public Customer() {
		initCustomer();	// 고객 등급과 보너스 포인트 적립률 지정함수 호출
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();	// 고객 등급과 보너스 포인트 적립률 지정함수 호출
	}
	
	// 생성자에서만 호출하는 메서드이므로 private 선언
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	
	// getter & setter
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
	
	
}
