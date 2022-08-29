/*
 ** LinkedList 클래스
 * 
 * 
 * 
 * 
 ** 배열과 링크드 리스트의 차이
 * 배열은 생성 시 용량을 지정하고, 요소가 허용 용량을 넘을 경우 용량을 늘려가며 요소값을 복사하는 과정을 거침
 * 링크드 리스트는 요소를 추가할 때마다 동적으로 요소 메모리를 생성하기 때문에 배열같은 번거로움이 없음
 * 
 * 링크드 리스트는 자료를 배열 중간에 추가하거나 삭제할 때 자료이동이 배열보다 적음
 * 
 * 배열은 물리적으로 연결된 자료기때문에 index 활용에 유리함
 * 
 * 자료의 변동(삽입/삭제)가 많으면 링크드 리스트를 구현
 * 자료 변동이 거의 없으면 배열을 구현
*/

// LinkedList 클래스 사용
package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		// 링크드 리스트에 요소 추가
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		// 리스트 전체 출력
		System.out.println(myList);
		
		// 링크드 리스트의 첫 번째 인덱스에에 D 추가
		myList.add(1, "D");
		System.out.println(myList);
		
		// 링크드 리스트의 제일 앞자리에 0 추가
		myList.addFirst("0");
		System.out.println(myList);
		
		// 링크드 리스트의 제일 뒤 요소 삭제 후 출력
		System.out.println(myList.removeLast());
		System.out.println(myList);
	}
}
