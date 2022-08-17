/*
 * 중첩반복문에서의 break는 break를 직접 감싸고 있는 반복문만 빠져나오고 외부 반복문은 계속 수행함
*/

// 0부터 숫자를 1씩 늘리면서 합을 계산할 때 숫자를 몇까지 더하면 100이 넘는지 보여주는 프로그램 짜보기2
package loopexample;

public class BreakExample2 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		for (num = 0 ; ; num++) {
			sum += num;
			
			if (sum >= 100) {	// sum 값이 100 보다 크거나 같을 때
				break;				// 반복문 종료
			}
		}
		
		System.out.println("number : " + num);
		System.out.println("sum : " + sum);
	}

}
