/*
 ** TreeMap 클래스
 * Map 인터페이스 구현 클래스 중 key로 자료를 정렬하려면 TreeMap을 통해 정렬할 수 있음
 * TreeMap은 TreeSet과 마찬가지로 이진 검색트리로 구현되어 있음
 * 정렬 기준이 key값이므로 key에 해당하는 클래스에 Comparable이나 Comparator 인터페이스를 구현해야함
 * 
 * 회원관리 프로그램에서 사용하는 key값인 회원ID는 Integer형인데, Integer 클래스에는 이미 Comparable 인터페이스가 구현되어 있음
*/

// TreeMap 활용 회원 관리 클래스
package map.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member); // key-value 페어로 맞추기
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId); // key 값에 맞는 자료 삭제
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}

}
