// MyDaye 클래스 equals() 메서드 재정의
// 날짜가 같으면 System.out.println(date1.equals(date2)); 의 출력값이 true 가 되도록 할것
package object;

class MyDate{
	// 멤버 변수
	int day;
	int month;
	int year;
	
	// 생성자
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	// equals() 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate md = (MyDate)obj;
			if(this.day == md.day && this.month == md.month && this.year == md.year)
				return true;
			else return false;
		}
		return false;
	}
	
	// hashCode() 메서드 재정의
	@Override
	public int hashCode() {
		return Integer.parseInt(year + 	"" + month + "" + day)	;
	}
}

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(18, 9, 2004);
		MyDate date2 = new MyDate(18, 9, 2004);
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		
	}

}
