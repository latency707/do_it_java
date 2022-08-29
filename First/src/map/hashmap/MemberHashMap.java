/*
 ** Map 인터페이스 
 * Map 인터페이스는 자료를 쌍(pair)으로 관리하는데 필요한 메서드가 정의되어 있음
 * key-valye 쌍으로 이뤄진 객체의 key 값은 유일하며 value 값은 중복될 수 있음
 * 
 * Map 인터페이스를구현한 클래스는 내부적으로 hash 알고리즘에 의해 구현돠어 있음
 *
 ** HashMap 클래스
 * HashMap은 Map 인터페이스 구현 클래스 중 가장 많이 사용함
 * HashMap의 자료관리 방식은 Has 방식이고 Hash 방식의 자료를 저장하는 공간을 해시테이블이라고 함
 * key값이 정해지면 그에 대응하는 해시 테이블의 저장위치가 정해지는데 이런 위치를 계산하는 함수를 '해시 함수'라고 하고,
 * index = hash(key); 로 표현할 수 있음
 * 새로운 key-value 자료가 입력되거나 key를 알고 있는 상태에서 value를 검색하는 데 걸리는 산술적으로 계산할 수 있음
 * 즉, 자료 추가속도나 검색속도가 상당히 빠름
 * 
 * 반면 서로 다른 key값에 같은 index가 반환되는 충돌이 발생할 수 있음
 * 따라서 해시테이블에 데이터를 꽉 채우기 전에 적정 수준에서 테이블을 확장해 충돌확률을 관리해줘야함
 * 
 * 또한 Map 인터페이스에서의 key값은 중복될 수 없으므로 equals() 메서드와 hashCode()메서드를 재정의하여 사용하는 것을 권장
 * 멀티스레드 환경이 아니라면 Hashtable보다는 HashMap 사용을 권장함
*/

package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	// HashMap에 회원 추가하는 메서드
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member); // key-value 쌍으로 추가
	}
	
	// HashMap에서 회원을 삭제하는 메서드
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { // HashMap에 매개변수로 받을 key값=회원 ID 가 있다면
			hashMap.remove(memberId); // 해당 회원 삭제
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	// 모든자료를 한번에 순회하는 방법이 없는 Map 인터페이스에서 모든 자료를 순회하려면?? 
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) { // 다음 key가 있으면
			int key = ir.next(); // key 값을 가져와서
			Member member = hashMap.get(key); // key로부터 value 가져오기
			System.out.println(member);
		}
		System.out.println();
		
	}

}
