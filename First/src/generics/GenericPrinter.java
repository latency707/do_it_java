/*
 ** 제네릭 클래스 정의하기
 * 제네릭에서는 여러 참조자료형을 사용해야하는 부분에 Object 대신 하나의 문자로 표현함
 * 예시) GenericPrinter<T>
 * 여기서 T를 자료형 매개변수(type parameter)라고 부름
 * <T> 위치에 추후 실제로 사용할 자료형을 지정함
 * T 외에도 E(element), K(key), V(value) 등 다른 문자도 사용할 수 있음
 * 각 메서드에서 해당 자료형이 필요한 부분에는 모두 이니셜 문자를 사용해 구현함
 * 
 ** 다이아몬드 연산자
 * 자바 7부터는 제네릭 자료형 클래스를 생성할 때 생성자 자료형을 명시하지 않아도 됨
 * ArrayList<> 에서 <>가 그 예로 이를 다이아몬드 연산자라고 지칭함
 * 
 ** 자료형 매개변수와 static
 * 자료형 매개변수(T,E,K 등)의 자료형은 제네릭 클래스의 인스턴스가 생성될 때 확정됨
 * 반면 static 변수나 static 메서드 내부변수의 자료형에는 자료형 매개변수를 사용할 수 없음
 * 
 ** 제네릭 자료형 추론
 * 자바 10부터 지역변수에 한해서 자료형을 추론할 수 있으므로 제네릭에도 적용이 가능함
 * ArrayList<String> list = new ArrayList<String>();
 * ===== 위아래 코드는 동일한 결과 =====
 * var list = new ArrayList<String>(); // list가 지역변수로 선언된다는 전제하에 가능한 코드
 *
 ** 제네릭 구현시 형변환을 하지 않아도 되는 이유
 * 제네릭 클래스를 사용하면 일단 대입된 자료형이 잘 쓰였는지 확인한 후,
 * class 파일을 생성할 때 T를 사용한 곳에 지정된 자료형에 따라 컴파일을 하기때문에 형변환이 필요없음
 * 즉 컴파일러가 자료형을 확인해주기 때문에 안정적이면서 형변환 코드가 줄어듦
 */

// Q) 플라스틱 액체가 재료인 프린터 선언해보기
// A) Plastic 클래스는 상단에 선언

package generics;

public class GenericPrinter<T> {
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
}