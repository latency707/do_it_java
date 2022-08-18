/*
 * 생성자 오버로드
 * 클래스에 생성자가 2개 이상 제공되는 경우를 생성자 오버로드라고 함
 * 생성자 오버로드를 활용하면 필요에 따라 매개변수가 다른 생성자를 여러 개 만들어 적절하게 사용할 수 있음
 * 
*/

package constructor;

public class Student {
	int studentID;
	String studentName;
	float studentHeight;
	float studentWeight;
	
	// 디폴트 생성자
	public Student() {}
	
	// 학번을 매개변수로 받아 Student 클래스를 생성하는 생성자
	public Student(int studentID) {
		this.studentID = studentID;
	}
	
	// 이름, 키, 몸무게를 매개변수로 받아 Student 클래스를 생성하는 생성자
	public Student(String studentName, float studentHeight, float studentWeight) {
		this.studentName = studentName;
		this.studentHeight = studentHeight;
		this.studentWeight = studentWeight;
	}
	// Q) Student 클래스에 이름, 키, 몸무게를 매개변수로 받는 생성자를 추가하시오
	// test 클래스에서 추가된 생성자로 인스턴스를 생성해보시오

}
