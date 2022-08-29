/*
 ** Collection 인터페이스
 * 하위에 List 인터페이스와 Set 인터페이스를 지닌 인터페이스
 * List를 구현한 클래스는 순차적인 자료관리에 사용
 * Set 인터페이스는 수학에서 집합의 개념. 중복되지 않는 객체를 다루는 데 쓰임
 * 
 ** Collection 인터페이스 주요 메서드
 * boolean add(E e)			: Collection에 객체 추가
 * void clear()				: Collection 의 모든 객체 제거
 * Iterator<E> iterator		: Collection을 순환할 반복자를 반환
 * boolean remove(Object o)	: Collection에 매개변수에 해당하는 인스턴스가 존재하면 제거
 * int size()				: Collection에 있는 요소의 개수 반환	
 * 	
 * 
 ** Map 인터페이스
 * 하나가 아닌 쌍으로 되어있는 자료(key-value)를 관리하는 메서드들이 선언되어있는 검색용 자료구조
 * key는 유일하게 존재하는 것(이름, 나이), value는 여러개, 중복 모두 가능한 것
 * 
 ** Map 인터페이스 주요 메서드
*/

// Member 클래스 구현 
package collection;

public class Member implements Comparable<Member>{ // 트리 정렬 기준 인터페이스 Comparable
	private int memberId; // 회원 ID
	private String memberName; // 회원 이름
	
	public Member(int memberId, String memberName) {
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
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) // 매개변수로 받은 회원 ID가 자신의 회원 ID와 같다면
				return true;					 // true 반환
			else
				return false;
		}
		return false;
	}
	
	// compareTo() 메서드 재정의
	@Override
	public int compareTo(Member member) {
//		return (this.memberId - member.memberId) /* *(-1) 내림차순으로 정렬하고 싶다면 -1을 곱하자 */; // 추가한 회원 ID와 매개변수로 받은 회원 ID를 비교
		// 두 값의 대소를 비교해 같으면 0, 크거나 작으면 각각 양수, 음수를 반환
		
		// Q) 출력 결과를 회원 이름순으로 정렬되도록 메서드를 수정하시오
		// A)
		return this.memberName.compareTo(member.memberName);
	}
	

}
