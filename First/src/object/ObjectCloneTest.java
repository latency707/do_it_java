/*
 * clone() 메서드
 * 객체 원본을 유지해놓고 복사본울 사용한다거나,
 *  기본 틀(prototype) 의 복사본을 사용해 동일한 인스턴스를 만들어 복잡한 생성 과정을 간단히 하려는 경우에 사용함
 *  
 *  Object 클래스에 proteted Object clone(); 과 같이 선언되어 있음
 *  객체를 복제해 또 다른 객체를 반환해주는 메서드 
*/

// clone() 메서드로 인스턴스 복제
package object;

class Point {
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + ", " + "y = " + y;
	}
}

class Circle implements Cloneable{ // Cloneable: 객체를 복제해도 된다는 의미로 선언하는 인터페이스
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		this.radius = radius;
		point = new Point(x, y);
	}
	
	public String toString() {
		return "원점은 " + point + "이고, " + "반지름은 " + radius + "입니다.";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException { // throw CloneNotSupporeted Exception : clone() 메서드를 사용할 때 발생할 수 있는 오류를 예외처리하는 예약어
		return super.clone();
	}
}

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone(); // clone() 메서드를 사용해 circle 인스턴스를 copyCircle에 복제함
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}

}
