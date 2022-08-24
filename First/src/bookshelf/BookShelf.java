package bookshelf;
// BookShelf 클래스 구현
public class BookShelf extends Shelf implements Queue{
	// 배열에 요소 추가
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	// 배열 첫 요소를 삭제하면서 값 반환
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}
	
	// 배열 요소 개수 반환
	public int getSize() {
		return getCount();
	}
}
