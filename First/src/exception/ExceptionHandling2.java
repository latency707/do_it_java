/*
 ** try-catch-finally 문
 * 일반적인 try-catch 문에서는 try 블록 안에서 발생할 수 있는 예외상황이 여러개라면 catch 블록을 예외상황 수만큼 구현해야하는 단점이 있음
 * 이때 사용하는 블록이 finally 
*/

package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally {
			if(fis != null) {
				try {
					fis.close(); // 파일 입력 스트림 닫기
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행됩니다");
		}
		System.out.println("여기도 수행됩니다");
	}
}