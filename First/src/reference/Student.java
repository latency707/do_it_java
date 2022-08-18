/*
 * 정보 은닉
 * 접근 제어자
 * 객체 지향 프로그램에서는 예약어를 사용해 클래스 내부의 변수나 메서드, 생성자에 대한 접근 권한 지정이 가능
 * 이를 '접근 제어자'라고 함
 * 접근 권한은 public, private 등의 예약어로 설정이 가능함 
 * 
 * 접근 제어자를 private로 선언한 변수나 메서드는 외부 클래스에서의 접근이 허용되지 않음 
 * 이 때, private 변수가 있는 클래스 내부에,
 * 학생 이름을 받아오거나 지정할 수 있는 메서드를 추가하는 식으로 외부에서 사용할 수 있다
 * 
 * public get(), public set() 
*/

// private 사용해보기
package reference;

public class Student {
	int studentID;
	protected String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
