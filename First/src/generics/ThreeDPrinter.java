/*
 *** 제네릭
 *
 **제네릭이란?
 *프로그램에서 변수를 선언할 때 모든 변수는 자료형이 있고 메서드에서 매개변수를 사용할 땓 자료형을 가지고 있음
 *대부분은 하나의 자료형으로 구현하지만 필요에 따라 변수나 메서드 자료형을 여러 형태로 바꿀 수 있다면 훨씬 유연한 프로그램이 될 것
 *'제네릭 프로그래밍'은 어떤 값이 1개의 참조자료형이 아닌 여러 참조자료형을 사용가능하도록 프로그래밍 하는 것을 뜻함 
 *제네릭은 참조자료형이 변환될 때 변환 검증을 컴파일러가 하므로 안정적임
 *
*/

// 제네릭의 필요성
package generics;

class Powder {} // 코드 작동용 깡통

public class ThreeDPrinter {
	// 입체모형의 재료가 파우더인 경우
//	private Powder material; 
//	
//	public void setMaterial(Powder material) {
//		this.material;
//	}
//	
//	public Powder getMaterial() {
//		return material;
//	}
	
	// 입체 모형의 재료가 플라스틱인 경우, 재료만 바뀌고 코드는 동일하다면 클래스 2개를 만드는 것은 비효율적임
	// 이 경우 어떤 재료든 쓸 수 있도록 material 변수의 자료형을 Object로 사용할 수 있음
	// Object를 활용한 코드
	private Object material;
	
	public void setMaterial(Object material) {
		this.material = material;
	}
	
	public Object getMaterial() {
		return material;
	}

	// Object material에 파우더를 재료 사용하기
	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		
		Powder p1 = new Powder();
		printer.setMaterial(p1); // 자동 형변환
		
		Powder p2 = (Powder)printer.getMaterial(); // 수동 형변환. Object 클래스를 사용하면 원래 자료형으로 반환하기 우해 매번 형변환을 해야해 번거로움. 이때 사용하는 방식이 '제네릭'
	}
}
