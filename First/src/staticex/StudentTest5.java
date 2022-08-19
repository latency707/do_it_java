/*
 * 클래스 메서드와 인스턴스 변수
 * 클래스 메서드 내부에서는 인스턴스 변수를 사용할 수 없음
 * 
 * Student2 클래스를 예로 들면,
 * 	// serialNum의 getter
	public static int getSerialNum() {
		int i = 10;
		studentName = "Ji Won Lee";
		return serialNum;
	}
	
	studentName 은 오류가 발생함
 	studentName은 Student2 클래스의 멤버변수로, 인스턴스가 생성될 때 만들어지는 인스턴스 변수임 
 	인스턴스 변수는 인스턴스 생성 전에는 메모리가 할당되지 않으므로 클래스 메서드에서 참조할 수 없음
 	
 * 요약
 * 클래스 메서드 내부에서 지역변수와 클래스 변수는 사용 가능 / 인스턴스 변수는 사용 불가능
 * 일반 메서드에서는 클래스 변수를 사용할 수 있음(클래스 변수(=static 변수) 는 클래스 작동 최초에 생성되기 때문!)
*/

// studentName 변수 살펴보기
package staticex;

public class StudentTest5 {
	public static void main(String[] args) {
		System.out.println(Student2.getSerialNum()); // 인스턴스 생성 없이도 호출됨
	}

}
