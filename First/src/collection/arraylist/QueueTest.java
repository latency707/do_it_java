// ArrayList로 큐 구현
package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	// 큐의 제일 끝에 데이터 추가
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	// 큐의 제일 앞에서 데이터 꺼냄
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다");
			return null;
		}
		return (arrayQueue.remove(0)); // 제일 앞의 자료 반환 후 배열에서 제거
	}
}

public class QueueTest {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A");	// A
		queue.enQueue("B"); // A - B
		queue.enQueue("C");	// A - B - C
		
		System.out.println(queue.deQueue()); // B - C
		System.out.println(queue.deQueue()); // C
		System.out.println(queue.deQueue()); // null
		
	}
}