/*
 ** Set 인터페이스
 * 순서 상관없이 중복을 허용하지 않는 경우에 Set 인터페이스를 구현한 클래스를 사용함
 * 대표적인 Set 인터페이스 구현 클래스에는 HashSet, TreeSet 이 이음
 * 
 ** HashSet 클래스
 * 집합자료구조를 구현하며 중복을 허용하지 않음
*/


// HashSet 테스트
package collection.hashset;

import java.util.HashSet;

public class HashsetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬")); // 강감찬을 2번 추가
		
		System.out.println(hashSet); // 1개의 강감찬만 출력, 자료추가 순서와 무관한 출력순서
	}

}
