// try-with-resources 문 
package exception;

public class AutoCloseTest {
	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()){ // 사용할 리소스 선언
			throw new Exception();	// 강제 예외 발생문 주석 on/off 다른 결과
		} catch(Exception e) {
			System.out.println("예외 부분입니다");
		}
		
		// 향상된 try-with-resource (자바 9 에서 추가)
		AutoCloseObj obj2 = new AutoCloseObj();
		try(obj2) { // 외부에서 선언한 변수를 그대로 사용 가능
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 부분입니다");
		}
	}

}
