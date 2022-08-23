/*
 * 추상클래스를 상속받은 클래스는 추상클래스가 가진 메서드를 상속받음
 * 상속받은 메서드에는 추상메서드도 포함되기 때문에 
 * 	하위메서드에서도 추상메서드를 구현하거나, 클래스 자체를 추상클래스로 만들어야 오류가 발생하지 않음
 * 추상메서드를 전부 구현하면 추상 클래스가 아닌 구체적인 클래스가 됨  
*/

// 추상클래스 상속받기
package abstractex;

public class DeskTop extends Computer {

	// 추상메서드 바디 작성1
	@Override
	public void display() {
		System.out.println("DeskTop display()");
		
	}

	// 추상메서드 바디 작성 2
	@Override
	public void typing() {
		 System.out.println("DeskTop typing()");
		
	}

}
