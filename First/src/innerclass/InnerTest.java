/*
 ** 내부 클래스
 * 내부 클래스는 말 그대로 '클래스 내부에 선언한 클래스'
 * 클래스를 클래스 내부에 선언하는 이유는 대개 두 클래스가 밀접한 관련이 있기 때문
 * 또한 그 밖의 다른 클래스와는 협력할 일이 없는 경우에 내부 클래스를 사용함
 * 
 **내부 클래스의 간략한 표현
 * Classo Out {
 * 		class In { body } 
 * }
 * 
 * 내부 클래스는 선언하는 위치에 따라 클래스 내부에 선언할 수 있는 변수 유형이 다름
 * 내부 클래스 유형에 따라 사용할 수 있는 외부클래스 변수유형도 다름
 * 인스턴스 내부 클래스
 * 정적 내부 클래스
 * 지역 내부 클래스
 * ===== 이 3종류는 클래스 내부에 선언하는 변수의 유형과 유사함
 * 익명 내부 클래스
 * ===== 익명 내부 클래스는 클래스 이름 없이 선언하고 바로 생성하여 사용할 수 있음
 * 
 ** 인스턴스 내부 클래스
 * 인스턴스 내부 클래스는 인스턴스 변수를 선언할 때와 같은 위치에 선언함
 * 외부 클래스 내부에서만 생성해 사용하는 객체를 선언할 때 사용함
 * 클래스 내의 여러 변수들 중 다른 외부클래스에서 사용할 일이 없는 일부 변수를 모아 내부 인스턴스 클래스로 정의함
 * 인스턴스 내부 클래스는 생성순서로 인해 외부 클래스를 먼저 생성하지 않고는 사용할 수없음
*/

// 인스턴스 내부 클래스 예제
package innerclass;

class OutClass {					// 외부 클래스
	private int num = 10;			// 외부 클래스 private 변수
	private static int sNum = 20;	// 외부 클래스 정적 변수
	
	// 내부 클래스 자료형변수부터 선언
	private InClass inClass;
	
	// 외부 클래스 디폴트 생성자. 외부클래스 생성이 먼저, 내부클래스 생성은 그 다음
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {					// 인스턴스 내부 클래스
		int inNum = 100;			// 내부 클래스의 인스턴스 변수
		// static int sInNum = 200; // 인스턴스 내부클래스에는 정적 변수 선언이 불가능함. 오류 발생
		
		void inTest() {
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
		
		// static void sTest(){ } // 마찬가지로 인스턴스 내부 클래스에서는 정적 메서드또한 정의 불가능
	}
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass(); // 내부 클래스 기능 호출
	}
	
}
