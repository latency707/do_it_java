/*
 ** Q)ArrayList 특정 위치에 회원 추가해보기
 * Hint) public void insertMember(Member member, int index) 같은 형태의 메서드를 구현해보시오
*/

// ArrayList 활용
package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// 신규 회원 인스턴스 생성
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		// ArrayList에 회원 추가
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		// 전체 회원 출력
		memberArrayList.showAllMember();
		
		// 홍길동 회원 삭제
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember(); // 삭제 후 전체출력
		
		// 특정 위치에 회원 추가
		memberArrayList.insertMember(memberHong, 0);
		
		memberArrayList.showAllMember();
	}

}
