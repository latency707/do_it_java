/*
 *** 11장 연습문제
 *
 * Q1) 두 개의 인스턴스가 메모리는 다르더라도 논리적으로 동일하다는 것을 구현하는 Object의 메서드는 [equals() 메서드] 입니다.
 * Q2) 다음 두개의 String 변수를 연결할때 힙 메모리에 생성되는 String 인스턴스를 그려보세요
 * 	String a = new String("abc");
 * 	String d = new String("def");
 * 	String a = a+b;
 * A) 1["abc"], 2["def"] -> 1["abc"], 2["def"], 3["abcdef"]
 * Q3) 기본 자료형을 멤버 변수로 포함하여 메서드를 제공함으로써 기본자료형의 객체를 제공하는 클래스를 [Wrapper 클래스]라고 합니다.
 * Q4) 다음 코드으 ㅣ출력결과가 '진돗개 멍멍이'가 되도록 MyDog 클래스를 수정하세요.
 * A) 아래 바디에 작성
 * Q5) 자바에서 클래스의 동적 로딩 방식을 제공하는 메서드는 [Class.forName()] 입니다.
*/

package chapter11practice;

class MyDog {
	String name;
	String type;
	
	
	MyDog(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return name + " " + type;
	}
		
}

public class Q1toQ5 {
	public static void main(String[] args) {
		MyDog dog = new MyDog("멍멍이", "진돗개");
		System.out.println(dog);
		
	}

}
