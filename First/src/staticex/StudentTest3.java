/*
 * static 변수는 클래스 선언때 먼저 만들어 지므로, 
 * 인스턴스가 아닌 클래스 이름으로도 참조하여 사용할 수 있음
 * 이러한 특성으로 static 변수를 클래스변수라고도 함
*/

// 클래스 이름으로 static 변수 참조하기
package staticex;

public class StudentTest3 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("Ji Won Lee");
		System.out.println(studentLee.serialNum);	// 밑줄은 오류가 아닌 지역변수가 아닌 static 변수를 클래스 이름으로 직접 참조하라는 의미 
		System.out.println(studentLee.studentName + " ID:" + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("Soo Gyeong Son");
		System.out.println(Student1.serialNum); // studentSon이 아닌 Student1로 참조
		System.out.println(studentLee.studentName + " ID:" + Student1.serialNum);	// studentSon이 아닌 Student1로 참조
	}

}
