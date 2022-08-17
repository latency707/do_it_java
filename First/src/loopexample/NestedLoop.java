/*
 * 중첩 반복문
 * 반복문 안에 또 다른 반복문을 중첩해서 사용하는 반복문을 중첩 반복문(다중 for문) 이라고함
 * 반복문 중접 시에는 외부 반복문과 내부 반복문이 어떤 순서로 실행되는지, 내부 반복문 수행 전에 초기화해야하는 값을 잘 초기화했는지 주의해야함
*/

package loopexample;

public class NestedLoop {
	public static void main(String[] args) {
		int dan;
		int times;
		
		for (dan = 2; dan <= 9; dan++) {	// 2단부터 9단까지 반복하는 외부 반복문
			for (times = 1; times <= 9; times++) {	// 각 단에서 1~9를 곱하는 내부 반복문
				System.out.println(dan + "X" + times + "=" + (dan * times));
			}
			System.out.println(); // 단 수행후 1줄 간격
		}
		
		
		// Q) 3단부터 7단까지만 출력하는 중첩 반복문을 작정하시오
		int dan37;
		int times2;
		
		for (dan37 = 3 ; dan37 <=7 ; dan37++) {
			for (times2 = 1 ; times2 <= 9 ; times2++) {
				System.out.println(dan37 + "X" + times2 + "=" + (dan37 * times2));
				}
			System.out.println();
		}
		
	}

}
