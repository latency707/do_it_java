/*
 * 다형성
 * 다형성이란 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
 * 메서드의 코드는 변함이 없지만 어떤 매개변수가 넘어왔느냐에 따라 출력문이 달라짐
 * 
 * 추상 클래스, 인터페이스에서 구현되고 안드로이드, 스프링 등 자바기반 프레임워크에서 응용가능한 객체지향 프로그랭믜 중요한 개념임
 * 
 * 다형성의 장점
 * 하위클래스를 새로 구현해야 할 때 상위클래스를 상속받아 구현하면 모든 클래스를 상위클래스 자료형을 통해 쉽게 관리할 수 있음
 * 상위 클래스에서 공통부분의 메서드를 제공하고, 하위 클래스에서는 그에 기반한 추가요소를 덧붙혀 구현하면 코드 단순화와 유지보수에 용이
 * 필요에 따라 상속받은 모든 클래스를 하나의 상위 클래스로 처리할 수 있음
 * 다형성에 의해 각 클래스의 여러가지 구현을 실행할 수 있으므로 프로그램을 쉽게 확장할 수 있음
 * 
 * 요약하면 다형성을 잘 활용하면 유연하면서도 구조화된 코드를 구현해 '확장성있고 유지보수에 용이한' 좋은 프로그램 개발이 가능함
*/

// 다형성 테스트
package polymorphism;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest1 {
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}
	
	// 테스트용 메서드
	public void moveAnimal(Animal animal) {	// 매개변수의 자료형이 상위 클래스이므로 어떤 인스턴스가 넘어와도 모두 Animal 형으로 변환
		animal.move();	// 재정의된 메서드 호출
	}
}