// 버스 클래스 구현
package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("Bus no." + busNumber + "'s total passenger is " + passengerCount + ", total sales are " + money + " won.");
		
	}
}
