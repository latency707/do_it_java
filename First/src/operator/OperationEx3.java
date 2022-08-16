/*
 * 단락회로평가(Short Circuit Evaluation; SCE)
 * 논리 연산을 할 때 두 항을 모두 실행하지 않더라도 결과 값을 알 수 있는 경우, 나머지 항은 실행되지 않는 것을 단락회로평가라고 함
*/

// 논리연산 단락회로평가 실습하기
package operator;

public class OperationEx3 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		// 논리 곱연산; 두 항이 모두 참일 때만 결과값이 참이 됨
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // 논리곱에서 앞 항이 거짓이면 뒷문장은 실행되지 않음
		System.out.println(value);
		System.out.println(num1); // 연산이 반영된 20
		System.out.println(i); // 연산이 반영되지 않은 2
		
		// 논리 합연산; 하나의 항이 참이면 나머지 항과 상관없이 결과값이 참이 됨 
		value = ((num1 = num1 + 10) > 10) || ((i + 2) < 10); // 논리 합에서 앞 항이 참이면 뒷문장은 실행되지 않음
		System.out.println(value);
		System.out.println(num1); // 연산 반영
		System.out.println(i); // 연산 미반영
		
		
		// Q) 다음 예제 출력 결과를 예상해보시오
		int num2 = 5;
		int j = 10;
		
		boolean value2 = ((num2 = num2 * 10) > 45) || ((j = j - 5) < 10);
		System.out.println(value2); // true
		System.out.println(num2); // 50
		System.out.println(j); // 10
	}

}
