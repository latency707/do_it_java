/*
 * 형변환(type conversion)
 * 정수와 실수는 컴퓨터 내부에서 표현되는 방식이 전혀 다름.
 * 따라서 정수와 실수 간에는 그대로 연산을 수행할 수 없고 하나의 자료형으로 통일한 후 연산을 해야함
 * 이 때, 자료형을 통일하는 것을 형 변환이라고 하며, 묵시적 형변환고 명시적 형변환으로 구분함
 * 
 *  묵시적 형변환과 명시적 형변환
 *  묵시적 형변환(자동형변환): 바이트 크기가 작은 자료형에서 큰 자료형으로 형변환은 자동으로 이뤄짐.
 *  명시적 형변환(강제형변환): 덜 정밀한 자료형에서 더 정밀한 자료형으로 형변환은 자동으로 이뤄짐.
*/

// 형변환 해보기
package chapter02;

public class ImplicitConversion {
	public static void main(String[] args) {
		// 묵시적 형변환
		
		// byte to int
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		// int to float
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		
		
		// 명시적 형변환 (형변환할 자료형)변수명
		
		// 바이트 크기가 큰 자료형에서 적은 자료형으로 대입
		int iNum3 = 1000;
		byte bNum3 = (byte)iNum3;
		
		System.out.println(bNum3); // 1000이 아닌 -24가 출력되는 이유는 값이 byte형의 표현범위(-128~127)를 넘기 때문
		
		// 더 정밀한 자료형에서 덜 정밀한 자료형으로 대입
		double dNum0 = 3.14;
		int iNum0 = (int)dNum0;
		
		System.out.println(dNum0);
		System.out.println(iNum0); // 실수에서 정수로 형변환 시 소수점이 생략됨
	}

}
