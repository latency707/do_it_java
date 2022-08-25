/*
 * Wrapper 클래스
 * 기본자료형을 위한 클래스
 * 지금까지 정수를 사용할 때 기본형인 int를 사용했음
 * 그런데 매개변수가 객체거나 반환값이 객체형일 경우 정수를 객체형므로 사용해야 함
 * 		// 객체를 매개변수로 받는 경우
		public void setValue(Integer i) {}
		// 반환 값이 객체형인 경우
		public Integer returnValue() {}
 * 
 * 이때 기본자료형처럼 사용할 수 있게 제공하는 클래스가 있는데 이것이 Wrapper 클래스
 * Wrapper 클래스란 기본 자료형을 감쌌다(wrap)는 의미
 * 
 * Wrapper 클래스의 종류
 * 기본형		/	 Wrapper 클래스
 * boolean 		Boolean
 * byte			Byte
 * char			Character
 * short		Short
 * int			Integer
 * long			Long
 * float		Float
 * double		Double
 * 
 * 오토박싱과 언박싱
 * 어떤 정수값을 사용할 때 int와 Integer 선언은 각각 쓰임과 특성이 전혀 다름
 * 그래서 자바5 이전에는 기본자료형과 Wrapper형을 함께 연산하기 위해 형태를 통일시켜야 헀음
 * 
 * Integer num1 = new Integer(100);
 * int num2 = 200;
 * int sum = num1 + num2; // num1 이 num.intValue()로 언박싱됨
 * Integer num3 = num2; // num2가 Integer.valueOf(num2)로 오토박싱
 * 
 * 기본형을 객체형으로 바꾸는 것을 오토작싱,
 * 객체형을 기본형으로 꺼내는 것을 언박싱이라고 함
 * 
*/



// Integer 클래스 사용하기
/* Integer 클래스 생성자 사용 구분
 * Integer(int value){} // 특정 정수를 매개변수로 받는 경우
 * Integer(String s){} // 특정 문자열을 매개변수로 받는 경우
 * 
 * Integer 클래스는 멤버변수로 int를 가지고 있는데 int value 는 final 변수
 */
package wrapperex;

public class AboutWrapper {
	public static void main(String[] args) {
		// Integer 클래스의 메서드들
		
		// intValue() : Integer 클래스 내부 int 자료형 값 가져오기
		Integer iValue = new Integer(100);
		int myValue = iValue.intValue(); // int 값 가져오기. myValue 값을 출력하면 100이 출력됨
		
		// valueOf() : 생성자 없이 정수나 문자열을 바로 Integer로 반환받기
		Integer number1 = Integer.valueOf("100");
		Integer number2 = Integer.valueOf(100);
		
		// parseInt() : 문자열이 어떤 숫자를' 나타낼 때, 문자열 변환없이 바로 int 값을 가져와서 반환할 수 있음
		int num = Integer.parseInt("100");
	}

}
