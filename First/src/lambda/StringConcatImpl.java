// 클래스에서 인터페이스 구현
package lambda;

public class StringConcatImpl implements StringConcat {
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);
	}

}
