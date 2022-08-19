
// 학번 출력하기
package staticex;

public class StudentTest4 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("Ji Won Lee");
		System.out.println(Student2.getSerialNum());	// static 변수 serialNum을 가져오기 위해 static getter로 직접 호출
		System.out.println(studentLee.studentName + " Serial:" + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("Soo Gyeong Son");
		System.out.println(Student2.getSerialNum());	// static 변수 serialNum을 가져오기 위해 static getter로 직접 호출
		System.out.println(studentSon.studentName + " Serial:" + studentSon.studentID);
	}

}
