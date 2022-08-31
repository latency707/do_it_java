/*
 ** 다중 예외처리 
 * 여러 catch 문을 한꺼번에 사용하는 경우 각 catch 블록은 각각의 예외처리를 담당함
 * 문법적으로 예외처리가 필수인 경우 외에도 예외처리가 필요함
 * 가령 배열을 사용할 때 배열의 크기보다 큰 위치, 즉 인덱스 초과 위치로 접근하는 경우는 컴파일러에 의해 체크되지 않음
*/

package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionMul {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsExceptionMul test = new ThrowsExceptionMul();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e) { // Exception 클래스로 기타 예외상황 처리
//			e.printStackTrace();
		}
	}

}
