/*
 * 객체 배열 사용하기
 * 동일한 기본 자료형 변수 여러개를 배열로 사용할 수 있듯이 참조 자료형 변수도 배열로 사용할 수 있음
 * # 참조 자료형 변수란 클래스형으로 선언하는 변수. '05장-6 참조자료형' 참고
 * 
 * 객체 자료형은 기본자료형 배열과 사용방법이 약간 다름
*/

// 객체 배열 만들기(1)
package array;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {}	// 디폴트 생성자
	
	// 책 이름, 저자명을 매개변수로 받는 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// bookname getter
	public String getBookName() {
		return bookName;
	}
	
	// bookname setter
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	// author getter
	public String getAuthor() {
		return author;
	}
	
	// author setter
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 책 정보 출력 메서드
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}

}
