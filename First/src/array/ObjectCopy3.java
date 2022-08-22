/*
 * 깊은 복사
 * 객체 배열을 복사하면 어떤 방식이든 인스턴스 주소 자체를 복사함
 * 인스턴스를 별도로 관리하고 싶다면 직접 인스턴스를 만들고 그 값을 복사해야하는데 이를 '깊은 복사'라고함
 * 
 *   
*/

package array;

public class ObjectCopy3 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("Taebaek", "J.J.R.");
		bookArray1[1] = new Book("Damian", "H.H.");
		bookArray1[2] = new Book("How to live", "Y.S.M.");
		
		// 디폴트 생성자로 bookArray2 배열 인스턴스 생성
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		// bookArray1 요소를 생성한 bookArray2 인스턴스에 복사
		for (int i = 0 ; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for (int i = 0 ; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();	// bookArray2 요소값 출력
		}
		
		bookArray1[0].setBookName("Namok");
		bookArray1[0].setAuthor("P.W.S.");
		
		System.out.println("=== bookArray1 ===");
		for(int i = 0 ; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();	// bookArray1 요소값 출력
		}
		
		System.out.println("=== bookArray2 ===");
		for(int i = 0 ; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); 	// bookArray2 요소값 출력
		}
	}

}
