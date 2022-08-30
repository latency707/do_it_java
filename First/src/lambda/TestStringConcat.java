// 메서드 테스트
package lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		// 클래스 구현 메서드 테스트
//		StringConcatImpl concat1 = new StringConcatImpl();
//		concat1.makeString(s1,  s2);
		
		// 람다식으로 인터페이스 구현
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);
	}

}
