/*
 * static 응용 - 싱글턴 패턴
 * 객체지향 프로그램에서 단 하나의 인스턴스만을 생성하는 디자인 패턴을 singleton pattern 이라고 함
 * # 디자인패턴이란, 객체지향 프로그램을 어떻게 구현해야 보다 유연하고 재활용성이 높은 프로그램을 만들 수 있는지를 정리한 내용. 즉, 프로그램 특성에 따른 설계유형을 이론화한 내용
 * 여기서 살펴볼 싱글턴패턴은, static을 응용해서 프로그램 전반에 사용하는 인스턴스를 하나만 구현하는 식
 * 
 * 예시) 
 * 회사의 직원들을 객체 지향 프로그램으로 구현한다고 가정,
 * 직원은 여러명, 회사는 한군데
 * 따라서 직원은 여러 개의 인스턴스를 생성해야하지만 회사 객체는 1개만 생성해야함
 * Company 클래스는 싱글턴 패턴으로 만들기에 적합함 
 * 
*/

// 싱글턴 패턴으로 회사 클래스 구현하기
package singleton;

public class Company {
	//	클래스 내부에 static으로 프로그램 전체에서 사용할 유일한 인스턴스 생성, 마찬가지로 private 선언
	private static Company instance = new Company(); // 유일한 인스턴스 생성
	
	// private 생성자 만들기; 외부 클래스에서 생성자를 생성하는 것을 제어하기 위함
	private Company() {
	}
	
	// 외부에서 참조할 수 있는 public 메서드 생성, 인스턴스 생성과 무관하게 호출할 수 있어야 하므로 static 선언 필수
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance; // 유일하게 생성한 인스턴스 리턴
	}
	
	// CompanyTest에서 실제 사용 코드 만들기
	
	 

}
