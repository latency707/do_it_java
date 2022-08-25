/*
 * HashCode() 메서드
 * 해시(hash)는 정보를 저장하거나 검색할 때 사용하는 자료구조임
 * 정보를 어디에 저장할 것인지, 어디서 가져올 것인지 해시 함수를 사용해 구현함
 * 해시함수는 객체의 틍정정보(key 값)를 매개변수값으로 넣으면 그 객체가 저장되어야할 위치나 저장된 해시 테이블 주소(위치)를 반환함
 * 객체 정보를 알면 해당 객체의 위치를 빠르게 검색할 수 있음
 * 
 * Object 클래스의 toString() 메서드의 원형을 살펴보면,
 * getClass().getName() + '@'_Integer.toHexString(hashCode()
 * 참조변수 출력시에 나오는 16진수 값이 '해시코드 값'이고 JVM이 힙메모리에 저장한 인스턴스 주소값임
 * 즉 자바에서는 두 인스턴스가 같으면 hashCode() 메서드 반환하는 hashCode값이 같아야 한다는 것
 * 따라서 논리적으로 같은 두 객체도 같은 해시코드 값을 반환하도록 hashCode() 메서드를 재정의할 필요가 있음
 * equals() 메서드를 재정의했다면 hashCode() 메서드도 재정의해줘야한다는 뜻
*/

// String, Integer 클래스의 재정의된 hashCode() 메서드 살펴보기
package object;

public class HashCodeTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// abc 문자열의 해시코드값 출력
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		// Integer(100)의 해시코드 값 출력
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}
	
	// 앞에서 구현한 Student 클래스에 hashCode() 재정의해 추가하기
	/* 일반적으로 hashCode() 메서드 재정의할 때는 equals() 메서드에서 논리적으로 같다는 것을 구현하는데 쓴 멤버변수를 활용하는 것이 좋음
	*/

}
