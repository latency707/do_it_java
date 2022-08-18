// 분리된 학생 클래스 만들기
package reference;

public class Student3 {
	int studentID;
	String studentName;
	
	// Subject 형을 사용한 변수 선언
	Subject korean; // 호출 시에는 korean.subjectName, korean.scorePoint
	Subject math;	// 호출 시에는 math.subjectName, math.scorePoint

}
