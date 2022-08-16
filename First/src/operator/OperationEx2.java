/*
 * 증가/감소 연산자로, 연산자 앞이나 뒤에 사용하며 값을 1만큼 늘리거나 줄임
 * 증가/감소 연산자는 단항 연산자임
 * 연산자는 피연산자 앞에 쓰이느냐 뒤에 쓰이느냐에 따라 결과 값이 전혀 다르므로 주의
 * 
 * 증가/감소 연산자는 "++, --"로 표현함
 * ++keyword, keyword++, --keyword, keyword-- 
*/


// 증가/감소 연산자를 사용하여 값 계산하기
package operator;

public class OperationEx2 {
	public static void main(String[] args) {
		int gameScore = 150; // 게임점수 변수 선언 및 값 150으로 초기화
		
		int lastScore1 = ++gameScore; // 값 증가 후 대입이므로 151
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore; // 값 감소 후 대입이므로 150
		System.out.println(lastScore2);
	}
	
//	Q) ln8의 ++gameScore 을 gameScore++ 로, ln11 의 --gameScore 을 gameScore-- 로 바꿨을 때 결과는??
//	150, 151
	
}
