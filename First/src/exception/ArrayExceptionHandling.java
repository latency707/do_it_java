/*
 ** 예외처리 Try series
 *
 ** try-catch
 * 예외를 처리하는 가장 기본적인 문법. 형태는 다음과 같음
 * try {
 * 		예외가 발생할 수있는 코드를 작성하는 부분
 * 	}	catch (처리할 예외타입 e) {
 * 		try 블록 안에서 예외 발생 시 예외처리 부분
 * 	}
 * 
 * 
*/

// try-catch 문 사용
package exception;

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			for(int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외 처리 부분");
		}
		System.out.println("프로그램 종료");
	}

}
