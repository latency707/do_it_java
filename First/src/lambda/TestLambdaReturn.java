/*
 ** 반환값으로 쓰이는 람다식
 * 메서드의 반환형을 람다식의 인터페이스형으로 선언하면 구현한 람다식을 반환할 수 있음
*/

// 반환 값으로 쓰이는 람다식
package lambda;

interface PrintingString {
	void showString(String str);
}

public class TestLambdaReturn {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello Lambda_1");
		showMyString(lambdaStr);
		
		PrintString reStr = returnString();	// 변수로 반환
		reStr.showString("hello");			// 메서드 호출
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
	
	// 람다식 반환 메서드
	public static PrintString returnString() {
		return s -> System.out.println(s + " world");
	}
	
	

}
