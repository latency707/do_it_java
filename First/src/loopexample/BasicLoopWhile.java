/*
 * 반복문
 * 반복문이란 프로그램 내에서 똑같은 명령을 일정 횟수만큼 반복하여 수행하도록 제어하는 명령문
 * 프로그램이 처리하는 대부분의 코드는 반복적인 형태가 많으므로, 가장 많이 사용되는 제어문 중 하나
 * 
 * while문: 조건식이 참인 동안 수행문을 반복해서 수행함
 * 이 특성을 활용하면 while(true) 와 같이 조건식을 설정할 경우 조건이 항상 '참'이 되어 무한히 반복할 수 있음
 * 주로 인터넷 쇼핑몰처럼 서비스가 멈추지 않고 24시간 내내 유지돼야하는 웹서버를 유지하는 등에 무한 반복을 사용
 * 
 *    웹서버처럼 끊임없이 돌아가는 시스템을 데몬(daemon)이라고 함.
*/

// while문 활용하여 1부터 10까지 더하기
package loopexample;

public class BasicLoopWhile {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {		// num 값이 10보다 작거나 같을 동안
			sum += num;			// sum에 num 값을 반복해서 더하고
			num++;					// num 은 루프마다 1씩 증가한다
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		// Q) while 문을 사용해 1부터 50까지 더하는 프로그램 코드를 완성하시오
		
		int num1 = 1;
		int sum50 = 0;
		
		while (num1 <= 50) {
			sum50 += num1;
			num1++;
		}
		
		System.out.println("1부터 50까지의 합은 " + sum50 + "입니다.");
	}

}
