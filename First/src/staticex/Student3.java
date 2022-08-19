/*
 * static 변수와 static 메서드 연습
 * Q) 학생카드를 발급하는 프로그램을 구현하시오. 학생카드 속성은 다음과 같다
 * 카드번호 = 학번 + 100
 * Student3 클래스를 만들어 기존 클래스에 학생카드번호 멤버변수를 추가하고,
 * 학생이 생성될 때마다 학생카드 번호를 부여하시오
 * 
 * StudentTest6 클래스를 만들어 학생 2명을 생성한 후 카드번호를 출력해보시오
 * 
*/

package staticex;

public class Student3 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	int address;
	int cardNum;
	
	public Student3() {
		serialNum++;
		studentID = serialNum;
		cardNum = serialNum + 100;
		}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}
}
