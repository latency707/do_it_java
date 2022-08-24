/*
 * 인터페이스
 * 인터페이스는 클래스 혹은 프로그램에 제공하는 기능을 명시적으로 선언하는 역할을 ㅎㅁ
 * 인터페이스는 구현코드 없이 추상메서드와 상수로만 이뤄져있음
 * 따라서 인터페이스로는 인스턴스를 생성할 수 없음
 * 
 * 인터페이스의 특징
 * 인터페이스에서 선언한 함수는 컴파일 과정에서 상수로 자동변환됨
 * 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 자동변환됨
*/

// Calc 인터페이스 만들어보기
package interfaceex;

public interface Calc {
	// 인터페이스에서 선언한 변수
	double PI = 3.14;		// 인터페이스에서 변수를 선언하면 자동으로 상수로 컴파일됨|
	int ERROR = -999999999;	// 인터페이스에서 변수를 선언하면 자동으로 상수로 컴파일됨|
	
	// 인터페이스에서 선언한 메서드
	int add(int num1 ,int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	// 319pQ) int square(int num) 메서드 추가로 선언 및 ComplecteCalc 클래스에서 구현후 메서드 호출까지 할것
	int square(int num);
	
	// 인터페이스에 디폴트 메서드 선언하기
	default void description() {
		/*
		 * 디폴트 메서드란 인터페이스 구현한 클래스가 생성되면 그 클래스에서 기본적으로 사용할 수 있는 메서드임
		 * 디폴트 메서드는 인터페이스 바디에서 구현하며 default 예약어를 통해 선언한다
		 * 디폴트 메서드는 하위 클래스에서 필요에 맞게 재정의할 수 있음
		*/
		System.out.println("정수 계산기를 구현합니다.");
		// 디폴트 메서드에서 private 메서드 myMethod() 호출
		myMethod();
	}
	
	/*
	 * 정적 메서드
	 * 정적 메서드는 static 예약어로 선언하며 클래스 생성과 무관하게 사용 가능
	 * 사용은 인ㅌ페이스 이름으로 직접 참조하여 사용
	*/
	// 정적 메서드 구현하기
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();	// 정적 메서드에서 private static 메서드 호출
		return total;
	}

	// private 메서드 myMethod()
	private void myMethod() {
		System.out.println("It's private method.");
	}
	
	// private static 메서드 myStaticMethod()
	private static void myStaticMethod() {
		System.out.println("It's private static method.");
	}
}
