/*
 * 생성자
 * 클래스를 생성할 때 사용하는 Person personLee = new Person()에서 Person() 같은 함수를 생성자라고 함
 * 클래스를 처음 만들 때 멤버 변수나 상수를 초기화하는 역할
 * 
 * 디폴트 생성자
 * 클래스 내에 생성자 함수가 정의되어 있지 않아도 자바 컴파일러에서 자동으로 생성자를 만들어 줌
 * 이 자동 생성자를 디폴트 생성자라고 하며, 매개변수도 없고 구현코드도 없음
 * 
 * 디폴트 생성자를 직접 만드는 경우 필요에 따라 직접 코드로 구현할 수도 있음
*/

// 생성자 만들기 
package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	
	// 직접 생성자 작성 및 추가
	public Person() {} // 클래스에 디폴트 생성자를 별도로 구현하지 않으면 이 형태로 자동 생성
	
	public Person(String pname) {
		name = pname;	// 사람 이름을 매개변수로 받아 Person 클래스를 생성하는 생성자
	}
}
