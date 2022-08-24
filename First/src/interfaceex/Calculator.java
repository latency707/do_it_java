/*
 * 클래스에서 인터페이스 구현하기
 * 선언한 인터페이스를 클래스가 사용하는 것을 '클래스에서 인터페이스를 구현한다(implement)' 라고 표현함
 * 클래스 상속에서 extends 예약어가 쓰이듯 인터페이스에서는 implements 예약어를 사용함
 * 
*/

// Calculator 클래스에서 Calc 인터페이스 구현하기
package interfaceex;

// Calculator 추상 클래스 선언 
public abstract class Calculator implements Calc {	// Calculator 클래스에 Calc 인터페이스 구현
	/*
	 * Calculator 클래스에서 Calc 인터페이스를 구현하게 되면, Calc의 추상메서드들을 Calculator 가 지니게 됨
	 * 그렇기 때문에 인터페이스 구현 시에는 클래스에 추상메서드를 구현하거나 클래스를 추상클래스로 만들어줘야 오류가 발생하지 않음
	 */
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}	
	
}
