/*
 * 기존 배열의 단점과 ArrayList
 * 자바에서 제공하는 기본 배열은 항상 배열 길이를 정하고 시작해야하며, 중간에 위치한 요소를 비워둘 수 없음
 * 따라서 수정사항을 반영하기 어렵고 복잡하다는 단점이 있음
 * 
 * 그래서 자바에서 객체 배열을 좀 더 쉽게 사용할 수 있도록 객체배열 클래스 ArrayList를 제공함
 * ArrayList의 주요 메서드
 * boolean Add(E e)		: 요소 1개를 배열에 추가. E는 요소의 자료형
 * int size()			: 배열에 추가된 요소 전체 개수를 반환
 * E get(int index)		: 배열의 index 위치에 있는 요소값 반환
 * E remove(int index)	: 배열의 index 위치에 있는 요소값을 제거하고 제거한 값 반환
 * boolean isEmpty()	: 배열이 비어있는지 확인
 * 
 * ArrayList 기본 형식
 * ArrayList<E> arrayName = new ArrayList<E>();
*/

// ArrayList 클래스 사용해보기
package array;
import java.util.ArrayList;	// ArrayList 클래스 import

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();	// ArrayList library 선언
		
		// add() 메서드로 요소값 추가
		library.add(new Book("Taebaek", "J.J.R."));
		library.add(new Book("Damian", "H.H"));
		library.add(new Book("How to live", "Y.S.M."));
		library.add(new Book("The land", "P.K.R."));
		library.add(new Book("The little prince", "Saint-Exupery"));
		
		for(int i = 0; i < library.size(); i++) {	// library.size() 배열에 추가된 전체 요소 개수 
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println( );
		
		System.out.println("=== Enhanced For Loop ===");
		for(Book book : library) {
			book.showBookInfo();
		}
	}
		

}
