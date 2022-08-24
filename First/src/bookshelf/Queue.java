package bookshelf;
// Queue 선입선출? 
public interface Queue {
	void enQueue(String title);	// 배열 마지막 위치에 추가
	String deQueue();			// 배열 제일 처음 항목 반환
	int getSize();				// 현재 Queue에 있는 개수 반환
}
