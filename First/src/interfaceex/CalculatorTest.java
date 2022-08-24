// CompleteCalc 클래스 실행하기
package interfaceex;

public class CalculatorTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();	// 유일한 구체적 클래스 CompleteCalc 클래스로만 인스턴스를 생성할 수 있음
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1,  num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		// 디폴트 메서드 호출
		calc.description();
		
		// 정적 메서드 호출
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));	// 정적 메서드 사용
	}

}
