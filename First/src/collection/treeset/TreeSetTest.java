/*
 ** TreeSet 클래스
 * 자바의 Collection 인터페이스나 Map 인터페이스를 구현한 클래스 ,
 * Tree로 시작하는 클래스는 데이터를 추가한 후 결과를 출력하면 결과값이 정렬됨
 * Tree는 자료의 중복을 허용하지 않는 동시에 출력 값을 정렬함
 * 자바는 정렬은 '이진 트리'를 사용함
 * 
 ** 이진 검색 트리 (Binary Search Tree ; BST)
 * 트리는 자료 사이의 계층 구조를 나타내는 자료 구조
 * 트리 자료 구조에서 각 자료가 들어가는 공간을 노드 라고 하고, 위아래로 연결된 노드의 관계는 부모-자식 노드라고 함
 * 이진 검색트리는 부모가 가지는 자식노드의 수가 2개이하이고 자료의 중복을 허용하지 않음
 * 왼쪽에 위치하는 자식노드는 부모노드보다 항상 작은 값을 가지고, 오른쪽은 항상 큰 값을 가짐
 * 따라서 특정 값을 찾으려고 할 때 대소에 따라 좌우 이동방향이 정해지기 때문에 효과적인 자료검색이 가능함
*/

// TreeSet 테스트
package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}
