// HashSet 활용한 회원 관리 프로그램 구현
package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet; // Hashset 선언
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>(); // HashSet 생성
	}
	
	// HashSet에 회원 추가
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	// 매개변수로 받은 회원 ID에 해당하는 회원을 삭제하는 메서드
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator(); // Iterator를 활용해 순화함
		
		while(ir.hasNext()) {
			Member member = ir.next(); // 회원을 1명씩 가져와서
			int tempId = member.getMemberId(); // ID 비교
			if(tempId == memberId) { // ID가 동일할 경우
				hashSet.remove(member); // 회원 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}

	// 모든 회원 출력
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
