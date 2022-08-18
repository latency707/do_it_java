// 지하철 클래스 구현
package cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	// 지하철 노선번호를 매개변수로 받는 생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 지하철 매출과 승객수을 계산하는 메서드 
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "'s total passenger is " + passengerCount + ", total sales are " + money + " won.");
	}

}
