/*
 * 05장 연습문제
 * Q1) 클래스를 생성할 때 호출하는 [생성자] 는 멤버변수를 초기화하는데 사용합니다.
 * Q2) 클래스를 생성하여 메모리에 있는 상태를 [인스턴스]라 하고 멤버 변수를 다른 말로 [인스턴스 변수]라고 합니다.
 * Q3) [메서드]는 일반 함수에 객체 지향의 개념을 추가하여, 클래스 내부에 선언하고 클래스 멤버 변수를 사용하여 클래스 기능을 구현합니다.
 * Q4) 05-7 예제 MyDate 와 MyDateTest 클래스를 완성해보자
 * 
*/

package reference;

public class Practice1 {
	private int day;
	private int month;
	private int year;
	
	// getter
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	// setter
	public void setDay(int pday) {
		this.day = pday;
	}
	public void setMonth(int pmonth) {
		this.month = pmonth;
	}
	public void setYear(int pyear) {
		this.year = pyear;
	}
	
	// 생성자
	public Practice1(int pday, int pmonth, int pyear) {
		day = pday;
		month = pmonth;
		year = pyear;
	}
	
	// isValid Method
}
