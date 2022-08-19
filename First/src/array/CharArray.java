/*
 * 문자 저장 배열 만들기
*/
package array;

public class CharArray {
	public static void main(String[] args) {
		char[] alphabets = new char[26];	// 길이 26 배열 alphabets 생성
		char ch = 'A';	// char 자료형 ch에 아스키코드 값 'A' 입력
		
		for(int i = 0 ; i < alphabets.length ; i++, ch++) {
			alphabets[i] = ch;	// 매 루프당 증가하는 아스키 값을 alphabets 배열 각 요소에 순서대로 저장
		}
		
		for(int i = 0 ; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}
	}

}
