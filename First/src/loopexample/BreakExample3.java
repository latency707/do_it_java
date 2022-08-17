/*
 * Q) 1부터 더했을 때 총합이 500이 넘는 자연수는 얼마인가?
*/

package loopexample;

public class BreakExample3 {
	public static void main(String[] args) {
		int sum = 0;
		int num;
		
		for (num = 1 ; ; num++) {
			sum += num;
			
			if (sum >= 500) {
				break;
			}
		}
		
		System.out.println("number: " + num);
		System.out.println("total: " + sum);
	}

}
