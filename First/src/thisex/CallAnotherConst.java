/*
 * 생성자에서 다른 생성자를 호출하는 this

 * 클래스에 생성자가 여러 개 있을 때 어떤 생성자에서 다른 생성자를 호출하는 경우가 있음
 * 이때 this를 사용해 클래스의 생성자에서 다른 생성자를 호출할 수 있음
 * 
 * this로 다른 생성자 호출 시, this를 사용해 생성자를 호출하는 코드 이전에 다른 코드를 넣을 수 없음
 * 생성자는 클래스가 생성될 때 호출되기 때문에 this활용 문장이 가장 먼저와야 함
*/

// 다른 생성자 호출하기
package thisex;

class Person {
	String name;
	int age;
	
	// 디폴트 생성자 설정
	Person() {
		this("NoName", 1);	// this로 Person(String name, int age) 생성자 호출, 초기값 "NoName", 1 대입
	}
	
	// Person(String, int) 생성자
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
	

}
