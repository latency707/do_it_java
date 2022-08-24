package interfaceex;

public class MyClass implements MyInterface {
	
	// X 인터페이스 상속 메서드 x() 구현
	@Override
	public void x() {
		System.out.println("x()");
	}
	
	// Y 인터페이스 상속 메서드 y() 구현
	@Override
	public void y() {
		System.out.println("y()");
	}
	
	// MyMethod 인터페이스의 메서드 myMethod() 구현
	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}
}
