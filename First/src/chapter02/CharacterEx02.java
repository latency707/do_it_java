/*
 * 문자와 문자열
 * 프로그램에서 문자를 사용할 때는 항상 작은 따옴표(' ')를 사용함
 * 문자를 여러개 이은 문자열을 사용할 때는 큰따옴표(" ")를 사용하고 기본자료형으로 표현할 수 없음
 * 문자열 끝에는 항상 null 문자('\n')가 있음
 * 
 * 문자와 문자열은 전혀 다른 값을 가짐
 * 즉, 'A' != "A"
 * 'A' 는 정수값 65로 정해져있는 문자, "A"는 실제로 "A\0"로 쓰임
 * 
 * 문자열을 다룰 때는 String 클래스를 사용함
*/

// 유니코드 직접 사용해보기
package chapter02;

public class CharacterEx02 {
	
	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C'; // 유니코드 값 입력
		
		System.out.println(ch1);
		System.out.println(ch2);
	}

}
