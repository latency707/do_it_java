/*
 * continue문
 * 반복문 안에서 쓰이는 키워드로, 반복문을 계속 수행하는데, 특정 조건에서는 수행하지 않고 건너뛰게 해야할 때 사용함
*/

// 1부터 100까지 수 중 홀수일 때만 더하는 프로그램 작성하기
package loopexample;

public class ContinueExample {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for (i = 1; i <= 100 ; i++) {
			if (i%2 == 1) {
				sum += i;
			} else {
				continue;
			}
			
		}
		
		System.out.println("1부터 100까지 숫자 중 홀수인 수의 총 합은 " + sum + "입니다.");
		
		
		
		// Q) 1부터 100까지 수 중 3의 배수만 출력하는 코드를 완성해보시오
		int num;
		
		for (num = 1; num <= 100 ; num++) {
			if (num % 3 == 0) {
				System.out.println(num);
			} else {
				continue;
			}
		}
		
	}

}
