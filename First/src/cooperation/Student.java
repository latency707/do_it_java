/*
 * 객체 간 협력
 * 객체 지향 프로그램은 객체를 정의하고 객체간 협력으로 만듦
 * 
 * 실제로 객체의 협력은 어떻게 이뤄지는가
 * ex)
 * 학생, 버스, 지하철 클래스 간에 학생의 버스나 지하철 이용
 * 학생의 소지금, 버스 및 지하철의 수익, 이용 학생 수 증가
 * 등 객체 간에 서로 어떤 값을 주고받고 메서드를 호출하는 식
*/

// 학생 클래스 구현하기
package cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	// 학생이름, 돈을 매개변수로 받는 생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 학생이 버스를 타면 1000원을 지불하는 기능의 메서드
	public void takeBus(Bus bus) {	// 클래스 Bus 자료형
		bus.take(1000);				// 버스가 1000 원을 가짐
		this.money -= 1000;			// 학생 돈 차감
	}
	
	// 학생이 지하철을 타면 1500원을 지불하는 기승의 메서드
	public void takeSubway(Subway subway) {
		subway.take(1000);
		this.money -= 1500;
	}
	
	// 학생의 현재 정보를 출력하는 메서드
	public void showInfo() {
		System.out.println(studentName + "'s balance is " + money + ".");
	}

}
