
// StudentArray 클래스 만들기
package array;

public class StudentArray {
	public static void main(String[] args) {
		Student[] sList = new Student[3];
		
		sList[0] = new Student(1001, "James");
		sList[1] = new Student(1002, "Tomas");
		sList[2] = new Student(1003, "Edward");
	
		for(int i = 0 ; i < sList.length ; i++) {
			sList[i].showStudentInfo();
		}
	}
}
