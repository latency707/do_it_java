package array;
import java.util.ArrayList;

public class StudentArrayListTest {
	public static void main(String[] args) {
		ArrayList<Student> sList1 = new ArrayList<Student>();
		
		sList1.add(new Student(1001, "James"));
		sList1.add(new Student(1002, "Tomas"));
		sList1.add(new Student(1003, "Edward"));
		
		for (int i = 0 ; i < sList1.size(); i++) {
			Student student = sList1.get(i);
			student.showStudentInfo();
		}
		System.out.println( );
		
		System.out.println("=== Enhanced For Loop ===");
		for(Student student : sList1) {
			student.showStudentInfo();
		}
	}

}
