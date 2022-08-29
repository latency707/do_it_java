// MemberTreeSet 테스트
package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동"); // ID 중복회원 추가 시도
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
		 
		/*** 이대로 실행 시 트리 형성의 기준이 되는 환경을 구현하지 않았다는 오류가 발생함
		 * 이때 트리의 기준을 만드는데 사용하는 인터페이스가 Comparable 또는 Comparator
		 * Comparable: compareTo() 추상메서드로 자기자신과 전달받은 매개변수를 비교하는 인터페이스 -> 즉 Member 클래스에서 메서드를 구체화해야함
		 *   
		 * 정렬방식은 정렬 기준값이 있는 Member 클래스에 구현해야함
		 * public class Member implements Comparable<member>{
					body
			}
		 */
		
		// 구현 후 실행 시 ID 오름차순으로 결과값이 정렬
		// 내림차순으로 하고 싶으면 Member.compareTo() 메서드의 연산에 01을 곱해서 반환값을 음수로 만들면 됨
		
	}

}
