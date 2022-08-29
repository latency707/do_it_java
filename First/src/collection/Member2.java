/*
 ** Comparator 인터페이스
 * 정렬을 구현하는 데 사용하는 인터페이스로
 * compare() 메서드를 구현해야하며, 이 메서드에 매개변수를 2개 전달하고 전달되는 2개의 매개변수를 비교함
 * 첫번째 매개변수가 더 클 때 양수를 반환
 * 오름차순으로 정렬
 * 
 * Comparator 사용 시 유의할 점은 TreeSet 생성자에 Comparator를 구현한 객체를 매개변수로 전달하기 떄문에 다음과 같이 코드를 구현해야함
 * TreeSet<Member> treeSet = new TreeSet<Member>(new Member();
 * 
 * 일반적으로 Comparator 보다 Comparable 인터페이스를 더 많이 사용함
 * 
 * 다만 어떤 클래스가 이미 Comparable 인터페이스를 구현했을 때, 클래스의 정렬방식을 정의할 때 Comparator 인터페이스를 사용할 수 있음
 * 기존에 Comparable 에서 정의되어 있는 정렬기준을 수정하기에 좋음
 * 
*/

package collection;

import java.util.Comparator;

public class Member2 {
	private int memberId;
	private String memberName;
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMenberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 ID는 " + memberId + "입니다";
	}
	
	// MemberHashSetTest 충복값 처리를 위한 메서드 재정의
	@Override
	public int hashCode() {
		return memberId; // hashCode() 메서드가 회원 ID를 반환하도록 제정의
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			if(this.memberId == member.memberId) // 매개변수로 받은 회원 ID가 자신의 회원 ID와 같다면
				return true;					 // true 반환
			else
				return false;
		}
		return false;
	}
	
	
	
	
	// compare() 메서드 재정의
	public int compare(Member2 mem1, Member2 mem2) {
		return mem1.getMemberId() - mem2.getMemberId(); // 전달받은 2개의 매개변수를 비교
	}

}
