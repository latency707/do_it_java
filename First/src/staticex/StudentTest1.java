
// static 변수 테스트하기
package staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("Ji Won Lee");
		System.out.println(studentLee.serialNum);	// serialNum 변수 초기값
		studentLee.serialNum++;	// static 변수 값 증가
	
		Student studentSon = new Student();
		studentSon.setStudentName("Soo Gyeong Son");
		System.out.println(studentSon.serialNum);	// 증가된 값 1001 출력
		System.out.println(studentLee.serialNum);	// 증가된 값 1001 출력
	}
}
