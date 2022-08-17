/*
 * 클래스 기능을 구현하는 메서드
 * 클래스에서는 객체가 가지는 속성을 사용해 관련된 기능을 구현할 수 있음
 * ex- 학생에게 이름 부여하기, 학생 거주지 출력하기 등
 * 이렇게 클래스 내부에서 멤버변수를 사용해 기능을 구현한 것을 '메서드' 또는 '멤버함수' 라고 함
*/

// 학생 이름과 주소 출력하는 메서드 만들기
package classpart;

public class StudentAdv {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 메서드 추가
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}

}
