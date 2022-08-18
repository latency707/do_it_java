/*
 * 객체와 객체 지향 프로그래밍
 * 객체의 사전적 정의는 '의사나 행위가 미치는 대상'
 * 눈에 보이는 사물인 사람, 자동차, 건물 등은 모두 객체이며, 주문, 생산, 관리 등 행동을 나타내는 단어도 객체가 될 수 있음
 * 
 * 객체 지향 프로그래밍이란, '어떤 대상(객체)을 가지고 프로그래밍하는 것이라는 개념
 * 
 * 절차 지향 프로그래밍이란 순서대로 일어나는 일을 시간순으로 프로그래밍 하는 것을 말함
 * ex- 일어난다 - 씻는다 - 밥먹는다 - 버스탄다 - 학교도착
 * 
 * 객체 지향 프로그래밍이란 객체를 정의하고 객체 간 협력을 프로그래밍하는 것
 * 학생 객체(학번, 이름, 학년, 사는곳), 밥 객체(각종 음식 정보(기능)), 버스(버스 정보(기능)) 등 
 * 
 * 클래스란?
 * 클래스는 객체의 속성과 기능을 코드로 구현한 것이고 객체를 클래스로 구현한 것을 '클래스를 정의한다' 라고 함
 * 클래스 정의에는 클래스 이름과 클래스의 속성 또는 특성이 필요함
 * 
 * 객체가 가지는 일반적인 속성을 클래스 내부에 변수로 선언하여 클래스를 구현하는데, 이렇게 선언하는 클래스의 속성을 '멤버 변수' 라고 함
*/

// 학생 클래스 만들기
package classpart;

public class StudentProto {
	// 멤버 변수 선언
	int studentID;
	String studentName;
	int grade;
	String address;
	
}