/*
 * <T extends 클래스>는 상위 클래스 메서드를 사용할 수 있음
 * T는 컴파일할 때 Object 클래스로 변환되기 때문에 Object 클래스가 제공하는 기본 메서드만 사용할 수 있음(자료형을 알 수 없으므로)
 * <T extends 클래스>는 컴파일할 때 Object가 아닌 extends 한 자료형으로 변환(ex-Material)되기 때문에 상위 클래스에서 선언/구현한 메서드를 모두 사용할 수 있음 
*/

// GenericPrinter<T extends Material> 클래스
package generics;

public class GenericPrinterE<T extends Material>{ // 사용 자료형에 제한을 두는 extends 예약어
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting(); // 상위 클래스 Material의 메서드 호출
	}
}
