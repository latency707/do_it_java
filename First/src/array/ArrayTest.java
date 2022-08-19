/*
 * 배열 순서는 0번부터
 * 배열 길이가 n이라고 하면 배열 순서는 0부터 n-1 으로 지정됨 
*/

package array;

public class ArrayTest {
	public static void main(String[] args) {
		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7 ,8 ,9 ,10} ;
		int sum = 0;
		
		for(int i = 0 ; i < num.length ; i++) {	// 배열명.length 속성을 쓰면 배열 길이를 반환함
			sum += num[i];
		}
		System.out.println(sum);
		
		// Q) 다음 연산 시 결과값은 ?
		int[] arr = new int[] {3, 6, 9, 12};
		System.out.println(arr[0] + 2); 
		System.out.println(arr[1] + arr[2]); 
//		System.out.println(arr[4] -3);	// 오류 발생, arr[4] 는 없는 인덱스
		// A) 순서대로 5, 15, 오류 발생
		
		
		// Q) 작성한 main() 함수에 int sum = 0; 을 작성하고, 
		//	ln13의 sysout 코드를 수정하여 배열의 모든 요소합을 계산하는 프로그램을 만드시오
	}
}
