/*
 * main()함수를 포함한 실행 클래스 따로 만들기
*/

// Student 클래스 실행용 클래스
package classpart;

public class StudentTest {
	public static void main(String[] args) {
		Student studentAhn = new Student(); // new 예약어로 클래스 생성
		studentAhn.studentName = "Seung Yeon Ahn";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
