/* 제어 흐름 이해하기( 조건문, 반복문)
 * 
 * 조건문
 * 주어진 조건에 따라 다른 문장을 선택할 수 있도록 프로그래밍 하는 것
 * if문이 가장 단순한 형식으로, if문 내의 조건식이 참일 경우에 문장을 수행함 
 * 만족하는 경우와 만족하지 않는 경우를 모두 나타낼 경우 if-else문을 사용
 * 
 *  제어문 사용 시 가독성과 오류 방지를 위해 중괄호와 들여쓰기에 주의하는 것이 좋음
*/

package ifexample;

public class IfExample1 {
	public static void main(String[] args) {
		int age = 7;
		
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		
		
		// Q) gender 변수값이 'F' 면 '여성입니다.'를 출력하고 그렇지 않은 경우 '남성입니다.' 를 출력하는 코드를 완성하시오
		char gender = 'F';
		
		if(gender == 'F') {
			System.out.println("여성입니다."); 
		} else {
			System.out.println("남성입니다.");
		}
	}

}
