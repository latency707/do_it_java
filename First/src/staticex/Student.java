/*
 * static 변수
 * 인스턴스가 생성될 때마다 따로 생성되는 변수가 아닌, 클래스 전반에서 공통으로 사용할 수 있는 기준변수가 필요함
 * 이때 클래스에서 공통으로 사용하는 변수를 'static 변수'로 선언함
 * static 변수란 '정적 변수' 와 같은 말로, 프로그램이 실행되어 메모리에 올라갔을 때 딱 1회만 메모리 공간이 할당되고 그 값을 모든 인스턴스가 공유함
 * 
*/

// static 변수 사용해서 새로 생성되는 학생에게 학번을 차례로 부여하는 프로그램 만들기
package staticex;

public class Student {
	public static int serialNum = 1000;	// static 변수는 인스턴트 생성 전에 먼저 생성됨
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}
}
