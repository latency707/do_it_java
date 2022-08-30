/*
 ** 정적 내부 클래스
 * 인스턴스 내부 클래스는 외부 클래스 생성이 우선되기 때문에 정적변수/정적메서드를 사용할 수 없음
 * 정적 내부 클래스를 사용하면 내부 클래스와 정적 변수가 외부 클래스 생성과 무관하게 사용할 수 있음
 * 정적 내부 클래스 정의또한 외부클래스의 멤버변수와 같은 위치에 정의하며 static 예약어를 사용함
 * 정적 메서드에서 인스턴스 변수를 사용할 수 없는 것처럼, 정적 내부 클래스에서도 외부 클래스의 인스턴스 변수는 사용할 수 없음
 * 
 ** 다른 클래스에서 정적 내부 클래스 사용하기
 * 정적 내부 클래스는 외부 클래스를 생성하지 않고도 내부 클래스 자료형으로 바로 선언해 생성할 수 있음
 * OutCLass.InStaticClass sInClass = new OutClass.InStaticClass();
 * 정적 내부 클래스에 선언한 모든 메서드나 변수는 private이 아닌 경우, 다른 클래스에서도 바로 사용 가능
 * 즉, 내부클래스를 만들고 외부 클래스와 무관하게 다른 클래스에서도 사용해야한다면 정적 내부 클래스로 생성하면 됨. 단, private 선언이 아닐 시에만 사용 가능
*/

// 정적 내부 클래스 예제
package innerclass;

class OutClass2 {
	private int num = 10;
	private static int sNum = 20;
	
	// 정적 내부 클래스 선언
	static class InStaticClass {
		int inNum = 100;			// 정적 내부 클래스의 인스턴스 변수
		static int sInNum = 200;	// 정적 내부 클래스의 정적 변수
		
		// 정적 내부 클래스의 일반 메서드
		void inTest() {
		// num += 10; //외부 클래스의 인스턴스 변수는 사용할 수 없음
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass2 sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		
		// 정적 내부 클래스의 정적 메서드
		static void sTest() {
			// num += 10;	// 외부 클래스 내부 클래스의 인스턴스변수는 사용할 수 없음
			// inNum += 10;	// 외부 클래스 내부 클래스의 인스턴스변수는 사용할 수 없음
			System.out.println("OutClass2 sNum = " + sNum + "(외부 클래스의 정적 변수 사용");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용");
		}
	}
}

public class InnerStaticTest {
	public static void main(String[] args) {
		OutClass2 outClass2 = new OutClass2();
		OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass2.InStaticClass.sTest();
	}
}
