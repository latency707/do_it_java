// 상속받은 EPowder 클래스
package generics;

public class EPowder extends Material{
	// 추상메서드 doPrinting 구현
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다");
	}
	
	// toString 재정의
	public String toStrig() {
		return "재료는 Powder 입니다";
	}

}
