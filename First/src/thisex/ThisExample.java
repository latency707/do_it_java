/*
 * this 예약어
 * 생성된 인스턴스 자신의 메모리를 가리키는 예약어 this
 * 
*/

package thisex;

class BirthDay {
	int day;
	int month;
	int year;
	
	// 출생년도 지정 메서드
	public void setYear(int year) {
		this.year = year;	// this.year 은 BDay.year과 동일
	}

	// this 출력 메서드
	public void printThis() {
		System.out.println(this); // sysout(BDay) 와 동일
	}
	
}

public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
	}
}
