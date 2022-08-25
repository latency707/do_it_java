/*
 * toString() 메서드
 * 객체정보를 문자열로 바꿔주는 메서드로, Object 클래스를 상속받은 모든 클래스는 toString()을 재정의할 수 있음
*/

package object;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "Ant");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		
		// String과 Integer 클래스의 toString() 메서드
		String str = new String("test");
		System.out.println(str);	// test 출력
		Integer i1  = new Integer(100);
		System.out.println(i1);		// 100 출력
		// *** 두 클래스 출력결과가 해시코드가 아닌 이유는 각 클래스내에서 toString() 메서드를 재정의해두었기 때문 
	}
}
