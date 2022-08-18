	/*
	 * 메서드
	 * 자바 프로그램에는 클래스 내부에서 사용하는 멤버함수가 있음
	 * 메서드는 멤버변수를 사용해 클래스의 기능을 구현함
	 * 즉, 메서드는 함수에 객체 지향 개념이 포함된 용어
	*/
	
package classpart;

public class StudentAdv2 {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 학생의 이름을 반환하는 메서드
	public String getStudentName() {
		return studentName;
	}
	
	// 학생의 이름을 부여하는 메서드
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		StudentAdv2 stdt = new StudentAdv2();
		stdt.setStudentName("Kim");
		
		System.out.println(stdt.getStudentName());
	}

}
