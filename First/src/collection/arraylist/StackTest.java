/*
 ** ArrayList로 Stack and Queue 구현해보기
 * 스택은 상자쌓듯 자료를 관리하는 방식
 * 상자가 무너지지 않게 하기 위해 제일 나중에 올린 상자를 꺼내야함(Last In First Out; LIFO) 방식
 *  
 * 큐는 줄을 선 대기열처럼 먼저 추가된 데이터부터 꺼내서 사용하는 방식(First In First Out;FIFO)
 * 
 * 스택 & 큐는 자바 자체적으로 제공 및 인터페이스로 정의되어 있음
 * 
 ** 스택메모리의 구조는 스택 자료구조 형식임
 * 함수를 호출하면 스택 메모리에 지역변수가 생성됨. 이때 함수를 호출하면 호출된 함수가 끝날 때까지 해당 함수의 메모리 공간은 계속 남아 있음
 * 가장 나중에 호출된 함수와 그 함수의 지역변수가 사용하는 메모리는 스택자료구조와 같은 방식으로 운영됨
*/

package collection.arraylist;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	// 스택의 제일 끝에 요소 추가
	public void push(String data) {
		arrayStack.add(data);
	}
	
	// 스택의 제일 끝에서 요소를 꺼냄
	public String pop() {
		int len = arrayStack.size(); // ArrayList에 저장된 유효 자료 개수
		if(len == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		return(arrayStack.remove(len-1)); // 제일 끝에 있는 자료 반환 후 배열에서 제거
	}
	
}
public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.push("A"); // A
		stack.push("B"); // A - B
		stack.push("C"); // A - B - C
		
		System.out.println(stack.pop()); // A - B
		System.out.println(stack.pop()); // A
		System.out.println(stack.pop()); // null
	}

}
