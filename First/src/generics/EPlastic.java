// 상속받은 EPlastic 클래스
package generics;

public class EPlastic extends Material {
	// 추상메서드 doPrinting 구현
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다");
	}
	
	// toString 재정의
	public String toString() {
		return "재료는 Powder입니다";
	}

}
