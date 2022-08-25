/*
 * String, Integer 클래스의 equals() 메서드
*/

package string;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);	// 두 인스턴스 주소값 비교 결과 출력
		System.out.println(str1.equals(str2));	// 두 인스턴스의 문자열 값 동일성 비교 결과 출력
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);	// 두 인스턴스 주소값 비교 결과 출력
		System.out.println(i1.equals(i2));	// 두 인스턴스의 정수 값 동일성 비교 결과 출력
	}

}
