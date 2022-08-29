/*
 * TreeSet 활용하기
 * TreeSetTest.java 예제에서 별도 코드 구현없이 요소들이 정렬되어있었음
 * 그 이유는 String 클래스 안에 이미 정렬방식이 구현되어 있기 때문
 * 이번에는 패키지를 새로 만들고 TreeSet을 활용한 회원관리 프로그램을 구현해볼 것
*/

// TreeeSet 활용한 회원관리 프로그램 구현
package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	// TreeSet에 회원을 추가하는 메서드
	public void addMember(Member member) {
		treeSet.add(member);
	}

// TreeSet에서 회원을 삭제하는 메서드
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()){
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	// 전체 회원을 출력하는 메서드
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
