/*
 * 클래스형 객체 배열 생성은 인스턴스가 바로 생성되지 않고 인스턴스 주소값을 담을 공간을 생성함
 * 따라서 클래스형으로 객체 배열을 생성하면 생성한 각 공간은 null 값으로 초기화됨
*/

// 객체 배열 만들기(2)
package array;

public class BookArray {
	public static void main(String[] args) {
		Book[] library = new Book[5];	// Book 클래스형 객체 배열 생성
		
		for (int i = 0 ; i < library.length ; i++) {
			System.out.println(library[i]);	// null 5회 출력
		}
		
		// 객체 배열 만들기
		// 인스턴스 생성 후 배열에 저장
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		
		for(int i = 0; i < library.length ; i++) {
			library[i].showBookInfo();	// Book 인스턴스 멤버
		}
		
		for(int i = 0; i < library.length ; i++) {
			System.out.println(library[i]);	// Book 인스턴스를 저장한 메모리 공간 주소
		}
	}

}
