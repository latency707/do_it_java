/*
 * 인스턴스와 힙 메모리 (heap memory)
 * new 예약어로 인스턴스들이 생성되면 각각이 지니고 있는 멤버변수들을 저장할 공간이 있어야함
 * 이때 사용하는 메모리를 힙 메모리라고 함
 * 
 * 생성된 클래스를 A 변수에 대입하면 인스턴스가 저장된 메모리를 A변수가 가리킴
 * 변수 A는 지역변수로 스택 메모리에 생성됨
 * 지역변수 A에 생성된 인스턴스를 대입하는 것은 A에 인스턴스가 생성된 힙메모리의 주소를 대입한다는 것과 동일한 의미 
*/

// 참조 변수의 내용 출력해보기
package classpart;

public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "A.Y.S";
		
		Student student2 = new Student();
		student2.studentName = "A.S.Y";
		
		System.out.println(student1);	// 패키지명.클래스명@주소값(hash code)
		System.out.println(student2);	// 패키지명.클래스명@주소값(hash code)
	}

	/*
	 * 개념 간략정리
	 * 객체: 객체 지향 프로그램의 대상, 생성된 인스턴스
	 * 클래스 : 객체를 프로그래밍하기 위해 코드로 만든 상태
	 * 인스턴스 : 클래스가 메모리에 생성된 상태
	 * 멤버 변수 : 클래스의 속성, 특성
	 * 메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현
	 * 참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
	 * 참조 값 : 생성된 인스턴스의 메모리 주소 값
	*/
	
}
