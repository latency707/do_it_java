/*
 * 배열 복사하기
 * 기존 배열과 자료형 및 배열 크기가 똑같은 배열을 새로 만들거나 배열의 모든 요소에 자료가 꽉 차서 더 큰 배열을 만들어 기존 배열에 저장된 자료를 가져오려고 할 때 배열을 복사함
 * 
 * 배열 복사 방법은 2가지로,
 * 첫 번째는 기존 배열과 배열길이가 같거나 더 긴 배열을 만들고 for문을 사용해 각 요소값을 반복 복사
 * 두 번째는 System.arraycopy() 메서드를 사용하는 방법, 사용 양식은 다음과 같음
 * System.arraycopy(src, srcPos, det, destPos, length)
 * 각 매개변수의 의미는
 * src : 복사할 배열 이름
 * srcPos : 복사할 배열의 최초 인덱스
 * dest : 복사해서 붙여넣을 대상 배열 이름
 * destPos : 붙여넣을 대상 배열의 최초 인덱스
 * length : src에서 dest로 자료를 복사할 요소 개수
 * 
 * 복사대상 배열의 총 길이가 복사할 요소 개수보다 적으면 오류가 발생함
 * 
*/

package array;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(array1, 0, array2, 1, 4);
		for(int i = 0 ; i < array2.length ; i++) {
			System.out.println(array2[i]);
		}
	}

}
