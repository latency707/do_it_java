/*
 * 정보은닉
 * 클래스 내부에서 사용할 변수나 메서드를 private으로 선언해서, 
 * 외부에서 접근하지못하게 하는 것을 객체 지향에서는 '정보은닉' 이라고 함
 * 
 * 변수를 public으로 선언하는 것과 private로 선언한 후 public 메서드로 제공하는 것의 차이는??
 * 외부 클래스에서 public 변수에 접근하면 값을 마음대로 입력할 수 있어 정보의 오류가 발생할 수 있음
 * ex-2월을 구현하다가 총 날짜를 31일로 대입하는 경우 정보에 오류가 생김
 * 
 * 자바의 접근제어자 정리
 * public : 외부 클래스 어디에서나 접근 가능
 * protected : 같은 패키지 내부와 상속관계 클래스에서만 접근 가능
 * 미지정 : default로 같은 패키지 내부에서만 접근 가능
 * private : 같은 클래스 내부에서만 접근 가능
 * 
 * 
 * 
 * Q) Student 와 StudentTest 클래스로 접근제어자 테스트 해보기
 * chapter5 프로젝트 폴더 하부에 test 패키지 생성 후 StudentTest 클래스 이동,
 * 이 때 StudentTest 클래스에 발생하는 오류를 Student 멤버 변수 접근제어자 변경으로 수정하시오
 * A) private studentName 을 protedted studentName 으로 변경
*/

// private 변수 테스트해보기
package test;

import reference.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "Sang Won Lee"; // 오류 발생
		
		// private 변수에 접근하기
		studentLee.setStudentName("Sang Won Lee");
		
		System.out.println(studentLee.getStudentName());
	}

}
