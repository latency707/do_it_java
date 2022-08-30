/*
 ** 익명 내부 클래스
 * 익명 내부 클래스는 단 하나의 인터페이스 또는 단 하나의 추상 클래스를 바로 생성할 수 있음
 * 그런데 인터페이스는 인스턴스로는 생성할 수 없고 인터페이스의 몸체(body) 가 필요함
 * 인터페이스에서 반드시 구현해야하는 메서드를 구현해 익명클래스 형식으로 새롭게 선언하는 식
 * 인터페이스나 추상클래스 자료형으로 변수를 선언한 후 익명 내부 클래스를 생성해 대입할 수도 있음
 * 
 *  *** 정리
 *  익명 내부 클래스는 변수에 직접 대입하는 경우도 있고 메서드 내부에서 인터페이스나 추상클래스를 구현하는 경우도 있음
 *  이때 사용하는 지역변수는 상수화되므로 메서드 호출이 끝난 후에도 사용할 수 있음
 *  
 *  익명 내부 클래스의 용도??
 *  과거에는 자바 UI에서 이벤트를 처리하는 데 많이 사용했음
 *  현재는 안드로이드 프로그래밍에서 위젯의 이벤트 처리 핸들러 구현에 쓰임
 *  위젯이란 사용자가 터치하거나 키값을 입력하면 이벤트를 일으키는 버튼이나 텍스트상자 등을 지칭함
*/

// 지역내부클래스 MyRunnable에서 클리스 이름 선언을 생략한 익명 내부 클래스 예제
package innerclass;

class Outer2 {
	Runnable getRunnable(int i) {
		int num = 100;
		
		// MyRunnable 클래스명 없이 클래스를 즉시 생성하는 방법
		return new Runnable() {	// 익명 내부 클래스. Runnable 인터페이스 생성
			@Override
			public void run() {
				// num = 200;
				// i = 10;
				System.out.println(i);
				System.out.println(num);
			}
		}; // 클래스 끝에 ; 를 써야함 
		
	}
	// 인터페이스나 추상 클래스형 변수를 선언하고 클래스를 생성해 대입하는 방법
	Runnable runner = new Runnable() { // 익명 내부 클래스를 변수에 대입
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	}; // 클래스 끝에 ; 입력
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		out.runner.run();
	}
}
