
/*
 * 문자 자료형
 * 0과 1로 구성되는 컴퓨터에서 문자를 표현하려면 0과 1의 조합으로 표현을 해야함
 * 따라서 문자별로 특정 정수값을 약속으로 정해둠
 * 이런 코드값을 모아둔 것을 '문자 세트'라고 하고, 문자를 정해진 코드값으로 변환하는 것을 '문자 인코딩'이라고 함.
 * 코드 값을 다시 문자로 변환하는 것은 '문자 디코딩'
 * 
 * 가장 기본인 문자 인코딩은 아스키 코드(ASCII)로, 영문자, 숫자, 특수문자 등 1바이트 로 표현가능한 문자들로 구성됨.
 * 2바이트 이상을 사용하는 다양한 문자들의 존재로, 각 언어별 표준 인코딩이 정의되어 있는데 이것이 '유니코드'
 * 
 * 자바는 유니코드 기반으로 문자를 표현하기 때문에 문자 자료형 char은 2바이트를 사용
 *  
*/

package chapter02;

public class CharacterEx01 {
	
	public static void main(String[] args) {
		char ch1 = 'Z'; // 문자 자료형 변수 ch1 에 문자 A 입력
		System.out.println(ch1); // 문자 출력
		System.out.println((int)ch1); // 문자 A에 해당하는 정수 출력
		
		char ch2 = 38; // 문자 자료형 변수 ch2에 정수 값 입력
		System.out.println(ch2); // 정수 66에 해당하는 문자 B 출력
		
		int ch3 = 97; // 정수 자료형 변수 ch3에 정수 값 입력
		System.out.println(ch3); // 정수 67 출력
		System.out.println((char)ch3); // 정수 67에 해당하는 문자 C 출력
		
		// Q) ch1 = 'Z', ch2 = 38, ch3 = 97 로 바꿔 대입하면 출력 결과는?
		// A) 90, &, a
	}

}
