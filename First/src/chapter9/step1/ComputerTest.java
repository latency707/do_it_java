/*
 * 추상클래스를 만드는 이유
 * 추상클래스는 상속을 하기위해 만든 클래스임
 * 추상클래스에서 구현하는 메서드는 하위클래스에서도 사용할, 즉 구현내용을 공유할 메서드를 구현함
 * 하위클래스별로 내용을 각각 다르게 구현해야한다면 구현내용을 추상메서드로 남겨 구현은 하위에 위임하는 것임
 * 
 * 추상클래스는 많은 프레임워크에서 사용하고있는 구현방식임
 * 프레임워크에서 자체적으로 구현해둔 코드는 내부적으로 사용하거나 상속받은 모든 클래스가 공유하는 메서드임
 * 그래고 구현을 미뤄놓은 추상메서드는 실제 앱에서 어떻게 만드냐에 따라 달리 구현해야할 내용으로 채우도록 선언만 해둔 것
*/

// 추상클래스는 인스턴스를 생성할 수 없다!
//package chapter9.step1;
//
//public class ComputerTest {
//	public static void main(String[] args) {
//		Computer c1 = new Computer();
//		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();
//		Computer c4 = new MyNoteBook();
//	}
//
//}
