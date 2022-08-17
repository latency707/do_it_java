/*
 * Q3)
*/

package loopexample;

public class Practice3 {
	public static void main(String[] args) {
		int dan;
		int times;
		
		for (dan = 1 ; dan < 9 ; dan++) {
			for (times = 1 ; ; times++) {
				System.out.println(dan + "X" + times + "=" + (dan * times));
				if (times >= dan) {
					break;
				}

			}
			
			System.out.println();

		}
	}

}
