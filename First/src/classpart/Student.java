/*
 * 클래스와 인스턴스
 * 클래스를 사용해 프로그램을 실행하려면 먼저 main() 함수를 알아야 함
 * main()함수는 자바가상머신(JVM)이 프로그램을 시작하기 위해 호출하는 함수
 * 
 * 함수에서 클래스를 사용하는 방법은 2가지
 * 생성한 클래스 내부에 main() 함수를 만드는 것
 * 외부에 테스트용 클래스를 만들어 사용하는 것
*/

// 생성한 Student 클래스에 main() 함수 포함하기
package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student(); // 클래스 생성
		studentAhn.studentName = "Yeon Soo Ahn";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
