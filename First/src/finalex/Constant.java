/*
 * final 예약어

 * final은 의미 그대로 마지막으로 정한 것이므로 더이상 수정할 ㅅ ㅜ없다는 뜻
 * final 예약어는 변수, 메서드, 클래스에 사용할 수 있음
 * 
 * 사용 위치별 final 예약어
 * final 변수: 상수를 의미함
 * final 메서드: 하위 클래스에서 재정의할 수 없는 메서드
 * final 클래스: 상속할 수 없는 클래스. 보안과 관련되어 있거나, 기반 클래스가 변하면 안되는 경우에 사용
*/

// 상수 final 실습
package finalex;

public class Constant {
	int num = 10;
	final int NUM = 100;	// final 상수 선언, 상수는 보통 대문자 표기

	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
//		cons.NUM = 200;	// 상수 값 대입해 오류 발생
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}
}
