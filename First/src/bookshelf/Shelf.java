/*
 * 인터페이스 구현과 상속 함께 쓰기
 * 한 클래스에서 클래스 상속과 인터페이스 구현을동시에 할 수 있음
 * Queue 인터페이스를 구현하고 shelf 클래스를 상속받는 Bookshelf 클래스를 순서대로 구현해볼 것
 * Queue는 자료구조의 한가지로, 처음 들어간 자료부터 꺼내어 쓰는 것을 뜻함
*/


package bookshelf;

import java.util.ArrayList;

//Shelf 클래스 만들기
public class Shelf {
	//자료를 순서대로 저장할 AL 선언
	protected ArrayList<String> shelf;
	
	// 디폴트 생성자로 Shelf 클래스를 생성하면 AL도 동시에 생성하는 생성자
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
