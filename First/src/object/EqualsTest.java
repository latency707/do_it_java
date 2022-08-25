/*
 * equals() 메서드
 * equals()메서드의 원래 기능은 두 인스턴스의 주소값을 비교하여 T/F 값으로 반환해 주는 것
 * 주소값이 같다면 당연히 같은 인스턴스이나, 서로 다른 주소값을 가질 때도 같은 인스턴스라 정의할 수 있는 경우가 있음
 * 따라서 물리적 동일성 뿐 아니라 논리적 동일성을 구현할 때도 equals() 메서드를 재정의하여 사용함
 * 
 * Object 클래스의 equals() 메서드
 * 참조 변수가 2개 있을 때, 두 인스턴스가 물리적으로 같다는 것은 두 인스턴스의 주소값이 같은 경우, 즉 두 변수가 같은 메모리주소를 가리키고 있다는 것을 말함
 * 예시1)
*/

package object;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	// 학생의 이름과 학번이 출력되도록 toString() 메서드 재정의
	@Override
	public String toString() {
		return studentId + ", " +studentName;
	}
	
	
	// equals() 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)	// 학생이 학번이 같으면 true 반환
				return true;
			else return false;
		}
		return false;
	}
	
	// hashCode() 메서드 재정의
	@Override
	public int hashCode() {
		return studentId;
	}
	
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee sang won");
		Student studentLee2 = studentLee;	// 주소 복사
		Student studentSang = new Student(100, "Lee sang won");
		// studentLee -> studentId:100, studentName:Lee Sang Won <- studentLee
		// studentSang -> studentId:100, studentName:Lee Sang Won
		// studentLee,StudentLee2 가 가리키는 인스턴스와 studentSang 이 가리키는 인스턴스는 각각 다르지만 저장된 정보는 같음. 이런 경우를 논리적으로 동일하다고 함
		
		
		
		// 동일한 주소의 두 인스턴스 비교ㅗ
		if(studentLee == studentLee2)	// == 기호로 비교
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if(studentLee.equals(studentLee2))	// equals() 메서드로 비교
			System.out.println("studentLee와 studentLee2는 동일합니다");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		
		// 동일인(지닌 값이 같음)이지만 인스턴스 주소가 다른 경우
		if(studentLee == studentSang)	// == 기호로 비교
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		
		if(studentLee.equals(studentSang))	// equals() 메서드로 비교
			System.out.println("studentLee와 studentSang은 동일힙니다.");
		else
			System.out.println("studnetLee와 studentSang은 동일하지 않습니다.");
		
	}

}
