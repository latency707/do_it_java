/*
 * 조건 연산자(삼항 연산자)
 * 조건 연산자는 연산에 필요한 항의 개수가 3개인 연산자로, 주어진 조건식이 참인 경우와 거짓인 경우에 다른 결과값이 나옴
 * 
 * 
*/

// 조건 연산자를 사용해 부모님의 나이 비교하기
package operator;

public class OperationEx4 {
	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge =47;
		
		char ch;
		// 조건연산자 (조건식) ? 결과1 : 결과 2;
		ch = (fatherAge > motherAge) ? 'T' : 'F'; // 조건식 (fatherAge > motherAge)가 참이면 결과1('T'), 거짓이면 결과2('F') 출력
		
		System.out.println(ch);
		
		// Q) 조건연산자를 사용해 10이 짝수인 경우 true, 아니면 false 를 출력하는 코드를 짜시오
		int num = 10;
		boolean isEven;
		isEven = (num % 2) == 0 ? true : false;
		System.out.println(isEven);
	}
	

}
