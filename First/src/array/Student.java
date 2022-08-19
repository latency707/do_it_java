/*
 * Q) 객체 배열 만들어 활용하기
*/

package array;

public class Student {
	private int studentID;
	private String name;
	
	public Student() {}
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + ", " + name);
	}

}
