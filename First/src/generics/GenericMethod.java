// 제네릭 메서드 구현
package generics;

public class GenericMethod { // 제네릭 클래스가 아님
	// 제네릭 클래스가 아니라도 제네릭 메서드를 내부에 구현할 수 있음
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2 ) { // 제네릭 메서드에서 사용한 자료형 매개변수 T는 메서드 내에서만 유효함
		double left = ((Number)p1.getX()).doubleValue();
		double right =((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();

		double width = right - left;
		double height = bottom - top;
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0); // p1, p2가 <Integer, Double> 형으로 선언되면 제네릭 메서드 <>에 자료형이 생략되어도 자동으로 Integer, Double로 유추됨
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println(("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다."));
	}

}
