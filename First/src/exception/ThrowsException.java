/*
 ** 예외처리 미루기 Add throws declaration
 * 예외를 해당 메서드에서 처리하지 않고 미룬 후 메서드를 호출하여 사용하는 부분에서 예외를 처리하는 방법
 
 * 예외 처리 옵션 3가지
 * Add throws declaration : main() 함수에서 미룬 예외처리는 함수를 호출한 JVM에서 대부분의 프로그램이 비정상 종료되어 권장하지 않음
 * Surround with try/multi-catch : 여러 예외를 한번에 처리
 * Surround with try/catch : 예외 상황마다 다르게 처리하기. 예외처리와 로그를 각각 다르게 남겨야 하는 경우에 사용
 * 
 * 예외가 발생한 메서드에서 그 예외를 바로 처리할 것인지, 미뤄서 메서드를 호출해 사용하는 부분에서 처리할 것인지는 만들고자 하는 프로그램 상황에 따라 다름
 * 어떤 메서드가 다른 여러 코드들에서 호출되어 사용된다면 호출하는 코드의 상황에 맞게 로그를 남기거나 예외처리를 하는 것이 더 좋음 = 메서드 호출부에서 예외처리를 하도록 미루는 것을 권장
*/

package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException { // 두 예외를 메서드가 호출될 때 처리하도록 미룸
		FileInputStream fis = new FileInputStream(fileName);	// FileNotFoundException 발생가능
		Class c = Class.forName(className);	// ClassNotFoundException 발생가능
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		test.loadClass("a.txt", "java.lang.String"); // 메서드를 호출할 때 예외처리
	}

}
