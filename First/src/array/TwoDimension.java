/*
 * 다차원 배열
 * 행이 여러 개로 이루어진, 이차원 이상으로 구현한 배열을 '다차원 배열'이라고 함
 * 다차원 배열은 주로 평면이나 공간 개념을 구현하는데 사용함
 * 
 *  이차원 배열 예시
 *  int[][] arr = new int[2][3];
 *  자료형	배열명	[행개수][열개수]
 *  
 *  배열의 모든 요소를 참조하려면 각 행을 기준으로 열값을 순회하면 됨
 *  이차원 배열 초기화 예시
 *  int[][] arr = {{1, 2, 3}, {4, 5, 6}};
*/

// 이차원 배열 코드 구현하기
package array;

public class TwoDimension {
	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};	// 배열 선언 및 초기화
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println( );	// 행 출력 후 줄 구분
		}
		
		// Q) 이차원 배열 연습하기; 
		// 알파벳 소문자를 2글자씩 13줄(13x2) 이차원 배열을 구현하시오
		char[][] arr2 = {{'a', 'b'}, {'c', 'd'}, {'e', 'f'}, {'g', 'h'}, {'i', 'j'}, {'k', 'l'}, {'m', 'n'}, {'o', 'p'}, {'q', 'r'}, {'s', 't'}, {'u', 'v'}, {'w', 'x'}, {'y', 'z'}};
		
		for(int i = 0 ; i < arr2.length ; i++) {
			for(int j = 0; j < arr2[i].length ; j++) {
				System.out.println(arr2[i][j]);
			}
			System.out.println( );
		}
	}

}
