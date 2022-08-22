/*
 * 가상 메서드
 * 자바의 클래스는 멤버 변수와 메서드로 이뤄져 있음
 * 클래스 생성으로 인스턴스가 만들어지면 멤버변수는 힙메모리에 위치함(번외- 지역변수는 스택 메모리에 위치)
 * 
 * 메서드는 어디에??
 * 변수는 인스턴스가 생성될 때마다 새로 생성되지만, 메서드느 실행해야할 명령의 집합이기 때문에 인스턴스가 달라도 같은 로직을 수행함
 * 즉 같은 객체의 인스턴스를 여러개 생성한다고 해서 메서드가 여러개 생성되는 것이 아님
 * 메서드의 명령집합은 메서드 영역(코드 영역)에 위치하고 메서드 호출이 발생하면 메서드 영역의 주소를 참조하여 명령이 실행되는 것
*/

// 매서드 호출하기
package virtualfunction;

public class TestA {
	int num;
	
	void aaa() {
		System.out.println("aaa() print");
	}
	
	public static void main(String[] args) {
		TestA a1 = new TestA();
		a1.aaa();
		TestA a2 = new TestA();
		a2.aaa();
	}

}
