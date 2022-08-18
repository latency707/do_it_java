package constructor;

public class StudentTest {
	public static void main(String[] args) {
		Student Kim = new Student("Soong Kim", 27, 68);
		
		System.out.println(Kim.studentName);
		System.out.println(Kim.studentHeight);
		System.out.println(Kim.studentWeight);
	}

}
