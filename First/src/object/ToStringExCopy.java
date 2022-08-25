package object;

class Book2 extends Book {
	Book2(int bookNumber, String bookTitle) {
		super(bookNumber, bookTitle);
	}

	@Override 
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}

public class ToStringExCopy {
	public static void main(String[] args) {
		Book2 book2 = new Book2(200, "Ant");
		
		System.out.println(book2);
		System.out.println(book2.toString());
		
		// String과 Integer 클래스의 toString() 메서드
		String str = new String("test");
		System.out.println(str);	// test 출력
		Integer i1  = new Integer(100);
		System.out.println(i1);		// 100 출력
		// *** 두 클래스 출력결과가 해시코드가 아닌 이유는 각 클래스내에서 toString() 메서드를 재정의해두었기 때문 
	}
}