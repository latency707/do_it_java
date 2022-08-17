/*
 * Q1)
*/

package loopexample;

public class Practice1 {
	public static void main(String[] args) {
		
		// Q1)
		int num1 = 10;
		int num2 = 2;
		char operator = '/';
		
		// Q1-1) switch-case		
		switch (operator) {
		case '+':
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
			
		case '-':
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
			
		case '*':
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
			
		case '/':
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			break;
		}
		
		// Q1-2) if - else if
		// num1 , num2 , operator 선언 생략
		
		if (operator == '+') {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

		} else if (operator == '-') {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));

		} else if (operator == '*') {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));

		} else {
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));

		}
		
		

	}

}
