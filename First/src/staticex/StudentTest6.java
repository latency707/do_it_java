// Student3 에서 만든 카드번호 출력하기
package staticex;

public class StudentTest6 {
	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("Ji Won Lee");
		System.out.println(studentLee.studentName + " Card_Number: " + studentLee.cardNum);
		
		Student3 studentSon = new Student3();
		studentSon.setStudentName("Soo Gyeong Son");
		System.out.println(studentSon.studentName + "Card_Number: " + studentSon.cardNum);
		
	}

}
