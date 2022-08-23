/*
 * 08장 연습문제
 * Q1) 자바에서 어떤 클래스의 기능을 확장하여 새로운 클래스를 만들기 위해 상속을 합니디ㅏ.
 * 		이때 사용하는 예약어는 [extends] 입니다.
 * Q2) 하위 클래스가 상위 클래스의 생성자를 호출하거나 상위 클래스의 멤버변수, 메서드를 호출하기 위해
 * 		사용하는 예약어로 상위 클래스의 주소, 즉 참조값을 나타내는 예약어는 [super]입니다.
 * Q3) 클래스를 상속받은 상태에서 상위 클래스에 이미 정의되어 있는 메서드를 하위 클래스에서 사용하기에
 * 		적절하지 않은 경우에 해당 메서드를 재정의할 수 있습니다.
 * 		이것을 [메서드 오버라이딩]이라고 합니다.
 * Q4) 다음 코드는 오류가 발생합니다. 오류 발생 원인을 설명하세요. [ 내용 생략 ]
 * A) 상위클래스 Employee에 디폴트 생성자가 없으므로 하위생성자 Engineer 에서도 생성자를 정의하고.
 * 		super 예약어를 사용해 상위클래스 생성자를 명시적으로 호출해야함
 * Q5) 다음 출력결과가 나오도록 빈칸을 채우시오
 * A) 답은 Practice1Test.java에 작성
 * <출력결과>
 * Circle
 * Triangle
 * Shape 
*/

package polymorphism;

import java.util.ArrayList;

public class Practice1 {
	// Q4)
	public class Employee {
		public String name;
		public String grade;
		public Employee(String name) {
			this.name = name;
		}
	}
	
	public class Engineer extends Employee{
		// 생성자 정의 및 명시적 호출
		public Engineer(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}
		private String skillset;
		public String getSkillSet() {
			return skillset;
		}
		public void setSkillSEt(String skillset)
		this.skillset = skillset;
	}
}