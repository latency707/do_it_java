// MemberHashSetTest 
package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동"); // ID 중복인 회원 추가
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember(); // ID가 겹치는 박서훤, 홍길동이 추가되어 중복 출력됨. Member 클래스에서 같은 객체를 처리하는 메서드 재정의가 필요 
	}

}
