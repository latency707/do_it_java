/*
 * 배열의 전체 길이와 유효 요소값
 * 배열 사용 시 최초 선언한 배열 길이만큼 값을 모두 저장해서 쓰는 경우는 많지 않음
 * 그러므로 배열 전체 길이와 유효한 값이 저장되어있는 배열 요소의 개수가 같지 않다는 것을 염두에 둬야함
*/

// 배열 길이만큼 출력하기
package array;

public class ArrayTest2 {
	public static void main(String[] args) {
		double[] data = new double[5];	// double형 길이 5인 배열 선언
		
		// 1,2,3 번째 요소에 값 대입
		for(int i = 0; i < 3 ; i++) {
			data[i] = 1 * (i + 1) * 10;
		}
		
		for(int i = 0 ; i < data.length ; i++) {
			System.out.println(data[i]);	// 10.0, 20.0, 30.0, 0.0, 0.0 
			// 실수배열과 정수배열을 별도의 초기화 없이 선언하면 배열요소값이 0으로 초기화됨
		}
	}

}
