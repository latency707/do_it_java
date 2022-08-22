/*
 * 얕은 복사
 * 앞에서 객체 배열 사용시에는 반드시 인스턴스를 생성한 후 객체 배열을 입력해야 한다고 했음
 * 그러나 ObjectCopy1 에서는 인스턴스 생성 없이도 요소값이 출력됨
 * 이유는 인스턴스 자체가 아닌 기존 인스턴스의 주소값만 복사하는 '얕은 복사'가 이뤄졌기 때문
 * 
 * 얕은 복사의 문제점은 두 배열의 서로 다른 요소가 같은 인스턴스를 가리키고 있으므로 복사되는 배열의 인스턴스 값이 변경되면 두 배열이 모두 영향을 받음
 */
package array;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("Taebaek", "J.J.R.");
		bookArray1[1] = new Book("Damian", "H.H.");
		bookArray1[2] = new Book("How to live", "Y.S.M.");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("Namok");
		bookArray1[0].setAuthor("P.W.S.");
		
		System.out.println("=== bookArray1 ===");
		for(int i = 0 ; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("=== bookArray2 ===");
		for(int i = 0 ; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}

}
