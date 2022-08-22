// VIPCustomer 클래스 구현하기
package inheritance;

public class VIPCustomer extends Customer{	// VIPCustomer 클래스는 Customer 클래스를 상속받음
	private int agentID;	// VIP고객 상담원 ID
	double saleRatio;		// 특별 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";	// 상위 클래스에서 private 변수이므로 외부 클래스에서 사용할 수 없음, private을 protected 로 바꿀 경우 상속된 하위 클래스에서는 변수를 public처럼 사용할 수 있음
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출 ");
	}
	
	public int getAgentID() {
		return agentID;
	}

}
