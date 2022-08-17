/*
 * 메서드
 * 메서드는 함수의 한 종류로, 함수란 '하나의 기능을 수행하는 일련의 코드'를 말함
 * 특정 기능을 수행하는 코드를 반복적으로 사용하는 대신 미리 구현해놓고 필요할 때마다 호출하여 사용하는 식
 * 
 * 함수는 이름과 입력값, 결과값을 가짐
 * ex- 입력(숫자, 성적, 거리) - [더하기 함수] - 출력(숫자합, 성적합, 거리합)
 * 
 * add 함수
 * result(결과값; 반환값) = num1 + num2 (입력값; 매개변수)
 * 
 * 함수는 함수의 의미를 알 수 있는 단어를 사용하는 것이 좋음.
 * 함수의 입력으로 받는 변수를 '매개변수', 함수 수행 후 결과로 돌려주는 값을 '반환값' 이라고 함
*/

// 함수 정의하기
package classpart;

public class AboutMethod {
	// add 메서드 정의
	int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	// 매개변수가 필요없는 함수
	int getTenTotal() {
		int i;
		int total = 0;
		for(i = 1 ; i <= 10 ; i++) {
			total += i;
		}
		return total; // 1부터 10까지 더한 값 반환
	}
	
	// 반환 값이 없는 함수
	void printGreeting(String name) {	// 반환값이 없어도 반환형 입력 위치에는 비어있다는 의미의 예약어 'void' 를 입력해야함
		System.out.println(name + "님 안녕하세요.");
		return; // 반환 값 없음. 출력과 return은 다르다
	}
	
	// return 예약어로 함수 수행 종료하기
	void divide(int num1, int num2) {
		
		if(num2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return; // 함수 수행 종료
		}
		else {
			int result = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + result + "입니다.");
		}
	}

}
