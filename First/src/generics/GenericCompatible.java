/*
 * 제네릭에서 대입된 자료형을 명시하지 않은 경우
 * 제네릭 클래스 사용시에슨 다이아몬드 연산자에 대입된 자료형을 명시해야 함
 * 그러나 구버전과의 호환을 위해 자료형 명시 없이도 사용할 수 있음
 * 
 * 이 경우 컴파일 오류는 아니지만 자료형을 명시하라는 의미의 노란색 경고줄이 발생함
*/

package generics;

public class GenericCompatible {
	public static void main(String[] args) {
		GenericPrinter powderPrinter2 = new GenericPrinter ();
		powderPrinter2.setMaterial(new Powder2());
		Powder2 powder = (Powder2)powderPrinter2.getMaterial();
		System.out.println(powderPrinter2);
		
		// 여러 자료형을 동시에 쓰려면 Object 자료형 사용
		GenericPrinter<Object> generalPrinter = new GenericPrinter<Object>();
		
	}

}
