/*
 ** List 인터페이스
 * 객체를 순서에 따라 저장하고 유지하는 데 필요한 메서드들이 선언되어 있는 인터페이스
 * 순차자료구조의 대표적인 예는 배열(07장)
 * 자바의 대표적인 배열 클래스는 ArrayList, Vector
 * 배열과 구현방식은 다르지만 순차자료구조를 구현한 linkedList
 * 
 *  
 ** ArrayList 클래스
 * 객체배열을 구현한 클래스로, 객체 순서를 기반으로 순차적으로 자료를 관리하는 프로그램 구현에 쓰임
*/

// ArrayList 활용한 클래스
package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;	// Member 클래스가 있는 패키지는 collection

public class MemberArrayList {
	private ArrayList<Member> arrayList; // ARrayList 선언

	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); // Member형으로 선언한 ArrayList 생성
	}
	
	// ArrayList 에 회원을 추가하는 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 조건에 맞는 ID를 가진 회원을 ArrayList에서 찾은 후 제거
//	public boolean removeMember(int memberId) {
//		for(int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i); // get() 메서드로 회원을 순차적으로 가져옴
//			int tempId = member.getMemberId();
//			if(tempId == memberId) { // 회원 ID가 매개변수와 일치하면
//				arrayList.remove(i); // 해당 회원을 삭제
//				return true; // 삭제 성공 시 true 출력
//			}
//		}
//		System.out.println(memberId + "가 존재하지 않습니다"); // 반복문이 끝날 때까지 해당 ID를 못 찾았을 경우 출력문
//		return false; // 삭제 실패 시 false 출력
//	}
	
	// ***** set 인터페이스와 같이 순서가 없는 자료형에서는  Iterator 클래스를 사용해야함
	// Iterator를 사용하여 요소를 순회하는 기능으로 removeMember 메서드 수정
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = arrayList.iterator(); // Iterator 반환
		while(ir.hasNext()) { // 요소가 존재하는 동안
			Member member = ir.next(); // 다음 회원을 반환
			int tempId = member.getMemberId();
			if(tempId == memberId) {  // 회원 아이디가 매개변수와 일치하면
				arrayList.remove(member); // 해당 회원 삭제
				return true; // true 반환
			}
		}
		// 끝날 때까지 삭제할 값을 못 찾은 경우의 출력문
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	// 전체 회원을 출력하는 메서드
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	// 특정 위치에 회원 추가 메서드
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
}
