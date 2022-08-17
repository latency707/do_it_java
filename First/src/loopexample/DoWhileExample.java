/*
 * do-while문
 * while문은 조건을 먼저 검사하기 때문에 조건식에 맞지 않으면 반복수행이 한번도 일어나지 않음
 * 반면 do-while문은 {} 안의 문장을 무조건 1회 수행한 후 조건식을 검사함
*/


// 1부터 10까지 더하는 do-while문 만들기
package loopexample;

public class DoWhileExample {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while (num <= 10);
			
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}
	

}
