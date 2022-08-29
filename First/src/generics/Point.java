/*
 * 제네릭 메서드 활용
 * 메서드의 매개변수를 자료형 매개변수로 사용하는 경우에 대해 알아보기
 * 제네릭 메서드의 일반적인 형식은 다음과 같음
 * public <자료형 매개변수> 봔환형 메서드명(자료형 매개변수...){}
 * 반환형 앞쪽의 <자료형 매개변수>는 여러개일 수도 있으며 메서드 내에서만 유효한 변수
*/

// 자료형 매개변수가 2개인 제네릭 클래스
package generics;

public class Point<T, V> { // x, y 좌표가 정수 or 실수, 2가지 이상일 수가 있으므로 자료형 매개변수 T,V로 표현
	
	T x;
	V y;
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	
	// 제네릭 메서드 getX(), getY()
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}

}
