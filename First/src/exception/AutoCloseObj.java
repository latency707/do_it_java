/*
 ** try-with-resource
 * 시스템 리소스를 사용하고 해제하는 코드는 다소 복잡함
 * 자바 7부터는 try-with-resources 문을 제공해 close() 메서드를 명시적으로 호출하지 않아도 try블록 내에서 열린 리소스를 자동으로 닫게 할 수 있음
 * try-with-resources 문법을 사용하려면 해당 리소스가 AutoCloseable 인터페이스를 구현해야함
 * AutoCloseable 인터페이스에 close() 메서드가 구현되어 있기 떄문에 명시적 호출 없이도 close() 메서드 호출이 가능함
*/

// AutoCloseable 인터페이스 구현
package exception;

public class AutoCloseObj implements AutoCloseable {
	// close() 메서드 구현
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다");
	}

}
