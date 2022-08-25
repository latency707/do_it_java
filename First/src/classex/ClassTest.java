// Person의 Class 클래스 가져오기
package classex;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException { // 이름이 일치하는 클래스가 없는 경우 발생하는 에러 예외처리
		Person person = new Person();
		Class pClass1 = person.getClass(); // Object의 getClass() 메서드 사용
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class; // 직접 class 파일 대입
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person"); // 클래스 이름으로 가져오기("" 문자열값)
		System.out.println(pClass3.getName());
	}

}
