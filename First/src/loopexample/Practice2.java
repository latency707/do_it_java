/*
 * Q2)
*/

package loopexample;

public class Practice2 {
	public static void main(String[] args) {
		int num1;
		int times;
		
		for (num1 = 1 ; num1 < 9 ; num1++) {
			for (times =1 ; times < 9 ; times++) {
				if (num1 % 2 == 0) {
				System.out.println(num1 + "X" + times + "=" + (num1 * times));
				} else {
					continue;
				}
			}
			System.out.println();
		}
	}

}
