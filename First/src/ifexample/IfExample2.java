/*
 * if - else if - else문
 * 하나의 상황에 조건이 여러 개인 경우 if - else if - else 문으로 표현할 수 있음
*/

// if - else if - else 문으로 입장료 계산하기
package ifexample;

public class IfExample2 {
	public static void main(String[] args) {
		int age = 9;
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
		
		else {
			charge = 3000;
			System.out.println("성인입니다.");
		}
	}

}
