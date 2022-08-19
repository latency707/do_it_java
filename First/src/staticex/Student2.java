/*
 * 클래스 메서드
 * 멤버변수를 위한 메서드가 존재하듯, static 변수를 위한 메서드도 존재함
 * 'static 메서드' 또는 '클래스 메서드' 라고 함
*/

// private serialNum getter, setter 메서드 사용하기
package staticex;

public class Student2 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 생성자
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}

	// getter
	public String getStudentName() {
		return studentName;
	}
	
	// setter
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// serialNum의 getter
	public static int getSerialNum() {
		int i = 10;
//		studentName = "Ji Won Lee";	// 오류 원인:studentName은 인스턴스생성될 때만들어지는 인스턴스 변수라 클래스 메서드에서는 참조할 수 없음
		return serialNum;	// serialNum은 스태틱 변수로 이미 생성되어 있어서 오류 x
	}
	
	// serialNum의 setter
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
