/*
 ** 함수를 변수처럼 사용하는 람다식
 * 람다식을 이용하면 구혀뇐 함수를 변수처럼 사용할 수 있음
 ** 프로그램에서 변수를 사용하는 주요 케이스
 * 특정 자료형으로 변수 선언 후 값 대입해 사용
 * 매개변수로 전달
 * 메서드의 반환값으로 반환	
 * 
 * 람다식으로 구현된 메서드도 변수에 대입하여 사용할 수 있고, 매개변수로 전달하고 반환할 수 있음
 * 이때 전달되는 매개변수의 자료형은 인터페이스형
*/

// 매개변수로 전달하는 람다식
package lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		// 람다식을 인터페이스형 변수에 대입하고 그 변수를 사용해 람다 구현부 호출
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lambda_1");
		showMyString(lambdaStr); // 메서드의 매개변수로 람다식을 대입한 변수 전달
		
	}
	public static void showMyString(PrintString p) { // 매개변수를 인터페이스형 p로 받음
		p.showString("hello lambda_2");
	}

}


