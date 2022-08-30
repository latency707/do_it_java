/*
 ** reduce()
 * 지금까지 사용했던 연산은 기능이 미리 정해져있었음
 * reduce() 연산은 내부적으로 stream의 요소를 하나씩 소모하면서 프로그래머가 직접 지정한 기능을 수행함
 * definition in JDK about reduce() :
 * 	T reduce(T identify, BinaryOperator<T> accumulator)	// binaryOperator는 함수형 인터페이스이므로 apply() 메서드 구현이 필수
 * 				초깃값	|	수행할 기능	(람다식 or 인터페이스 구현 클래스 대입) 
*/

// reduce() 적용
package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// BinaryOperator 구현 클래스 정의
class CompareString implements BinaryOperator<String> {
	@Override
	// reduce() 메서드가 호출될 때 불리는 메서드
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length)return s1; // s1 문자열 길이가 더 길면 s1 반환
		else return s2;	// s2 문자열 길이가 더 길면 s2 반환
	}
}

public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
		
		// 람다식을 직접 구현해 입력하는 방법
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;}));
		
		// BInaryOperator를 구현한 클래스 사용
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		}
	}