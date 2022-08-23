/*
 * 다운캐스팅
 * 상위 클래스를 자료형으로 선언해 형변환이 이뤄진 인스턴스의 경우 상위클래스에서 선언한 메서드와 멤버변수만 사용할 수 있음
 * 필요에 따라 원래 인스턴스에 구현되어 있는 더 많은 메서드와 멤버변수가 필요할 수 있음
 * 이때 상위클래스로 형변환된 하위클래스를 원래의 자료형으로 변환할 수 있는데 이것을 다운캐스팅이라고 함
 * 
 * instanceof
 * 다운캐스팅을 하기 전에 형변환된 인스턴스의 원래 자료형을 확인해야 변환할 때 오류를 막을 수 있음
 * 이를 확인하는 예약어가 instanceof 이며 코드구조는 다음과 같음
 * Animal hAnimal = new Human();
 * if(hAnimal instanceof Human) {	// hAnimal 인스턴스 자료형이 Human형이라면
 * Human human = (Human)hAnimal;	// 인스턴스 hAnimal을 Human형으로 다운캐스팅
 * 
 * 다운캐스팅은 묵시적 형변환이 안되기 때문에 (Human) 과 같이 자료형을 명시해야함
*/

// 원래 인스턴스형 확인 후 다운 캐스팅하기
package polymorphism;
import java.util.ArrayList;

class Animal1 {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human1 extends Animal1 {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger1 extends Animal1{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle1 extends Animal1 {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}
public class AnimalTest {
	ArrayList<Animal1> aniList = new ArrayList<Animal1>();
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting();
	}
	
	// ArrayList에 추가되면서 Animal1 형으로 형변환
	public void addAnimal() {
		aniList.add(new Human1());
		aniList.add(new Tiger1());
		aniList.add(new Eagle1());
		
		// 배열요소를 Animal1 형으로 꺼내서 move()를 호출할 시 재정의된 함수 호출
		for(Animal1 ani : aniList) {
			ani.move();
		}
	}

	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {	// 모든 배열요소 순회
			Animal1 ani = aniList.get(i);			// Animal1형으로 가져옴
			if(ani instanceof Human1) {				// 만약 Human1형이면
				Human1 h = (Human1)ani;				// Human1형으로 다운캐스팅
				h.readBook();
			}
			else if(ani instanceof Tiger1) {
				Tiger1 t = (Tiger1)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle1) {
				Eagle1 e = (Eagle1)ani;
				e.flying();
			}
			else {
				System.out.println("지원되지 않는 자료형입니다.");
			}
			
		}
	}
}
