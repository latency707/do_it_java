/*
 * if - else if - else문
 * 하나의 상황에 조건이 여러 개인 경우 if - else if - else 문으로 표현할 수 있음
*/

// if - else if - else 문으로 입장료 계산하기
package ifexample;

public class IfExample2 {
	public static void main(String[] args) {
		int age = 69;
		int charge;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		} 
		
		else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		
		else if (age < 20) {
			charge = 2500;
			System.out.println("중학생입니다.");
		} 
		
		else if (age < 60) {
			charge = 3000;
			System.out.println("성인입니다.");
		}
		
		else {
			charge = 0;
			System.out.println("경로우대입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
	}

	// Q) age 조건이 60세 이상이면 '경로우대입니다.' 와 '입장료는 0원입니다.' 가 출력되도록 수정하시오.
	// A) 완료  
	
}
