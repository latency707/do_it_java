/*
 * StringBuffer, StringBuilder 클래스 활용
 * 프로그래밍에서 문자열을 변경하거나 연결해야할 때가 많은데 String 클래스는 최초 생성후 값이 변경되지 않음
 * 그로 인해 String 클래스를 사용해 문자열을 계속 연결하거나 변경하는 프로그램을 작성하면 메모리가 많이 낭비됨
 * 이를 해결하는 클래스가 StringBuffer/StringBuilder
 * 
 * StringBuffer/Builder는 내부에 변경가능한 char[]를 변수로 갖고 있음
 * 이 두 클래스는 문자열을 연결하면 기존의 char[] 배열이 확장되는 구조라서 추가메모리를 사용하지 않음
 * 
 * 두 클래스의 차이는 멀티스레드(여러 작업)가 동시에 문자열을 변경하려 할 때 문자열이 안전하게 변경되도록 보장해주는가 아닌가, 다른 말로 '스레드 동기화의 안정성' 유무에 차이가 있음
 * StringBuffer는 문자열이 안전하게 변경되도록 보장하지만 실행 속도가 느리고
 * StringBuilder는 문자열의 안전이 보장되지 않는 대신 실행 속도가 좀 더 빠름 
*/

// StringBuilder 클래스 예제
package string;

public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("java");
		System.out.println("javaStr string address : " + System.identityHashCode(javaStr)); // 인스턴스 최초 생성 메모리 주소
		
		// String으로부터 StringBuilder 생성
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		// buffer에 문자열 추가
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString(); // String 클래스로 변환
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소: " + System.identityHashCode(javaStr));
	}

}
