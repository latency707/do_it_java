/*
 ** newInstance() 로 클래스 생성하기
 * Class 클래스로 확인한 정보를 바탕으로 인스턴스도 생성할 수 있음
 * Class 클래스의 newInstance() 메서드로 인스턴스를 생성함
 * newInstance() 메서드는 항상 Object를 반환하므로 생성된 객체형으로 형변환이 필요함
 * 
 ** Class.forName() 으로 동적 로딩하기
 * 여러 종류의 DB를 지원하는 어떤 시스템이 있는데, 다양한 DB를 연동할 수 있다고 해서 시스템 컴파일 시에 모든 DB 라이브러리를 컴파일할 필요는 없음
 * 시스템 구동 시에 연결할 DB에 해당하는 드라이버만 로딩하면 됨
 * 즉, 프로그램 실행 이후 클래스의 로딩으로 연결할 라이브러리를 결정할 수 있는 '동적 로딩' 방식을 사용하면 됨
 * 
 ** forName() 메서드는 매개변수로 문자열을 입력받음
 * Class pClass = Class.forName("classex.Person");
 * 이떄 입력받는 문자열을 변수로 선언하여 변수 값만 바꾸면 다른 클래스를 로딩할 수 있음
 * String className = "classex.Person"; // className 변수에 원하는 임의의 문자열을 대입하면 동적 로딩 가능 
 * Class pClass = Class.forName(className);
 * 
 ** forName() 메서드 사용시 유의점
 * forName("클래스 이름")을 문자열 값으로 받기때문에 문자열에 오류(오탈자)가 있어도 컴파일할 때는 오류를 알 수 없음
 * 
 * 
 * 
*/

// Person 클래스의 인스턴스 생성하기
package classex;

public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person(); // 생성자로 인스턴스 생성
		System.out.println(person1);
		
		Class pClass = Class.forName("classex.Person");
		Person person2 = (Person)pClass.newInstance(); // newInstance() 메서드로 인스턴스 생성
		System.out.println(person2);
		

	}

}
