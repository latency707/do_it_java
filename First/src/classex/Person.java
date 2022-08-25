/*
 * Class 클래스
 * 지금까지 변수를 선언할 때 자료형을 미리 파악하고 그 자료형에 따라 변수를 선언했음
 * 클래스를 사용할 때도 이미 그 클래스 정보(변수,메서드 등)를 알고 있는 상황에서 프로그램을 만들었음
 * 간혹 여러 클래스 중 상황에 따라 다른 클래스를 사용해야할 때나, 반환받는 클래스가 어떤 자료형인지 정확히 모를 떄가 있음
 * 이 경우 클래스 정보를 직접 찾아야하는데 이때 활용하는 것이 Class 클래스
 * 
 * Class 클래스 선언 후 클래스정보를 가져오는 방법은 3가지
 * 1. Object 클래스의 getClass() 메서드 사용
 * 	: 모든 클래스가 사용할 수 있는 메서드로, 생성된 인스턴스가 있어야 메서드 사용 가능
 * 		String s = new String();
 * 		Class = s.getClass(); // getClass() 메서드의 반환형은 Class
 *
 * 2. 클래스 파일명을 Class 변수에 직접 대입
 * 	: 컴파일된 클래스 파일이 있으면 클래스명만으로 반환
 * 		Class c = StringClass;
 * 
 * 3. Class.forName("클래스명") 메서드 사용
 * 	: 컴파일된 클래스 파일이 있으면 클래스명만으로 반환(2)
 * 		Class c = Class.forName("java.lang.String");
*/

// Person 클래스 생성
package classex;

public class Person {
	private String name;
	private int age;
	
	// 디폴트 생성자
	public Person() {}
	
	// name 만 입력받는 생성자
	public Person(String name) {
		this.name = name;
	}
	
	// name, age 를 입력받는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
