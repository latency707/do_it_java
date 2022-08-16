/*
 * 연산 중 형변환
 * 같은 연산이라도 형변환이 언제 이뤄졌는지에 따라 결과값이 다르게 나타날 수 있음
*/

package chapter02;

public class ExplicitConversion {
	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // 두 실수가 각각 형변환 되어 더해짐
		int iNum4 = (int)(dNum1 + fNum2); // 두 ㅣㄹ수으 ㅣ합이 먼저 계산된 후 형변환이 됨
		
		System.out.println(iNum3); // 1
		System.out.println(iNum4); //2
 	}

}
