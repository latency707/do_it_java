package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		// 순서대로 요소 추가
		shelfQueue.enQueue("Taebaek 1");
		shelfQueue.enQueue("Taebaek 2");
		shelfQueue.enQueue("Taebaek 3");
		
		// 입력 순서대로 요소 출력 및 삭제
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
