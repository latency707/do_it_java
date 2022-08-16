/*
 * 3장 연습문제
 * Q1) 다음 소스코드의 빈칸을 채워보세요
 * Q2) 다음 코드가 수행될 때 출력되는 값을 적어보세요
 * Q3) 다음 코드가 수행될 때 출력되는 값을 적어보세요
 * Q4) 다음 코드가 수행될 때 출력되는 값을 적어보세요
 * Q5) 다음 코드가 수행될 때 출력되는 값을 적어보세요
 * Q6) 다음 코드가 순서대로 수행될 때 출력되는 값을 적어보세요
 * Q7) 다음 코드가 수행될 때 출력되는 값을 적어보세요
*/

package chapter03;

public class OperationEx1 {
	public static void main(String[] args) {
		
		// Q1)
		int myAge = 23;
		int teacherAge =38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		char ch;
		ch = (myAge >teacherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		
		
		// Q2)
		int num1;
		num1 = -5 + 3 * 10 / 2;
		System.out.println(num1); // 10
		
		
		// Q3)
		int num2 = 10;
		
		System.out.println(num2); // 10
		System.out.println(num2++); // 10
		System.out.println(num2); // 11
		System.out.println(--num2); // 10
		
		
		
		// Q4)
		int n1 = 10;
		int n2 = 20;
		boolean result;
		
		result = ((n1 > 10) && (n2 > 10));
		
		System.out.println(result);  // false
		
		result = ((n1 > 10) || (n2 > 10));
		
		System.out.println(result); // true
		System.out.println(!result); // false
		
		
		
		// Q5)
		int n3 =2;
		int n4 = 10;
		
		System.out.println(n3 & n4); // 2진수 10 (2)
		System.out.println(n3 | n4); // 2진수 1110 (10)
		System.out.println(n3 ^ n4); // 2진수 1000 (8)
		System.out.println(~n3); // 2진수 11111101 (-3)
		
		
		
		// Q6)
		int n5 = 8;
		
		System.out.println(n5 += 10); // 18
		System.out.println(n5 -= 10); // 8
		System.out.println(n5 >>= 2); // 2진수 10 (2)
		
		
		
		// Q7)
		int n6 = 10;
		int n7 = 20;
		
		int result2 = (n6 >= 10) ? n7 + 10 : n7 - 10;
		System.out.println(result2); // 30
	}

}
