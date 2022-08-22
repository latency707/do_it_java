/*
 * 항상된 for문(enhanced for loop)
 * 자바 5부터 제공되는 향상된 for문은 배열을 처음부터 끝까지 모든 요소를 참조할 때 사용하면 편리한 반복문임
 * 따로 초기화와 종료조건 없이 배열 요소값을 순서대로 하나씩 변수에 대입함
*/

package array;

public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		for(String lang : strArray) {	// 문자열 변수 lang 에 배열의 각 요소가 순서대로 대입
			System.out.println(lang);
		}
		
		
		// Q) 향상된 for문 완성해보기
		int[] numArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int num : numArray) {
			System.out.println(num);
		}
	}

}
