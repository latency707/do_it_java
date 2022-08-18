/*
 * 인스턴스와 참조변수
 * 객체, 클래스, 인스턴스
 * 객체란 '의사나 행위가 미치는 대상'
 * 클래스는 객체를 코드로 구현한 것
 * 인스턴스는 클래스가 실제로 사용할 수 있도록 메모리 공간에 생성된 상태
 * 
 * 클래스의 생성자를 호출하면 인스턴스가 만들어지고, 인스턴스는 여러개 생성할 수 있음
 * 예를 들면 학생은 하나의 개념이지만 학생인 사람(객체)는 여러 명인 것과 같은 개념
*/

// 인스턴스 여러개 생성하기
package classpart;

public class StudentTest1 {
	public static void main(String[] args) {
		// 학생1 생성
		Student student1 = new Student();
		student1.studentName = "A.Y.S";	// 멤버 변수 사용
		System.out.println(student1.getStudentName());	 // 메서드 사용
				
		// 학생 2 생성
		Student student2 = new Student();
		student2.studentName = "A.S.Y";	// 멤버 변수 사용
		System.out.println(student2.getStudentName());	// 메서드 사용
	}
	
	/*
	 * 참조변수를 사용하면 인스턴스의 멤버변수와 메서드를 참소하여 사용할 수 있는데,
	 * 이때 도트(.) 연산자를 사용함
	 * 참조번수.멤버변수 or 참조변수.메서드 형태로 쓰임
	 * 
	*/
	

}
