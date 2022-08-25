/*
 * java.lang 패키지
 * 지금까지 자바 프로그래밍을 하면서 별도의 구현 없이 String, Integer 같은 클래스를 사용했음
 * 그 클래스들은 java.lang 패키지에 속해있는 클래스로, 기본적으로 많이 사용하는 클래스들이 포함되어 있음
 * 자바에서는 외부패키지의 클래스를 사용할 때 import 문으로 클래스, 패키지를 선언해야함
 * 그러나 java.lang 패키지는 컴파일할 때 import 문장이 자동으로 추가되어 참조하는 구조
 * 
 * 최상위 클래스 Object
 * Object 클래스는 모든 자바 클래스의 최상위 클래스임
 * 모든 클래스는 컴파일 과정에서 자동으로 Object 클래스를 상속받음
 * JDK 자체 제공 클래스 또한 Object 클래스의 상속을 받음
 * Object 클래스의 모든 메서드를 재정의할 수 있는 것은 아님
 * 
 * Object 주요 메서드
 * STring toString() : 객체를 문자열로 표현해 반환. 재정의하여 객체 설명이나 특정 멤버변수값 반환에 쓰임?
 * boolean equals(Object obj) : 두 인스턴스의 일치 여부 반환. 재정의하여 논리적으로 동일한 인스턴스임을 정의 가능 
 * int hasCode() : 객체의 해시코드 값을 반환
 * Object clone() : 객체를 복제해 동일한 멤버변수 값을 가진 새로운 인스턴스 생성
 * Class getClass() : 객체의 Class 클래스 반환
 * void finalize() : 인스턴스가 힙메모리에서 제거될 때 가비지 컬렉터에 의해 호출되는 메서드. 네트워크 연결 해제, 열려있는 파일 스트림 해제 등 을구현
 * void wait() : 멀티스레드 프로그램에서 사용하는 메서드. 스레드를 '기다리는 상태'(non runnable)로 만듦
 * void notify()  : wait() 메서드에 의해 기다리고 잇는 스레드를 실행가능한 상태로(runnable) 가져옴
*/

package object;

public class AboutObject {
	public static void main(String[] args) {
		
	}

}
