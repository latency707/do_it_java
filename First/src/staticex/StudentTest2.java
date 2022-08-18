
// 학번 확인하기
package staticex;

public class StudentTest2 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("Ji Won Lee");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " ID:" + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("Soo Gyeong Son");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.studentName + " ID:" + studentSon.studentID);
	}

}
