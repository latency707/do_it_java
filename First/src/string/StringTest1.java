/*
 * String 클래스
 * 자바는 문자열을 사용할 수 있도록 String 클래스를 제공하는데, 문자열은 프로그램 구현에 많이 활용됨
 * 
 * String을 선언하는 두 가지 방법
 * 방법 1: 문자열을 생성자의 매개변수로 생성하는 방식
 * String str1 = new String("abc");	// 생성자의 매개변수로 문자열 생성
 * 방법 2: 이미 생성된 문자열 상수를 가리키는 방식
 * String str2 = "test"; // 문자열 상수를 가리키는 방식
 * 
 * 두 방식의 차이
 * new 예약어로 객체를 생성하는 방법1은 "abc"문자열을 위한 메모리가 할당되고 새 객체가 생성됨
 * 반면 방법2와 같이 생성자를 이용하지 않고 바로 문자열 상수를 가리키는 경우에는 기존에 만들어져 있던 문자열 상수 "test"의 메모리 주소(상수풀)를 가리킴
 * 	따라서 String str3 = "test" 코드를 작성하면 str2 와 str3는 주소값이 같아짐
 * 
 * ** 상수풀(constant pool): 프로그램에서 사용되는 상수값을 저장하는 공간을 의미함(2-4장 참고)
*/

// String 클래스 주소값 비교
package string;

public class StringTest1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // 인스턴스가 매번 새로 생성되므로 주소값이 다름
		System.out.println(str1.equals(str2)); // 문자열 값은 같으므로 true 반환
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); // 문자열 "abc"는 상수풀에 저장되어 있으므로가리키는 주소값 동일
		System.out.println(str3.equals(str4)); // 문자열 값도 같으므로 true 반환
	}

}
