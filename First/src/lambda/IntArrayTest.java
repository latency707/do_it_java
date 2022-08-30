/*
 ** 스트림 생성 및 사용
*/

// 정수 배열에서 스트림 활용
package lambda;

import java.util.Arrays;

public class IntArrayTest {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		// sum() 연산으로 arr 배열 저장 값 모두 합산
		int sumVal = Arrays.stream(arr).sum();
		// count() 연산으로 arr 배열 요소 개수 반환
		int count = (int)Arrays.stream(arr).count();
		//			 count 메서드 반환값이 long 타입이므로 int형으로 형변환 명시
		
		System.out.println(sumVal);
		System.out.println(count);
	}

}
