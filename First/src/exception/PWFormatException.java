// 사용자 정의 예외 구현
package exception;

public class PWFormatException extends Exception {
	public PWFormatException(String message) {	// 생성자 매개변수로 예외상황 메세지를 받음
		super(message);
	}

}
