/*
 * 함수 호출하고 값 반환하기
*/

package classpart;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2); // add 메서드 호출
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
		
		int sub1 = sub(num1, num2);
		System.out.println(sub1);
		
		int mul1 = mul(num1, num2);
		System.out.println(mul1);
		
		int div1 = div(num1, num2);
		System.out.println(div1);
	}
	
	// add 메서드 정의
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
		
	////// Q) add 메서드 외에 사칙연산 메서드를 추가로 구현해결과값을 출력해보시오 //////
	}
	
	// sub 메서드 정의
	public static int sub(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	// mul 메서드 정의
	public static int mul(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	// div 메서드 정의
	public static int div(int n1, int n2) {
		int result = n1 / n2 ;
		return result;
	}
	

}
