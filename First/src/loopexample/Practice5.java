/*
 * Q5)
*/

package loopexample;

public class Practice5 {
	public static void main(String[] args) {
		int floor = 7;
		int center = (floor - 1) / 2;
		
		for(int i = 0 ; i <= center ; i++) {
			for(int j = 0 ; j < center - i ; j++) {
				System.out.print(" ");
				
			}
			
			for(int j = 0 ; j < 2 * i + 1 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = center ; i > 0 ; i--) {
			for(int j = 0 ; j <= center - i ; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0 ; j < i * 2 - 1 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		
		}
	}

}