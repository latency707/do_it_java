// Person 생성자 테스트
package constructor;

public class PersonTest {
	public static void main(String[] args) {
		
		Person personKim = new Person(); // Person(); 디폴트 생성자
		Person personLee = new Person("Law Lee"); // Person(); 수동? 생성자
		
		System.out.println(personKim);
		System.out.println(personLee.name);
	}

}
