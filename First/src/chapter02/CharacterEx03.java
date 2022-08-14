/*
 * 문자형 변수에 숫자를 저장한다면?
 * char형은 문자 자료형이지만 컴퓨터 내부에서는 정수값으로 표현되기 때문에 정수자료형으로 분류하는 경우도 있음
 * 다른 정수자료형과의 차이점은 char형은 음수값을 표현할 수 잆다는 것
 * 
 * 자바의 인코딩
 * 유니코드 인코딩에는 크게 UTF-8, UTF-16이 있음
 * 자바의 기본 인코딩은 문자를 2바이트로 표현하는 UTF-16
 * 그로 인해 1바이트로 표현할 수 있는 알파벳 같은 자료 저장에 메모리가 낭비될 수 있음
 * UTF-8은 각 문자에 1~4바이트를 사용하여 표현하는데, 메모리낭비가 적고 전송속도가 빨라 인터넷에서 많이 사용
*/

//
package chapter02;

public class CharacterEx03 {

	public static void main(String[] args) {
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		// char b2 = -66; 문자형 변수에 음수를 입력하면 오류 발생
		
		System.out.println((char)a); // A 출력
		System.out.println((char)b); // ? 출력 (알 수 없는 문자라는 의미)
		System.out.println(a2); // A 출력
	}

}
