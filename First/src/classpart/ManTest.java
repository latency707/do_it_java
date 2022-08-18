

package classpart;

public class ManTest {
	public static void main(String[] args) {
		Man man1 = new Man();
		
		man1.setAge(40);
		man1.setPersonName("James");
		man1.setIsMarried(true);
		man1.setNoc(3);
		
		System.out.println(man1.getAge());
		System.out.println(man1.getPersonName());
		System.out.println(man1.getIsMarried());
		System.out.println(man1.getNoc());
	}

}
