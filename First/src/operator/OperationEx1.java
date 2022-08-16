/*
 * 산술 연산자
 * 사칙연산에서 사용하는 연산자 "+, -, *, /, %"
 * 순서대로 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지
*/

// 산술연산자를 사용해 총점과 평균 구하기
package operator;

public class OperationEx1 {
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 90;
		
		int totalScore = mathScore + engScore + korScore; // 총점 계산
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0; // 평균 계산
		System.out.println(avgScore);
		
		// 국어점수 변수를 추가하고 원하는 점수를 대입한 후 총점과 평균 점수를 새로 구하시오.
		// 완료
	}

}
