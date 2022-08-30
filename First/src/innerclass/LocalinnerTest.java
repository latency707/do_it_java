/*
 ** 지역 내부 클래스
 * 지역 내부 클래스는 지역 변수처럼 메서드 내부에 클래스를 정의하여 사용하는 클래스
 * 메서드 내부에서만 사용가능
*/

// 지역 내부 클래스 예제
package innerclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;				// 지역 변수
		
		// 지역 내부 클래스
		class MyRunnable implements Runnable {
			int localNum = 10;	// 지역 내부 클래스의 인스턴스 변수
		
			@Override
			public void run() {
				// num = 200;	// 지역변수는 상수로 바뀌므로 값을 변경할 수 없어 오류가 발생함
				// i = 100;		// 매개변수도 지역변수처럼 상수로 바뀌므로 값을 변경할 수 없음
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
			}
		}
		return new MyRunnable();
	}
}

public class LocalinnerTest {
	public static void main(String[] args) {
		Outer out = new Outer(); 
		Runnable runner = out.getRunnable(10); // MyRunnable을 사용하려면 클래스를 직접 생섷아는 것이 아니라 메서드 호출을 통해 객체를 반환받는 식
		runner.run(); // run() 이 실행되면서 getRunnable() 메서드의 지역변수가 사용됨
		/* 
		 * getRunnable() 의 매개변수 i와 매서드 내부의 num은 지역변수인데
		 * 메서드 호출이 끝난 후 스택메모리에서 지워졌을 지역변수는 지역내부클래스에서 사용되는 경우 상수로 처리되기 때문에 메서드 호출이 끝나도 참조가 가능함
		 * ***지역 내부 클래스에서 사용하는 메서드의 지역변수는 모두 상수로 바뀜 ***
		 */
		
	}

}
