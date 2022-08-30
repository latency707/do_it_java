/*
 ** 컴파일러에 의해 예외가 체크되는 경우
 * 자바에서 제공하는 많은 예외클래스들은 컴파일러에 의해 처리됨
 * 이 경우 자바에서는 예외처리를 하지 않으면 컴파일 오류가 계속 남아있으므로 예외처리가 필요함
*/

package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e); // 예외 클래스의 toString() 메서드 호출
		}
		System.out.println("예외처리에 성공했다면 이 출력문이 수행됩니다."); // 정상출력
	}

}
