/*
 * 상수 선언하기
 * 1년은 12개월, 1주일은 7일이라는 값은 변하지 않음
 * 이렇게 항상 변하지 않는 값을 '상수(constant)'라고 함
 * 상수는 주로 프로그램 내부에서 반복적으로 사용하고, 변하지 않아야 하는 값으로 쓰임
 * 자바에서는 final 예약어를 사용해 상수를 선언함
 * 
 * 상수명은 주로 대문자를 사용하고 여러 단어를 연결하는경우 언더바(_)를 사용해 가독성을 향상함
 * 최초 선언된 값은 변하지 않으므로 선언과 동시에 값을 지정하는 것이 좋음
 * 
 * 리터럴(LITERAL)
 * 리터럴이란 프로그램에서 사용하는 모든 숫자, 문자, 논리값(T/F) 을 일컫는 말 (ex- 'A', 10, 3.14)
 * 변수나 상수 값으로 대입할 수 있음
 * 리터럴은 프로그램이 시작할 때 시스템에 같이 로딩되어 특정 메모리공간인 상수 풀(constant pool)에 놓임
 * 값이 변수에 바로 대입되지 않고 먼저 상수 풀에 값을 쓰고 상수 풀에 저장된 값을 변수 메모리에 복사하는 식
 * 
*/

// 상수 사용하기
package chapter02;

public class Constant {
	public static void main(String[] args) {
		// 최소값 최대값 상수
		final int MAX_NUM = 100; // 선언과 동시에 값 100으로 초기화
		final int MIN_NUM;
		
		MIN_NUM = 0; // 사용 전에 초기화. 초기화 하지 않을 시 오류 발생
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		// MAX_NUM = 1000; // 오류 발생 
		
		// 나이 상수
		final int MY_AGE = 33;
		System.out.println("나이: " + MY_AGE);
		
	}

}
