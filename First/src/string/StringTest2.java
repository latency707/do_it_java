/*
 * String 클래스의 final char[] 변수
 * 다른 프로그래밍 언어는 문자열 구현에 char[] 배열을 주로 사용함
 * 자바는 String 클래스를 제공해 char[] 배열을 직접 구현하지 않고 편리하게 문자열 사용이 가능함
 * 
 * String 클래스의 구현내용을 보면 private final char value[] 라고 선언된 char형 배열이 있음
 * final이 선언된 문자열은 바뀌지 않는데 이런 문자열의 특징을 '문자열의 불변성' 이라고 함
 * 프로그램에서 두개의 문자열을 연결한다면??
 * 	이 경우 둘 중 하나의 문자열이 변경되는 것이 아닌, 두 문자열이 연결된 새로운 문자열이 생성됨
*/

// 두 문자열 연결하기
package string;

public class StringTest2 {
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("initial string address: " + System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr); // 문자열 javaStr 과 문자열 androidStr를 연결하여 javaStr에 대입
		
		System.out.println(javaStr);
		System.out.println("concatenated string address: " + System.identityHashCode(javaStr));	// 출력한 해쉬코드 값이 다름
	}

}
