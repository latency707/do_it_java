/*
 * 연습문제
 * Q1) 바이트 크기가 작은 자료형을 더 큰 자료형으로 대입하는 형 변환은 자동으로 이루어집니다.
 * 예
 * Q2) 실수를 정수형 변수에 대입하는 경우에 형 변환이 자동으로 이루어지고, 소수점 이하 부분만 없어집니다.
 * 아니오
 * Q3) 더 많은 실수를 표현하기 위해 가수부와 지수부로 비트를 나누어 표현하는 방식을 [부동 소수점 표현] 이라고 합니다.
 * Q4) 변수 두 개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해보세요.
 * '글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력하여 확인해 보세요.
*/

package chapter02;

public class Practice02 {
	public static void main(String[] args) {
		// Q4)
		int iNum1 = 10;
		float fNum1 = 2.0F;
		
		System.out.println(iNum1 + (int)fNum1);
		
		
		
		// Q5)
		char ch1 = '글';
		System.out.println((int)ch1);
		int ch2 = 44544;
		System.out.println((char)ch2);
	}
}
