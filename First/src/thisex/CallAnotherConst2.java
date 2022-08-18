/*
 * 자신의 주소를 반환하는 this
 * this를 사용해 생성된 클래스 자신의 주소값을 반환할 수 있음
 * 인스턴스 주소값을 반환할 때는 this를 사용하고 반환형은 클래스 자료형 사용
*/

package thisex;

class Person2 {
	String name;
	int age;
	
	Person2() {
		this("NoName", 1);
	}
	
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 클래스형 Person 자체를 반환하는 메서드
	Person2 returnItSelf() {
		return this;
	}
}

public class CallAnotherConst2 {

	public static void main(String[] args) {
		Person2 noName = new Person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person2 p = noName.returnItSelf();	// this 값을 클래스 변수에 대입
		System.out.println(p);				// noName.returnItSelf() 반환값 출력
		System.out.println(noName);			// 참조 변수 출력

	}

}
