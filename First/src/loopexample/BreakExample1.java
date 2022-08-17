/*
 * 반복문에서도 switch-case문에서와 마찬가지로 break문을 사용해 반복문을 빠져나오게 할 수 있음
*/

// 0부터 숫자를 1씩 늘리면서 합을 계산할 때 숫자를 몇까지 더하면 100이 넘는지 보여주는 프로그램 짜보기
package loopexample;

public class BreakExample1 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		for (num = 0; sum < 100 ; num++) {
			sum += num;
		}
		
		System.out.println("100 초과 숫자: " + num);	// 15  
		System.out.println("숫자 총합: " +sum);	// 105
		
		/*num과 sum은 각각 15와 105가 나오지만,
		 * 실제로는 num 값이 1씩 증가하여 15가 되었을 때 조건을 비교해보니 합이 100보다 커서 반복문이 종료된 것
		 * 조건에 맞는 실제 값 14를 얻기 위해서는 증감이 이뤄지기 전에 break 문으로 반복문을 끝내야 함.
		 * 구현은 BreakExample2 에서...
		*/
	}

}
